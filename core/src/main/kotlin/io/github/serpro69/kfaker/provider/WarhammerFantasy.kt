package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.GAMES] category.
 */
@Suppress("unused")
class WarhammerFantasy internal constructor(fakerService: FakerService) : YamlFakeDataProvider<WarhammerFantasy>(fakerService) {
    override val yamlCategory = YamlCategory.GAMES
    override val secondaryCategory: Category = Category.ofName("WARHAMMER_FANTASY")
    override val localUniqueDataProvider = LocalUniqueDataProvider<WarhammerFantasy>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory, secondaryCategory)
    }

    fun heroes() = resolve("warhammer_fantasy", "heros")
    fun quotes() = resolve("warhammer_fantasy", "quotes")
    fun locations() = resolve("warhammer_fantasy", "locations")
    fun factions() = resolve("warhammer_fantasy", "factions")
    fun creatures() = resolve("warhammer_fantasy", "creatures")
}
