import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringArraySorting {

	@Test
	void test() {
		
		String [] toSort = {"c","f","a","b","d"};
		String [] sorted = {"a","b","c","d","f"};
		StringArraySort.arraySort(toSort);
		assertArrayEquals(toSort, sorted);
	}

}

