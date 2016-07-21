object RulesDsl {
    infix fun Thing.plays(that: Outcomes): Pair<Thing, Outcomes> = this to that
    infix fun <T : Thing> T.itWill(outcome: Outcome): Pair<T, Outcome>? = this to outcome

    fun whenever(vararg pairs: Pair<Thing, Outcomes>) = mapOf(*pairs)
    fun against(vararg pairs: Pair<Thing, Outcome>?) = Outcomes(*pairs)

    class Outcomes(vararg pairs: Pair<Thing, Outcome>?) {
        private val map = toMap(*pairs)

        infix fun against(otherThing: Thing): Result? = map[otherThing]?.toResult()

        private fun <K, V> toMap(vararg pairs: Pair<K, V>?) = mapOf(*pairs.filterNotNull().toTypedArray())
    }
}