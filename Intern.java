package FourthdayJava;

public class Intern implements StudentInterface {
	private int marksSecured;
	private int projectMarks;
	public Intern(int marksSecured,int projectMarks)
	{	
		this.marksSecured=marksSecured;
	}
  public void calcPercentage()
  {
	  int total= this.marksSecured+this.projectMarks;
	  total=total/400;
	  total*=100;
	  System.out.println("The total aggregate percentage secured by the intern is "+total);
  }
}
