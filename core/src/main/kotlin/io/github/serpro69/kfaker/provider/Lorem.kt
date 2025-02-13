package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.LOREM] category.
 */
@Suppress("unused")
class Lorem internal constructor(fakerService: FakerService) : YamlFakeDataProvider<Lorem>(fakerService) {
    override val yamlCategory = YamlCategory.LOREM
    override val localUniqueDataProvider = LocalUniqueDataProvider<Lorem>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun words() = resolve("words")
    fun supplemental() = resolve("supplemental")

    // currently not supported due to logic for getting raw value for List<List<*>> types
    @Deprecated(level = DeprecationLevel.ERROR, message = "Not fully implemented")
    fun multibyte() = resolve("multibyte")

    fun punctuation() = resolve("punctuation", "")
}
