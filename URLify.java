
public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URLify u= new URLify();
		String sent="Mr John Smith        ";
		u.urLify(sent.toCharArray(),sent.trim().length());
		

	}  
	/* String urlNew(String url)
	{	String replaceString=url.replace(" ","%20");
	    return replaceString;
	} */
   void urLify(char[] url,int actuallength)
    { int i, spaces=0, index;
    	for(i=0;i<actuallength;i++)
    	{
    		if(url[i]==' ')
    		{
    			spaces++;
    		}
    			
    	}
    	
    	index=actuallength+spaces*2;
    	
    	for(i=actuallength-1;i>=0;i--)
    	{
    		if(url[i]==' ')
    		{
    			url[index-1]='0';
    			url[index-2]='2';
    			url[index-3]='%';
    			index=index-3;
    		}
    		else
    		{
    			url[index-1]=url[i];
    			index=index-1;
    		}
    	}
    	System.out.println(url);
    }
}
