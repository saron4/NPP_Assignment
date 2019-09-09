package L4Assignment.problem5.TestCase;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.Test;
import L4Assignment.*;
import L4Assignment.problem1.MergeString;
import L4Assignment.problem3.RecursiveBinarySearch;

class JunitTest {
	
		public void testBinary() {
			RecursiveBinarySearch bs = new RecursiveBinarySearch();
			int[] arr = {0,2,7,9,17,29};
			assertEquals(bs.recursiveBinarySearch(arr,29,0,6),5);
			assertEquals(bs.recursiveBinarySearch(arr,15,0,6),-1);
		
		}
		@Test
		public void testSort() {
			MergeString ss =new MergeString();
			assertEquals(ss.sortedString("abc", "def"), "abcdef");
			assertEquals(ss.sortedString("ace", "bdf"), "abcdef");
			assertEquals(ss.sortedString("ace", "bdf"), "abcdef");

		}
		

}
	
