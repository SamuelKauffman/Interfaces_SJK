
/**
 * @author sam Kauffman
 * @version 1.0
 *
 *
 *Testing the task and priority classes
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task1 = new Task("app");
		task1.setPriority(10);
		task1.setStatus(Task.Status.COMPLETE);
		System.out.println(task1.toString());
		Task task2 = new Task("app2");
		task2.setPriority(5);
		task2.setStatus(Task.Status.COMPLETE);
		System.out.println(task1.compareTo(task2));
		
		Process process1 = new Process("487");
		process1.setPriority(0);
		System.out.println(process1.toString());
		Process process2 = new Process("856");
		process2.setPriority(10);
		System.out.println(process1.compareTo(process2));
		
		
	}//end main

}
