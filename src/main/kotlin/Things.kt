sealed class  Result {
    object True : Result() { override fun opposite(): Result = False }
    object False : Result() { override fun opposite(): Result = True }
    object None : Result() { override fun opposite(): Result = None }
    abstract fun opposite(): Result
}

sealed class Thing {
    object Rock : Thing() object Paper : Thing() object Scissors : Thing() object Spock : Thing() object Lizard : Thing()
    fun beats(other: Thing) = Fight(this).against(other)
}

sealed class Outcome {
    object Win : Outcome() { override fun toResult(): Result = Result.True }
    object Lose : Outcome() { override fun toResult(): Result = Result.False }
    object Draw : Outcome() { override fun toResult(): Result = Result.None }
    abstract fun toResult(): Result
}
