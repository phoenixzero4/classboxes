/** 
 *  phoenix Nov 13, 2025
 *
 **/

package easy.bestTimeToBuyStock;

class Solution
	{ // define class as required by LeetCode
		public int maxProfit( int[] prices )
			{ // method to compute maximum profit
				int min = Integer.MAX_VALUE; // track smallest price seen so far
				int best = 0; // track best profit so far
				for ( int p : prices )
					{ // iterate each daily price
						if ( p < min )
							{
								min = p; // update smallest price if current is lower
							}
						int gain = p - min; // compute profit if sell today after buying at min
						if ( gain > best )
							{
								best = gain; // update best profit if current gain is larger
							}
					} // end loop
				return best; // return maximum profit or zero if none
			} // end method
	}
