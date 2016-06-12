package iit.du.ac.bd;

public class Singleton {
	private static Singleton instance;
	private Singleton() { }
	
	public static Singleton createInstance(){
		if (instance == null)
		{
			synchronized(Singleton.class)
			{
				if (instance == null)
				{
					instance = new Singleton();
				}
			}            
		}

		return instance;
		
	}
	public void showMessage(){
	      System.out.println("Hi Anik!");
	   }

}
