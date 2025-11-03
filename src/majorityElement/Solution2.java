/** 
 *  phoenix Nov 3, 2025
 *
 **/

/**
 * Find the majority element in Linear time and O(1) space complexity Using the "Boyer-Moore Voting"
 * Algorithm
 */

package majorityElement;

class Solution2
	{
		public static int majorityElement( int[] nums )
			{
				int candidate = 0;
				int count = 0;

				for ( int num : nums )
					{
						if ( count == 0 )
							{
								candidate = num;
							}
						count += ( num == candidate ) ? 1 : -1;
					}

				return candidate;
			}
	}
