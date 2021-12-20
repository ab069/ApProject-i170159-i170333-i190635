package businessLogicLayer;

public class Threads extends Thread{
	Threads(String x)
    {
        super(x);
    }
 
    @Override 
    public void run()
    {
        System.out.println("Running. Continue");
    }
	
	
}
