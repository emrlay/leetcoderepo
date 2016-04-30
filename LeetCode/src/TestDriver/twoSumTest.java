package TestDriver;

import org.junit.Test;

import twoSum_1.Original;

public class twoSumTest {

	@Test
	public void test() {
		int[] result = Original.twoSum(new int[]{2, 7, 11, 15}, 9);
		for (int value :result){
			System.out.println(value);
		}
	}

}
