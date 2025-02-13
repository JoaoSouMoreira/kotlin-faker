package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.HIPSTER] category.
 */
@Suppress("unused")
class Hipster internal constructor(fakerService: FakerService) : YamlFakeDataProvider<Hipster>(fakerService) {
    override val yamlCategory = YamlCategory.HIPSTER
    override val localUniqueDataProvider = LocalUniqueDataProvider<Hipster>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun words() = resolve("words")
}
