package sorting

fun main(args: Array<String>) {
    val array = arrayOf(4,7,1,9,1,7,2,9)


    print(Faktoroial2.calculateFact(5))

    }

object Faktoroial2 {

    fun calculateFact(number: Int): Int {
        var j = 0
        var sum = 0
        var t = 0
        var prime: MutableList<Boolean> = mutableListOf()
        for (i in 0..number + 1) {
            prime.add(true)
        }
        var result = 1
        for (i in 2..number + 1) {
            if (prime[i]) {
                j = i + i
                while (j <= number) {
                    prime[j] = false
                    j += i
                }
                sum = 0
                t = i
                while (t <= number) {
                    sum += number / t
                    t *= i
                }
                result *= Math.pow(i.toDouble(), sum.toDouble()).toInt()
            }
        }
        return result
    }
}