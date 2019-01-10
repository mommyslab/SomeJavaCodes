package FourthdayJava;

public class Trainee {
	private  int marksSecured;
	 public Trainee(int marksSecured)
	 {
		if(marksSecured>400)
			System.out.print("Please enter the correct marks\r\n" );
		else
		 this. marksSecured= marksSecured;
	 }
	 public void calcPercentage()
	  {
		  int total= this.marksSecured;
		  total=total/400;
		  total*=100;
		  System.out.println("The total aggregate percentage secured by the intern is "+total);
	  }
	}
	
	
	
	
}
