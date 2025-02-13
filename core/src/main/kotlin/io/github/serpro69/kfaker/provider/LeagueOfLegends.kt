package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.GAMES] category.
 */
@Suppress("unused")
class LeagueOfLegends internal constructor(fakerService: FakerService) : YamlFakeDataProvider<LeagueOfLegends>(fakerService) {
    override val yamlCategory = YamlCategory.GAMES
    override val secondaryCategory: Category = Category.ofName("LEAGUE_OF_LEGENDS")
    override val localUniqueDataProvider = LocalUniqueDataProvider<LeagueOfLegends>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory, secondaryCategory)
    }

    fun champion() = resolve("league_of_legends", "champion")
    fun location() = resolve("league_of_legends", "location")
    fun quote() = resolve("league_of_legends", "quote")
    fun summonerSpell() = resolve("league_of_legends", "summoner_spell")
    fun masteries() = resolve("league_of_legends", "masteries")
    fun rank() = resolve("league_of_legends", "rank")
}
