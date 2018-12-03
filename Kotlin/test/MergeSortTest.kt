import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class MergeSortTest {

    @Test
    fun `mergesort`() = assertEquals(
        mutableListOf(2, 3, 5, 6, 6, 7, 8, 9, 55),
        MergeSort.mergeSort(mutableListOf(2, 3, 6, 55, 6, 9, 8, 7, 5))
    )

    @Test
    fun `mergesort with correct input`() = assertEquals(
        mutableListOf(2, 3, 5, 6, 6, 7, 8, 9, 55),
        MergeSort.mergeSort(mutableListOf(2, 3, 5, 6, 6, 7, 8, 9, 55))
    )

    @Test
    fun `merge test`() {
        assertEquals(
            mutableListOf(3, 5, 5, 3, 5, 5, 6, 7, 89, 5, 5),
            MergeSort.merge(mutableListOf(5, 5, 3, 5, 5), mutableListOf(3, 6, 7, 89, 5, 5))
        )
    }

    @Test
    fun `merge test with 2 input not equals`() {
        assertNotEquals(
            mutableListOf(3, 5, 5, 3, 5, 5, 6, 7, 89, 5, 5),
            MergeSort.merge(mutableListOf(5, 5), mutableListOf(3, 6, 7))
        )
    }

    @Test
    fun `merge with differet array size`() {
        assertEquals(
            mutableListOf(3, 5, 6, 7),
            MergeSort.merge(mutableListOf(5), mutableListOf(3, 6, 7))
        )
    }
}