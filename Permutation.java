import java.util.*;
public class Permutation {
public static void main(String args[])
{
Permutation perm=new Permutation();
System.out.print(perm.checkPermutation("1234","1234"));
}
public boolean checkPermutation(String arr, String str)

{
	if (arr.length()!=str.length())
	{
		return false;
	}
	else
	{
		char[] arrc=arr.toCharArray();
		Arrays.sort(arrc);
		System.out.print(arrc);
		char[] strs=str.toCharArray();
		Arrays.sort(strs);
		System.out.print(strs);
	return (new String(arrc)).equals(new String(strs));
	}
}
}
