import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIntegerArraySorting {

	@Test
	void test() {
		int [] toSort = {3, 5, 1, 2};
		int [] sorted = {1, 2, 3, 5};
		IntegerArraySort.insertionSort(toSort);
		assertArrayEquals(toSort, sorted);
	}

}

