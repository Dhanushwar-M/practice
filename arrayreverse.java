import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    	    int n=sc.nextInt();
	    int[] a=new int[n];

	    for(int i=0;i<=n-1;i++)
	    a[i]=sc.nextInt();
	   
	    System.out.println("Elements after reversing");
	    for(int i=a.length-1;i>=0;i--)
	    {
	        System.out.println(a[i]);
	    }
	}
}
