package chapter7;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(1);
		nums.add(4);
		nums.add(0);
		nums.add(43);
		System.out.println(nums);
		Collections.reverse(nums);
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(Collections.binarySearch(nums, 4));//获取索引
		Collections.shuffle(nums);
		System.out.println(nums);
		
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));
		Collections.replaceAll(nums, 4, 9);
		System.out.println(nums);
		//7.8节的梭哈游戏
	}

}
