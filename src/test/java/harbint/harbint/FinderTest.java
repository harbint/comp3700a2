package harbint.harbint;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinderTest {

	@Test
	public void test_min() {
		Finder testFinder = new Finder();
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int expectedResult = 1;
		int actualresult = testFinder.findMin(array);
		assertEquals(actualresult,expectedResult);
	}
	@Test
	public void test_max() {
		Finder testFinder = new Finder();
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int expectedResult = 10;
		int actualresult = testFinder.findMax(array);
		assertEquals(actualresult,expectedResult);
	}
	@Test
	public void test_max_null() {
		Finder testFinder = new Finder();
		int array[] = {1};
		array = null;
		Integer expectedResult = null;
		Integer actualresult = testFinder.findMax(array);
		assertEquals(actualresult,expectedResult);
	}
	@Test
	public void test_min_null() {
		Finder testFinder = new Finder();
		int array[] = {1};
		array = null;
		Integer expectedResult = null;
		Integer actualresult = testFinder.findMin(array);
		assertEquals(actualresult,expectedResult);
	}
	@Test
	public void test_max_empty() {
		Finder testFinder = new Finder();
		int array[] = {};
		Integer expectedResult = null;
		Integer actualresult = testFinder.findMax(array);
		assertEquals(actualresult,expectedResult);
	}
	@Test
	public void test_min_empty() {
		Finder testFinder = new Finder();
		int array[] = {};
		Integer expectedResult = null;
		Integer actualresult = testFinder.findMin(array);
		assertEquals(actualresult,expectedResult);
	}
}
