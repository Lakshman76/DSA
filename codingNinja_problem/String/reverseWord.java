// Question link - https://www.codingninjas.com/studio/problems/reverse-words-in-a-string_696444?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// solution -

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution 
{
	public static String reverseString(String str) 
	{
		str = str.trim();

        List<String> stringList = Arrays.asList(str.split("\\s+"));

        Collections.reverse(stringList);
		
        return String.join(" ",stringList);
	}
}
