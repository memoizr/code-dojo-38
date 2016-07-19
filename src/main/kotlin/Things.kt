sealed class  Result {
    object True : Result() { override fun opposite(): Result = False }
    object False : Result() { override fun opposite(): Result = True }
    object None : Result() { override fun opposite(): Result = None }
    abstract fun opposite(): Result
}

enum class Thing {
    Rock, Paper, Scissors, Spock, Lizard;

    fun beats(other: Thing) = Fight(this).against(other)
}
