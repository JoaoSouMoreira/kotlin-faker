package io.github.sergio.igwt.kfaker.provider

import io.github.sergio.igwt.kfaker.Faker
import io.github.sergio.igwt.kfaker.FakerService
import io.github.sergio.igwt.kfaker.dictionary.CategoryName

/**
 * [FakeDataProvider] implementation for [CategoryName.MILITARY] category.
 */
class Military internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.MILITARY

    val armyRank = resolve { fakerService.resolve(Faker, it, "army_rank") }
    val marinesRank = resolve { fakerService.resolve(Faker, it, "marines_rank") }
    val navyRank = resolve { fakerService.resolve(Faker, it, "navy_rank") }
    val airForceRank = resolve { fakerService.resolve(Faker, it, "air_force_rank") }
    val dodPaygrade = resolve { fakerService.resolve(Faker, it, "dod_paygrade") }
}