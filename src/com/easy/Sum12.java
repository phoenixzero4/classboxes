/** 
 *  phoenix Nov 5, 2025
 *
 **/

package com.easy;

public class Sum12
{
	public static void findPairs( int[] arr, int target )
		{

			for ( int i = 0; i < arr.length; i++ )
				{

					for ( int j = i; j < arr.length; j++ )
						{
							if ( arr[i] + arr[j] == target )
								{
									System.out.println( arr[i] + " " + arr[j] );
								}
						}
				}
		}

	public static void main( String[] args )
		{

			int[] array =
				{ 4, 5, 7, 10, 2, 8, 15, 20 };
			findPairs( array, 12 );
		}
}
