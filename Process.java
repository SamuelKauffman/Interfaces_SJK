
/**
 * @author sam Kauffman
 *
 */
public class Process implements Priority {
	String mProcessID;
	int mPriority;
	
	/**
	 * @param processID
	 */
	public Process(String processID){
		mProcessID = processID;
	}
	
	/**
	 * @param o
	 * @return compareTo
	 */
	public int compareTo(Process o) {
		if(this.getPriority() < o.getPriority()) {
			return -1;
		}
		else if(this.getPriority() > o.getPriority()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	/**
	 * @return processID
	 */
	public String getProcessID() {
		return mProcessID;
	}
	
	/**
	 *interface
	 */
	@Override
	public int getPriority() {
		return mPriority;
	}
	
	/**
	 *interface
	 */
	@Override
	public void setPriority(int priority) {
		mPriority = priority;
	}
	
	/**
	 *toString Method
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("Process \n");
		sb.append("ProcessID: " + getProcessID() + "\n");
		sb.append("Priority: " + getPriority() + "\n");
		return sb.toString();
	}
}
