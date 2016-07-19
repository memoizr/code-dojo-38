import org.junit.Assert.assertEquals
import org.junit.Test

class ScissorsTest {
    val self = Scissors()
    @Test
    fun beatsPaper() {
        assertEquals(True, self.beats(Paper()))
    }

    @Test
    fun losesToRock() {
        assertEquals(False, self.beats(Rock()))
    }

    @Test
    fun beatsLizard() {
        assertEquals(True, self.beats(Lizard()))
    }

    @Test
    fun losesToSpock() {
        assertEquals(False, self.beats(Spock()))
    }

    @Test
    fun returnsNoneAgainstSelf() {
        assertEquals(None, self.beats(self))
    }
}

class RockTest {
    val self = Rock()

    @Test
    fun beatsScissors() {
        assertEquals(True, self.beats(Scissors()))
    }

    @Test
    fun losesToPaper() {
        assertEquals(False, self.beats(Paper()))
    }

    @Test
    fun beatsLizard() {
        assertEquals(True, self.beats(Lizard()))
    }

    @Test
    fun losesToSpock() {
        assertEquals(False, self.beats(Spock()))
    }

    @Test
    fun returnsNoneAgainstSelf() {
        assertEquals(None, self.beats(self))
    }
}

class PaperTest {
    val self = Paper()

    @Test
    fun beatsRock() {
        assertEquals(True, self.beats(Rock()))
    }

    @Test
    fun losesToScissors() {
        assertEquals(False, self.beats(Scissors()))
    }

    @Test
    fun losesToLizard() {
        assertEquals(False, self.beats(Lizard()))
    }

    @Test
    fun beatsSpock() {
        assertEquals(True, self.beats(Spock()))
    }

    @Test
    fun returnsNoneAgainstSelf() {
        assertEquals(None, self.beats(self))
    }
}

class LizardTest {
    val self = Lizard()

    @Test
    fun losesToRock() {
        assertEquals(False, self.beats(Rock()))
    }

    @Test
    fun losesToScissors() {
        assertEquals(False, self.beats(Scissors()))
    }

    @Test
    fun beatsPaper() {
        assertEquals(True, self.beats(Paper()))
    }

    @Test
    fun beatsSpock() {
        assertEquals(True, self.beats(Spock()))
    }

    @Test
    fun returnsNoneAgainstSelf() {
        assertEquals(None, self.beats(self))
    }
}

class SpockTest {
    val self = Spock()

    @Test
    fun beatsRock() {
        assertEquals(True, self.beats(Rock()))
    }

    @Test
    fun beatsScissors() {
        assertEquals(True, self.beats(Scissors()))
    }

    @Test
    fun losesToPaper() {
        assertEquals(False, self.beats(Paper()))
    }

    @Test
    fun losesToLizard() {
        assertEquals(False, self.beats(Lizard()))
    }

    @Test
    fun returnsNoneAgainstSelf() {
        assertEquals(None, self.beats(self))
    }
}
