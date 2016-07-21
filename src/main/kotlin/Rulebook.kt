class Fight(private val thisThing: Thing) {
    private val rules = Rules()
    fun against(otherThing: Thing): Result = tryFightAgainst(otherThing) otherwise { fightInOppositeOrderWith(otherThing) }

    private fun tryFightAgainst(otherThing: Thing) = play(thisThing)?.against(otherThing)
    private fun fightInOppositeOrderWith(otherThing: Thing) = otherThing.againstThis()?.opposite()!!
    private fun Thing.againstThis() = play(this)?.against(thisThing)
    private fun play(thing: Thing) = rules.play(thing)
    private infix fun Result?.otherwise(otherResult: () -> Result) = this ?: otherResult()!!
}
