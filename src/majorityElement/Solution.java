/**
 * phoenix Nov 3, 2025
 * 
 * Naive approach to finding majority element with TreeMap
 * 
 */

package majorityElement;

import java.util.Map;
import java.util.TreeMap;

public class Solution
{


	public static int majorityElement( int[] nums )
		{
			TreeMap<Integer, Integer> map = new TreeMap<>();

			for ( int i = 0; i < nums.length; i++ )
				{
					int elem = nums[i];
					map.put( elem, map.getOrDefault( elem, 0 ) + 1 );
				}

			int majority = nums[0];
			int maxCount = 0;

			for ( Map.Entry<Integer, Integer> entry : map.entrySet() )
				{
					if ( entry.getValue() > maxCount )
						{
							maxCount = entry.getValue();
							majority = entry.getKey();
						}
				}

			return majority;
		}

	public static void main( String[] args )
		{

			int[] nums =
						{ 3, 2, 3 };
			int answer = majorityElement(nums);

			System.out.println( answer );
		}
}
