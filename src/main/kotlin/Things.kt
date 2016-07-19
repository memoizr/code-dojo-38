class Scissors : Thing {
    override fun beats(lizard: Lizard): Result = True
    override fun beats(paper: Paper): Result = True
    override fun beats(rock: Rock): Result = False
    override fun beats(scissors: Scissors): Result = None
    override fun beats(spock: Spock): Result = False
}

class Rock : Thing {
    override fun beats(lizard: Lizard): Result = True
    override fun beats(paper: Paper): Result = False
    override fun beats(rock: Rock): Result = None
    override fun beats(scissors: Scissors): Result = True
    override fun beats(spock: Spock): Result = False
}

class Paper : Thing {
    override fun beats(lizard: Lizard): Result = False
    override fun beats(paper: Paper): Result = None
    override fun beats(rock: Rock): Result = True
    override fun beats(scissors: Scissors): Result = False
    override fun beats(spock: Spock): Result = True
}

class Spock : Thing {
    override fun beats(lizard: Lizard): Result = False
    override fun beats(paper: Paper): Result = False
    override fun beats(rock: Rock): Result = True
    override fun beats(scissors: Scissors): Result = True
    override fun beats(spock: Spock): Result = None
}

class Lizard : Thing {
    override fun beats(lizard: Lizard): Result = None
    override fun beats(paper: Paper): Result = True
    override fun beats(rock: Rock): Result = False
    override fun beats(scissors: Scissors): Result = False
    override fun beats(spock: Spock): Result = True
}

// Rough sketch of a different approach which reduces duplication in logic
class RuleBook {
    val rules = listOf(
            rockBeats(None, True, False),
            paperBeats(null, None, False),
            scissorBeats(null, null, None)
    )

    fun beats(player1: Thing, player2: Thing) = {

    }

    fun rockBeats(rock: Result?, paper: Result?, scissors: Result?) = listOf(rock, paper, scissors)
    fun paperBeats(rock: Result?, paper: Result?, scissors: Result?) = listOf(rock, paper, scissors)
    fun scissorBeats(rock: Result?, paper: Result?, scissors: Result?) = listOf(rock, paper, scissors)
}


