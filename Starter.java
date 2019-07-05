import java.util.Scanner;
public class Starter {
	public static void main(String args[])
	{
		/*int x;
		Scanner s=new Scanner(System.in);
		CalculateDifference cal=new CalculateDifference(); 
		System.out.println("Enter the natural number for which you want to know the difference");
		x=s.nextInt();
		System.out.println("Difference of sum and square of sum of "+x+" is "+cal.calculateDifferenc(x));
	*/
		int x[];
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		n=s.nextInt();
		x=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number");
			x[i]=s.nextInt();
		}
	Sorted x1=new Sorted();
	x=x1.getsorted(x,n);
	for(int i=0;i<n;i++)
	{
		System.out.println(x[i]);
	}
	}

}