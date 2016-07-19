interface Result

object True : Result
object False : Result
object None : Result

interface Thing {
    fun beats(paper: Paper): Result
    fun beats(scissors: Scissors): Result
    fun beats(rock: Rock): Result
    fun beats(lizard: Lizard): Result
    fun beats(spock: Spock): Result
}
