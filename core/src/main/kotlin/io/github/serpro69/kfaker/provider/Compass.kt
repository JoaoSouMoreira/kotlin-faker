package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.COMPASS] category.
 */
@Suppress("unused")
class Compass internal constructor(fakerService: FakerService) : YamlFakeDataProvider<Compass>(fakerService) {
    override val yamlCategory = YamlCategory.COMPASS
    override val localUniqueDataProvider = LocalUniqueDataProvider<Compass>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    // TODO: 3/7/2019 this needs some custom logic for the resolver function
}
