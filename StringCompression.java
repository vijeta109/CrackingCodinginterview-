
public class StringCompression {
public static void main(String[] args) {
	StringCompression stringCompression=new StringCompression();
	String compressed=stringCompression.compress("aaabbbccc");
	System.out.println(compressed);
	
}
 public String compress(String str)
 {
	 StringBuilder compressed=new StringBuilder();
	
	 int i,count=0;
	 
	 for(i=0;i<str.length();i++)
	 {
		 
			 count=count+1;
				
		 
		  if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1))
		 {
			compressed.append(str.charAt(i)); 
			compressed.append(count);
			count=0;
		 }
	 }
	return compressed.toString();
	 
 } 
}
