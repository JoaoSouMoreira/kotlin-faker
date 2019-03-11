package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.DR_WHO] category.
 */
class DrWho internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.DR_WHO

    val character = resolve { fakerService.resolve(Faker, it, "character") }
    val theDoctors = resolve { fakerService.resolve(Faker, it, "the_doctors") }
    val actors = resolve { fakerService.resolve(Faker, it, "actors") }
    val catchPhrases = resolve { fakerService.resolve(Faker, it, "catch_phrases") }
    val quotes = resolve { fakerService.resolve(Faker, it, "quotes") }
    val villians = resolve { fakerService.resolve(Faker, it, "villians") }
    val species = resolve { fakerService.resolve(Faker, it, "species") }
}
