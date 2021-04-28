package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.ADDRESS] category.
 */
@Suppress("unused")
class Address internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Address>(fakerService) {
    override val categoryName = CategoryName.ADDRESS
    override val localUniqueDataProvider = LocalUniqueDataProvider<Address>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun country() = resolve("country")
    fun countryByCode(countryCode: String) = resolve("country_by_code", countryCode)
    fun countryByName(countryName: String) = resolve("country_by_name", countryName)
    fun countryCode() = resolve("country_code")
    fun countryCodeLong() = resolve("country_code_long")
    fun buildingNumber() = with(fakerService) { resolve("building_number").numerify() }
    fun community() = resolve("community")
    fun secondaryAddress() = with(fakerService) { resolve("secondary_address").numerify() }
    fun postcode() = with(fakerService) { resolve("postcode").numerify() }
    fun postcodeByState(state: String) = with(fakerService) { resolve("postcode_by_state", state).numerify() }
    fun state() = resolve("state")
    fun stateAbbr() = resolve("state_abbr")
    fun timeZone() = resolve("time_zone")
    fun city() = resolve("city")
    fun cityName() = resolve("city_name")
    fun cityWithState() = resolve("city_with_state")
    fun streetName() = resolve("street_name")
    fun streetAddress() = with(fakerService) { resolve("street_address").numerify() }
    fun fullAddress() = with(fakerService) { resolve("full_address").numerify() }
    fun mailbox() = with(fakerService) { resolve("mail_box").numerify() }
    fun defaultCountry() = resolve("default_country")
}
