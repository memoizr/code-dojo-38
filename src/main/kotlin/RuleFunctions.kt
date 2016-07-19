fun against(lizard: Pair<Thing.Lizard, Outcome>? = null,
            spock: Pair<Thing.Spock, Outcome>? = null,
            scissors: Pair<Thing.Scissors, Outcome>? = null,
            paper: Pair<Thing.Paper, Outcome>? = null,
            rock: Pair<Thing.Rock, Outcome>? = null) = toMap(rock, paper, scissors, spock, lizard)

fun <K, V> whenever(vararg pairs: kotlin.Pair<K, V>) = mapOf(*pairs)
fun <K, V> toMap(vararg pairs: kotlin.Pair<K, V>?) = mapOf(*pairs.filterNotNull().toTypedArray())

infix fun <A, B> A.plays(that: B): Pair<A, B> = this to that
infix fun <T : Thing> T.itWill(outcome: Outcome): Pair<T, Outcome>? = this to outcome
