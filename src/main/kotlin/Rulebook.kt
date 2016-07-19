import Result.*
import Thing.*

class Fight(private val thisThing: Thing) {
    private val rules = whenever(
            Rock     plays against(rock = None, paper = False, scissors = True, spock = False, lizard = True),
            Paper    plays against(rock = null, paper = None, scissors = False, spock = True, lizard = False),
            Scissors plays against(rock = null, paper = null, scissors = None, spock = False, lizard = True),
            Spock    plays against(rock = null, paper = null, scissors = null, spock = None, lizard = False),
            Lizard   plays against(rock = null, paper = null, scissors = null, spock = null, lizard = None)
    )

    fun against(otherThing: Thing): Result = thisAgainstOther(otherThing) ?: otherAgainstThis(otherThing)!!

    private fun thisAgainstOther(otherThing: Thing) = rules[thisThing]!![otherThing]
    private fun otherAgainstThis(otherThing: Thing) = rules[otherThing]?.get(thisThing)?.opposite()

    private fun against(rock: Result?, paper: Result?, scissors: Result?, spock: Result?, lizard: Result?) =
            mapOf(Rock to rock, Paper to paper, Scissors to scissors, Spock to spock, Lizard to lizard)
}

private fun <K, V> whenever(vararg pairs: kotlin.Pair<K, V>) = mapOf(*pairs)
private infix fun <A, B> A.plays(that: B): Pair<A, B> = this to that
