import Outcome.*
import Thing.*

class Fight(private val thisThing: Thing) {
    private val rules = whenever(
            Rock     plays against(Lizard itWill Win, Spock itWill Lose, Scissors itWill Win, Paper itWill Lose, Rock itWill Draw),
            Paper    plays against(Lizard itWill Lose, Spock itWill Win, Scissors itWill Lose, Paper itWill Draw),
            Scissors plays against(Lizard itWill Win, Spock itWill Lose, Scissors itWill Draw),
            Spock    plays against(Lizard itWill Lose, Spock itWill Draw),
            Lizard   plays against(Lizard itWill Draw)
    )

    fun against(otherThing: Thing): Result = thisAgainstOther(otherThing) ?: otherAgainstThis(otherThing)!!

    private fun thisAgainstOther(otherThing: Thing) = rules[thisThing]!![otherThing]?.toResult()
    private fun otherAgainstThis(otherThing: Thing) = rules[otherThing]?.get(thisThing)?.toResult()?.opposite()
}
