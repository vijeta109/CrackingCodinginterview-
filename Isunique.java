
/*Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures
Assumption:We assume that the number of unique characters is*/
class Isunique
{
public static void main(String args[])
{
	Isunique a=new Isunique();
	boolean result=a.uni("12344");
	System.out.print(result);
}
public boolean uni(String arr)
   
{
	if(arr.length()>128)
		return false;
	boolean[] chars=new boolean[128];
	for(int i=0;i<arr.length();i++)
	{
		int val=arr.charAt(i);
		if(chars[val])
		{
			return false;
		}
		chars[val]=true;		
	}
	return true;
}

	
}
