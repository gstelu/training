package practice1;

public class elements {
	public void outer(int a[][],int n, int m)
	{
		System.out.println("OuterElements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				if(i==n&&j==m)
				{
					System.out.print(" ");
				}
				else if((i==n||i==n-1||i==n+1)&&(j==m||j==m-1||j==m+1)) {
					System.out.print(a[i][j]+" ");
				}
				else {
					System.out.println();
				     }
				}
		}
	}
	public static void main(String[] args)
	{
		int a[][]= {{5,2,1,0,0},{1,1,1,3,1},{5,1,0,6,1},{1,8,1,4,1}};
		System.out.println("Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		elements obj =new elements();
		obj.outer(a,3,2);
	}  
}
