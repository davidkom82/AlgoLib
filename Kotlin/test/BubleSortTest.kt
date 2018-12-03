import org.junit.Test
import sorting.BubleSort2
import kotlin.test.assertEquals

class BubleSortTest {
    @Test
    fun `test bublesort with`() {
        val array = arrayOf(4, 7, 1, 9, 1, 7, 2, 9)
        BubleSort2.bubleSort(array)
        array.forEach { print("  $it") }
    }

    @Test
    fun `bublesort with negatives`() {
        val array = arrayOf(-1, -5, 0, 8, 0, 8, 2)
        BubleSort2.bubleSort(array)
        assertEquals(mutableListOf(-5, -1, 0, 0, 8, 8, 2), BubleSort2.bubleSort(array))
    }
}