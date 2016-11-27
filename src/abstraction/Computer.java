package abstraction;

public abstract class Computer implements Tablet  {
	public void screensize(){
		System.out.println("Screen size is small");
		}
	public void powertime(){
		System.out.println("Power time is 7 hours");
	}
	public abstract void sleeptime();
	
	public abstract void speed();
	

}
