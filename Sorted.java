import java.lang.*; 
import java.io.*; 
import java.util.*;
public class Sorted {
	public int[] getsorted(int arr[],int n)
	{
		int val;
		String str;
		String num;
		int y[];
		y=new int[n];
		int a=0;
		for(int i=0;i<n;i++)
		{
			str="";
			num="";
			str=String.valueOf(arr[i]);
		for(int j=str.length()-1;j>=0;j--)
		{
			num=num+str.charAt(j);
		}
		
		num=num.trim();
		y[i]=Integer.parseInt(num);
		}
		Arrays.sort(y);
	return y;
	}
}