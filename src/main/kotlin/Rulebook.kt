import Outcome.*
import Thing.*

class Fight(private val thisThing: Thing) {
    private val rules = whenever(
            Rock     plays against(Rock itWill Draw, Paper itWill Lose, Scissors itWill Win , Spock itWill Lose , Lizard itWill Win),
            Paper    plays against(null            , Paper itWill Draw, Scissors itWill Lose, Spock itWill Win , Lizard itWill Lose),
            Scissors plays against(null            , null             , Scissors itWill Draw, Spock itWill Lose, Lizard itWill Win),
            Spock    plays against(null            , null             , null                , Spock itWill Draw, Lizard itWill Lose),
            Lizard   plays against(null            , null             , null                , null             , Lizard itWill Draw)
    )

    fun against(otherThing: Thing): Result = thisAgainstOther(otherThing) ?: otherAgainstThis(otherThing)!!

    private fun thisAgainstOther(otherThing: Thing) = rules[thisThing]!![otherThing]?.toResult()
    private fun otherAgainstThis(otherThing: Thing) = rules[otherThing]?.get(thisThing)?.toResult()?.opposite()
}
