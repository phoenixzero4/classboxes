package com.easy;

import java.util.Arrays;

public class SortByBits2 {
	public static int[] sortByBits(int[] arr) {
		Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);

		Arrays.sort(nums, (a, b) -> {
			int bitCountA = Integer.bitCount(a);
			int bitCountB = Integer.bitCount(b);
			if (bitCountA == bitCountB) {
				return a - b;
			} else {
				return bitCountA - bitCountB;
			}
		});

		return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		String newArr = Arrays.toString(sortByBits(arr));
		//	System.err.println( newArr );

		for(int i = 0; i < arr.length; i++) {
			Integer elem = Integer.parseInt( String.valueOf( arr[i] ));
			System.out.println( arr[i] + " has " + Integer.bitCount( elem) + " bits ");	
		}

		System.err.println( Arrays.toString( sortByBits(arr) ) );

	}
}

