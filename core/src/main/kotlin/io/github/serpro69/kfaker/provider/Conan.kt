@file:Suppress("unused")

package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.CONAN] category.
 */
class Conan internal constructor(fakerService: FakerService) :
    YamlFakeDataProvider<Conan>(fakerService) {
    override val yamlCategory = YamlCategory.CONAN
    override val localUniqueDataProvider = LocalUniqueDataProvider<Conan>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun characters(): String = resolve("characters")
    fun gadgets(): String = resolve("gadgets")
    fun vehicles(): String = resolve("vehicles")
}

