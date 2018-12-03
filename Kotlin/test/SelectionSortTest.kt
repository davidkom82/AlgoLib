import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class SelectionSortTest {
    @Test
    fun `is equals with selection sort`() {
        assertEquals(
            mutableListOf(-4, 1, 2, 3, 3, 4, 5, 5, 7),
            SelectionSort.selectionSort(mutableListOf(5, 7, 2, 3, -4, 1, 5, 3, 4))
        )
    }

    @Test
    fun `is NOT equals with selection sort`() {
        assertNotEquals(
            mutableListOf(5, 7, 2, 3, -4, 1, 5, 3, 4),
            SelectionSort.selectionSort(mutableListOf(5, 7, 2, 3, -4, 1, 5, 3, 4))
        )
    }
}