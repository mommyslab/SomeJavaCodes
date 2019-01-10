package FourthdayJava;

public abstract class Student {
	private String name;
	private String result;
    private int[] test;
    
    public Student(String name)
    {
    	this.name=name;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int[] getTest() {
		return test;
	}
	public void setTest(int testNumber,int testScore) {
		this.test[testNumber] = testScore;
	}
    
    public abstract void generateResult();
}
