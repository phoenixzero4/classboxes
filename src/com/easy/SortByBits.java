package com.easy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByBits{


	public static List<Integer> sortByBits(int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();

		// Convert the primitive int array to an Integer array for custom sorting
		Integer[] nums = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			nums[i] = arr[i];
			System.out.println( nums[i] );

		}

		// Sort using a custom Comparator

		ArrayList<Integer> list = new ArrayList<>();

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		for ( Integer integer : nums )
			{
				System.out.println(integer );

				if(map.get(Integer.bitCount( integer))  == null) {
					ArrayList<Integer> newList = new ArrayList<>();
					newList.add( Integer.bitCount( integer ) );


					map.put( integer, newList );
				}else {
					ArrayList<Integer> newList = new ArrayList<>();
					newList.add( Integer.bitCount( integer ) );
					map.put( integer, newList );
				}
			}

		for ( Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet() )
			{
				Integer key = entry.getKey();
				ArrayList<Integer> val = entry.getValue();
				for ( Integer integer : val )

					{
						answer.add( integer );

					}
				Collections.sort(answer);
				System.out.println( "Key: " + key + " Val: " + val );

			}
		return answer;
	}

	public static void main( String[] args )
		{
			int[] array = { 0,1,2,3,4,5,6,7,8};
			List<Integer> a = sortByBits(array);
			for ( Integer integer : a )
				{
					System.out.println( a );
				}
		}
}
