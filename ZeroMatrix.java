import java.util.Scanner;

public class ZeroMatrix {
public static void main(String[] args) {
	ZeroMatrix zeromatrix=new ZeroMatrix();
	int a[][]=new int[4][4];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	zeromatrix.zeroes(a);
}

  void zeroes(int matrix[][])
{
	  boolean row[]=new boolean[matrix.length];
	  boolean column[]=new boolean[matrix[0].length];
	  
	  for(int i=0;i<matrix.length;i++)
	  {
		  for(int j=0;j<matrix[0].length;j++)
		  {
			  if(matrix[i][j]==0)
			  {
				  row[i]=true;
				  column[j]=true;  
			  }
				 
			  
		  }
	  }
	  int i=0;
	  for(i=0;i<matrix.length;i++)
	  {
	  System.out.print(row[i]);
	  System.out.println(i);
	  if(row[i]==true)
	  {
		  for(int k=0;k<matrix[0].length;k++)
		  {
			  matrix[i][k]=0;
		  }
	  }
	  
	  
	  }
		  
		  
	  
	
	  int j=0;
	  for( j=0;j<matrix[0].length;j++)
	  {
		  if(column[j]==true)
		  {
			  for(int k=0;k<matrix.length;k++)
			  {
				  matrix[k][j]=0;
			  }
		  }
		  
		  
	 }
	  
	  for( i=0;i<matrix.length;i++)
	  {
		  for( j=0;j<matrix[0].length;j++)
		  {
			  System.out.print(matrix[i][j]);
		  }
		  System.out.println();
	  }
	  }
	  
	  
	 
	
	 

}