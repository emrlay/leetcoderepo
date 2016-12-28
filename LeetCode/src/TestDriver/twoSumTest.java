package TestDriver;

import org.junit.Test;

import twoSum_1.*;
import utils.Util;

public class twoSumTest {

	@Test
	public void test() {
		int[] result = Original.twoSum(new int[]{2, 7, 11, 15}, 9);
		Util.printIntArr(result);
		result = Advanced.twoSum(new int[]{2, 7, 11, 15}, 9);
		Util.printIntArr(result);
	}

}
