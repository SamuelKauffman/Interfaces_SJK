
/**
 * @author sam Kauffman
 * 
 * interface
 *
 */
public interface Priority {
	int MIN_PRIORITY = 1;
	int MED_PRIORITY = 5;
	int MAX_PRIORITY = 10;
	
	public void setPriority(int priority);
	public int getPriority();
}//end interface
