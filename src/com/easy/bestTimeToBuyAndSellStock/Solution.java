/**
 * phoenix Nov 13, 2025
 *
 **/

package com.easy.bestTimeToBuyAndSellStock;

class Solution
{
	public static int maxProfit( int[] prices )
		{
			if ( prices.length < 2 )
				{ return 0; }
			if ( prices.length == 2 & prices[1] >= prices[0] )
				{ return prices[1] - prices[0]; }

			int max = 0, profit = 0, buy = prices[0], next;

			for ( int i = 0; i < prices.length - 1; i++ )
				{

					next = prices[i];
					System.err.println( "buy: " + buy + " next: " + next );
					if ( next < buy )
						{
							buy = next;
							if ( i < prices.length - 2 )
								{
									profit = checkRest( prices, i, buy );
								}

						} else
							{
								if ( i < prices.length - 1 && i > 0 )
									{
										profit = checkRest( prices, i, buy );
									}
							}
					if ( profit > max )
						{
							max = profit;
						}
				}




			return max;
		}

	public static int checkRest1( int[] prices2, int index, int buy )
		{

			int maxSoFar = 0;
			for ( int j = index + 1; index < prices2.length; j++ )
				{
					int sell = prices2[j - 1];

					int profit2 = sell - buy;

					if ( profit2 > maxSoFar )
						{
							maxSoFar = profit2;
						}

				}
			return maxSoFar;
		}

	public static int checkRest(int[] prices, int index, int buy) {
		int maxSoFar = 0;                          // best profit after buying at 'buy'
		for (int j = index + 1; j < prices.length; j++) { // stop before length to avoid OOB
			int sell = prices[j];                  // price on day j
			int profit2 = sell - buy;              // profit if sold on day j
			if (profit2 > maxSoFar)
				{
					maxSoFar = profit2; // keep max profit
				}
		}
		return maxSoFar;                           // return best achievable profit
	}
	public static void main( String[] args )
		{
			int[] prices =
						{ 1, 2, 4 };
			System.out.println( maxProfit( prices ) );
		}
}
