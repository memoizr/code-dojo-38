import Result.*
import Thing.*
import org.junit.Assert.assertEquals
import org.junit.Test

class GameTest {
    @Test
    fun scissorsRules() {
        Scissors willBeat Lizard
        Scissors willBeat Paper
        Scissors willDrawWith Scissors
        Scissors willLoseTo Rock
        Scissors willLoseTo Spock
    }

    @Test
    fun rockRules() {
        Rock willBeat Lizard
        Rock willBeat Scissors
        Rock willDrawWith Rock
        Rock willLoseTo Paper
        Rock willLoseTo Spock
    }

    @Test
    fun paperRules() {
        Paper willBeat Rock
        Paper willBeat Spock
        Paper willDrawWith Paper
        Paper willLoseTo Lizard
        Paper willLoseTo Scissors
    }

    @Test
    fun lizardRules() {
        Lizard willBeat Paper
        Lizard willBeat Spock
        Lizard willDrawWith Lizard
        Lizard willLoseTo Rock
        Lizard willLoseTo Scissors
    }

    @Test
    fun spockRules() {
        Spock willBeat Rock
        Spock willBeat Scissors
        Spock willDrawWith Spock
        Spock willLoseTo Lizard
        Spock willLoseTo Paper
    }
}

private infix fun Thing.willBeat(other: Thing) {
    assertEquals("Was expecting $this to beat $other, but it lost.", True, this.beats(other))
}

private infix fun Thing.willLoseTo(other: Thing) {
    assertEquals("Was expecting $this to lose to $other, but it won.", False, this.beats(other))
}

private infix fun Thing.willDrawWith(other: Thing) {
    assertEquals("Was expecting $this to draw with $other, but the result was different", None, this.beats(other))
}
