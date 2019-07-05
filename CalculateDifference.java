public class CalculateDifference {
//To find difference of sum of square and sum of n natural number
	public int calculateDifferenc(int n)
	{
		int diff=0;
		int sumOfSqr=0;
		int sumOfNtral=0;
		for(int i=1;i<=n;i++)
		{
			sumOfSqr=sumOfSqr+(i*i); //calculate sum of square of n natural number 
		}
		for(int i=1;i<=n;i++)
		{
			sumOfNtral=sumOfNtral+i;
		}
		sumOfNtral=sumOfNtral*sumOfNtral;//squaring the sum natural number;
		diff=sumOfSqr-sumOfNtral; //calculate sum of n natural number 
		return -diff;
	}
}