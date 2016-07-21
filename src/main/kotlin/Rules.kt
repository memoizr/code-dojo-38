
import Outcome.*
import RulesDsl.Outcomes
import RulesDsl.against
import RulesDsl.itWill
import RulesDsl.plays
import RulesDsl.whenever
import Thing.*

class Rules {
    private val rules = whenever(
            Rock     plays against (Lizard itWill Win, Spock itWill Lose, Scissors itWill Win, Paper itWill Lose, Rock itWill Draw),
            Paper    plays against (Lizard itWill Lose, Spock itWill Win, Scissors itWill Lose, Paper itWill Draw),
            Scissors plays against (Lizard itWill Win, Spock itWill Lose, Scissors itWill Draw),
            Spock    plays against (Lizard itWill Lose, Spock itWill Draw),
            Lizard   plays against (Lizard itWill Draw)
    )

    fun play(thing: Thing): Outcomes? = rules[thing]
}