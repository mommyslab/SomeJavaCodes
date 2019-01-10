package FourthdayJava;

public class UndergraduateStudent extends Student{
	UndergraduateStudent(String name)
	{
		//this.setName(name);
		super(name);
	}
	public void generateResult()
	{
		int AvgResult=0;
		int sum=0;
		
		for (int i=0;i<getTest().length;i++)
			sum+= getTest()[i];
		AvgResult=sum/getTest().length;
		if (AvgResult>=60)
		{
			this.setResult("Pass");
		}
		else if(AvgResult<60)
			this.setResult("Fail");
		}
}
