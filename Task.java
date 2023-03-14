
/**
 * @author sam Kauffman
 * enum
 *
 */
public class Task implements Priority, Comparable<Task> {
	enum Status {
		NOT_STATUS,
		IN_PROCESS, 
		COMPLETE
	}

	String mName;
	int mPriority;
	Status mStatus;

	/**
	 * @param name
	 */
	public Task(String name) {
		mName = name;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return mName;
	}
	
	/**
	 * @param status
	 */
	public void setStatus(Status status) {
		mStatus = status;
	}
	
	/**
	 * @return Status
	 */
	public Status getStatus() {
		return mStatus;
	}

	/**
	 *sets priority
	 */
	@Override
	public void setPriority(int priority) {
		mPriority = priority;
	}

	/**
	 *interface
	 */
	@Override
	public int getPriority() {
		return mPriority;
	}
	
	/**
	 *toString
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("Task \n");
		sb.append("Name: " + getName() + "\n");
		sb.append("Priority: " + getPriority() + "\n");
		sb.append("Status: " + getStatus() + "\n");
		return sb.toString();
	}
	/**
	 * @param o
	 * @return compareTo
	 */
	public int compareTo(Task o) {
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

}
