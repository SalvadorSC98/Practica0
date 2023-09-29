fun main() {
    var num = 121
    var reversedNum = 0
    var remainder: Int
    val originalNum: Int

    originalNum = num

    while (num != 0) {
        remainder = num % 10
        reversedNum = reversedNum * 10 + remainder
        num = num / 10
    }

    if (originalNum == reversedNum)
        println("$originalNum es un número capicua.")
    else
        println("$originalNum no es un número capicua.")
}


fun main() {
    val numbers = listOf(2, 4, 6, 6, 8, 8, 8, 3, 10)
    val mean = numbers.sum() / numbers.count()

    println("La media es: $mean")

    val groups = numbers.groupBy { it }
    val modeEntry = groups.entries.maxByOrNull { it.value.size }

    if (modeEntry != null) {
        val mode = modeEntry.key
        println("La moda es: $mode")
    } else {
        println("No hay una moda en la lista.")
    }

    val sortedNumbers = numbers.sorted()
    val size = sortedNumbers.size
    val middleIndex = size / 2
    val median = if (size % 2 == 1) {
        sortedNumbers[middleIndex]
    } else {
        (sortedNumbers[middleIndex - 1] + sortedNumbers[middleIndex]) / 2
    }

    println("La mediana es: $median")
}




fun main() {
    val wordList = listOf("prueba", "pruebaa", "pruebaaa")
    val map = mutableMapOf<String, Int>()
    var i = 0
    var count: Int
    for (word in wordList) {
        count = wordList[i].length
        map[wordList[i]] = count
        i++
    }

    var maxValue = 0
    var maxWord = ""
    for ((key, value) in map) {
        println("$key -> $value")
        if (value > maxValue) {
            maxValue = value
            maxWord = key
        }
    }
    println("La palabra con el valor máximo es: $maxWord con un valor de $maxValue")
}





fun main() {
    val desiredNumber = 63245876
    var num0 = 0
    var num1 = 1
    var fibonacci = 0

    if (desiredNumber == 0) {
        println(num0)
    }
    if (desiredNumber == 1) {
        println(num0)
        println(num1)
    } else {
        println(num0)
        println(num1)
        while (desiredNumber > fibonacci) {
            fibonacci = num1 + num0
            num0 = num1
            num1 = fibonacci
            println(fibonacci)
        }
    }
}





fun main() {
    val word = "Prueba629"
    val alphabet: Map<String, String> = mapOf(
        "A" to "4",
        "B" to "I3",
        "C" to "[",
        "D" to ")",
        "E" to "3",
        "F" to "|=",
        "G" to "&",
        "H" to "#",
        "I" to "1",
        "J" to ",_|",
        "K" to ">|",
        "L" to "1",
        "M" to "/\\/\\",
        "N" to "^/",
        "O" to "0",
        "P" to "|*",
        "Q" to "(_,)",
        "R" to "I2",
        "S" to "5",
        "T" to "7",
        "U" to "(_)",
        "V" to "\\/",
        "W" to "\\/\\/",
        "X" to "><",
        "Y" to "j",
        "Z" to "2",
        "1" to "L",
        "2" to "R",
        "3" to "E",
        "4" to "A",
        "5" to "S",
        "6" to "b",
        "7" to "T",
        "8" to "B",
        "9" to "g",
        "0" to "o"
    )
    val convertedWord = word.uppercase().map { letter ->
        alphabet[letter.toString()] ?: letter.toString()
    }.joinToString("")

    println(convertedWord)
}





fun main() {
    val word = "android"
    val reversedWord = word.reversed()
    val result = word.dropLast(1) + reversedWord
    println(result)
}




fun main() {
    val rules: Map<String, String> = mapOf(
        "tijeras vs papel" to "P1",
        "tijeras vs lagarto" to "P1",
        "tijeras vs tijeras" to "Empate",
        "tijeras vs spock" to "P2",
        "tijeras vs piedra" to "P2",

        "papel vs piedra" to "P1",
        "papel vs spock" to "P1",
        "papel vs papel" to "Empate",
        "papel vs tijeras" to "P2",
        "papel vs lagarto" to "P2",

        "piedra vs lagarto" to "P1",
        "piedra vs tijeras" to "P1",
        "piedra vs piedra" to "Empate",
        "piedra vs papel" to "P2",
        "piedra vs spock" to "P2",

        "lagarto vs spock" to "P1",
        "lagarto vs papel" to "P1",
        "lagarto vs lagarto" to "Empate",
        "lagarto vs piedra" to "P2",
        "lagarto vs tijeras" to "P2",

        "spock vs tijeras" to "P1",
        "spock vs piedra" to "P1",
        "spock vs spock" to "Empate",
        "spock vs lagarto" to "P2",
        "spock vs papel" to "P2"
    )

    val plays: List<String> = listOf(
        "piedra vs piedra",
        "spock vs papel",
        "spock vs papel",
        "spock vs papel",
        "spock vs papel",
        "lagarto vs spock"
    )


    var winsPlayer1 = 0
    var winsPlayer2 = 0
    var tie = 0

    for (play in plays) {
        val playResult = rules[play] ?: ""
        when (playResult) {
            "P1" -> winsPlayer1++
            "P2" -> winsPlayer2++
            "Empate" -> tie++
        }
    }

    val winningPlayer = when {
        winsPlayer1 > winsPlayer2 -> "P1"
        winsPlayer2 > winsPlayer1 -> "P2"
        else -> "Empate"
    }

    println("Game result: P1 $winsPlayer1 - P2 $winsPlayer2 - Empate $tie")
    println("Winning player: $winningPlayer")
}





fun main() {
    val numberList = mutableListOf<Int>()

    for (i in 1..100) {
        numberList.add(i)
    }

    for (number in numberList) {
        if (number % 3 == 0 && number % 5 == 0) {
            println("triplepremio")
        } else if (number % 3 == 0) {
            println("triple")
        } else if (number % 5 == 0) {
            println("premio")
        } else {
            println(number)
        }
    }
}






fun main() {
    var scoreP1 = 0
    var scoreP2 = 0

    val pointSequence = listOf("P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1")

    var advantageP1 = false
    var advantageP2 = false

    val scoreList = mutableListOf<String>()

    for (point in pointSequence) {
        when (point) {
            "P1" -> scoreP1++
            "P2" -> scoreP2++
            else -> {
                println("Entrada de datos inválida: $point")
                return
            }
        }

        val player1Score = scoreToScoreString(scoreP1)
        val player2Score = scoreToScoreString(scoreP2)

        scoreList.add("$player1Score - $player2Score")

        if (scoreP1 >= 3 && scoreP2 >= 3) {
            if (scoreP1 == scoreP2) {
                scoreList.add("Deuce")
                advantageP1 = false
                advantageP2 = false
            } else if (scoreP1 - scoreP2 == 1) {
                scoreList.add("Ventaja P1")
                advantageP1 = true
                advantageP2 = false
            } else if (scoreP2 - scoreP1 == 1) {
                scoreList.add("Ventaja P2")
                advantageP1 = false
                advantageP2 = true
            }
        } else {
            advantageP1 = false
            advantageP2 = false
        }
    }

    if (advantageP1) {
        scoreList.add("Ha ganado el P1")
    } else if (advantageP2) {
        scoreList.add("Ha ganado el P2")
    }

    for (point in scoreList) {
        println(point)
    }
}

fun scoreToScoreString(score: Int): String {
    return when (score) {
        0 -> "Love"
        1 -> "15"
        2 -> "30"
        3 -> "40"
        else -> if (score >= 4) "Ventaja" else score.toString()
    }
}

