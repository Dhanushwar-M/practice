import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    	    int n=sc.nextInt();
	    int[] a=new int[n];

	    for(int i=0;i<=n-1;i++)
	    a[i]=sc.nextInt();
	    int temp;
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=1;j<a.length;j++)
	        {
	            temp=a[i];
	            a[i]=a[j];
	            a[j]=temp;
	        }
	    }
	    System.out.println("Elements after sorting");
	    for(int i=0;i<a.length;i++)
	    {
	        System.out.println(a[i]);
	    }
	}
}
