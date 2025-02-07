package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.SUBSCRIPTION] category.
 */
@Suppress("unused")
class Subscription internal constructor(fakerService: FakerService) : YamlFakeDataProvider<Subscription>(fakerService) {
    override val yamlCategory = YamlCategory.SUBSCRIPTION
    override val localUniqueDataProvider = LocalUniqueDataProvider<Subscription>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun plans() = resolve("plans")
    fun statuses() = resolve("statuses")
    fun paymentMethods() = resolve("payment_methods")
    fun subscriptionTerms() = resolve("subscription_terms")
    fun paymentTerms() = resolve("payment_terms")
}
