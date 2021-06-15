
public class OneAway {
	public static void main(String args[])
	{
		OneAway oneaway=new OneAway();
		boolean edit=oneaway.oneedit("pale","bae");
		System.out.println(edit);
		
	}

	boolean oneedit(String word1, String word2) {
		// TODO Auto-generated method stub
		int count_notsame=0;
		boolean flag=false;
		char[] word1char=word1.toCharArray();
		char[] word2char=word2.toCharArray();
		if(word1.length()==word2.length())
		{
		for(int i=0;i<word1.length();i++) 
		{
			if(word1char[i]!=word2char[i])
			{
				count_notsame++;
			}
			else
			{
				continue;
			}
		}
		if(count_notsame>1)
		{
			flag=false;
			
		}
		else
		{
			flag=true;
		}
		}
		if(word1.length()>word2.length())
		{
			int i=0,j=0;
		while(i<word1.length() && j<word2.length()) 
		{
			if(word1char[i]!=word2char[j])
			{	i++;
				count_notsame++;
			}
			else
			{	i++;
				j++;
			}
		}
		if(count_notsame>1)
		{
			flag=false;
		}
		else
		{
			flag=true;
		}
		}
		return flag;
	}

}
