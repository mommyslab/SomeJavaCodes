package FourthdayJava;

public class MyMath {
public double mean(int... nums)
{
	int sum=0;
	for(int i =0;i<nums.length;i++)
		sum+=nums[i];
	double mean=sum/nums.length;
	System.out.print("Mean is " +mean);
	return mean;
	}
public void deviation(int... nums)
{
	double findMean=mean(nums);
	double sum=0;
	for (int i=0;i<nums.length;i++)
	{
		sum+=pow((nums[i]-findMean),2);}
	double deviation=(1/nums.length)*sum;
	System.out.print("Standard Deviation is "+ deviation);
	}

}
