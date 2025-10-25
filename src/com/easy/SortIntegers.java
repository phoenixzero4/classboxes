package com.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortIntegers
{

	/** 
	 * You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two
	 * or more integers have the same number of 1's you have to sort them in ascending order.
	 * 
	 * Return the array after sorting it.
	 */



	public static int[] sortByBits(int[] arr) {
		List list = new ArrayList<Integer>();
		List outerList = new ArrayList<List<Integer>>();

		int max = 0, ones;

		for(int i = 0; i < arr.length; i++) {

			String binaryString = Integer.toBinaryString( arr[i] );
			System.out.println( binaryString + " " + arr[i]);
			ones  = Integer.bitCount( arr[i] );




			public static void main( String[] args )
				{

					int[] array = { 0,1,2,3,4,5,6,7,8};
					sortByBits(array);


				}

		}
