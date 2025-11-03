package com.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class SortIntegers
{

	/** 
	 * You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two
	 * or more integers have the same number of 1's you have to sort them in ascending order.
	 * 
	 * Return the array after sorting it.
	 */



	public static void sortByBits(int[] arr) {
		ArrayList list = new ArrayList<Integer>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();


		int max = 0, ones = 0;

		for(int i = 0; i < arr.length; i++) {

			String binaryString = Integer.toBinaryString( arr[i] );
			System.out.println( binaryString + " " + arr[i]);
			ones  = Integer.bitCount( arr[i] );

			if(ones >= max) {
				max = ones;
			}


		}
		for(int i = 0; i <= max; i++) {
			map.put( i,  new ArrayList<Integer>() );
		}

		for(int i = 0; i <= max; i++) {
			int count = Integer.bitCount( arr[i] );
			ArrayList<Integer> l = map.get( count );



			l.add( arr[i] );	
			for(Integer e: l) {
				System.out.println( "List at " + count + " contains " + e );
			}
			map.put( count, l);
		}
		System.out.println( map );		

	}
	public static void main( String[] args )
		{

			int[] array = { 0,1,2,3,4,5,6,7,8};
			sortByBits(array);


		}

}
