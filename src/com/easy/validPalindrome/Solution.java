/** 
 *  phoenix Nov 8, 2025
 *
 **/

package com.easy.validPalindrome;

public class Solution
{
	public boolean isPalindrome( String s )
		{

			s = s.replaceAll( "[^a-zA-Z0-9]", "" ).toLowerCase();

			System.err.println( s );

			for ( int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j-- )
				{
					if ( s.charAt( i ) != s.charAt( j ) )
						{ return false; }
				}
			return true;
		}

	public static boolean isPalindrome2( String s )
		{

			s = s.replaceAll( "[^a-zA-Z0-9]", "" ).toLowerCase();

			int i = 0, j = s.length() - 1;
			while ( i < j )
				{
					if ( s.charAt( i++ ) != s.charAt( j-- ) )
						{ return false; }

				}
			return true;
		}

	public static void main( String[] args )
		{

			String a = "A man, a plan, a canal: panama";
			String b = "a";
			String c = " ";
			String d = "0P";

			Solution s = new Solution();
			System.out.println( isPalindrome2( a ) );
			System.out.println( isPalindrome2( b ) );
			System.out.println( isPalindrome2( c ) );
			System.out.println( isPalindrome2( d ) );

		}
}
