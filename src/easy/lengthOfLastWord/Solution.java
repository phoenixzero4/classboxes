/** 
 *  phoenix Nov 7, 2025
 *
 **/

package easy.lengthOfLastWord;

public class Solution
{

	public static int lengthOfLastWord( String s )
		{

			String[] array = s.split( " " );
			int x = array[array.length - 1].length();
			return x;
		}

	public static int lengthOfLastWord2( String s )
		{
			int length = 0, i = s.length() - 1;

			while ( i >= 0 && s.charAt( i ) == ' ' )
				{
					i--;
				}

			while ( i >= 0 && s.charAt( i ) != ' ' )
				{
					length++;
					i--;
				}
			System.out.println( length );
			return length;
		}

	public static void main( String[] args )
		{
			String s1 = "Hello World";
			String s2 = "    fly me   to    the moon  ";
			String s3 = "luffy is still joyboy";

			lengthOfLastWord2( s1 );
			lengthOfLastWord2( s2 );
			lengthOfLastWord2( s3 );
		}
}
