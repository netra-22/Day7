package print_task;
import java.util.*;
public class TaskSchedule {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TaskService s1=new TaskService();
		
		int ch;
		do {

			System.out.println("\n1.Add Task\n2.Remove Task\n3.Show all Task\n4.Show Next Task\n5.Add Urgent Task\n6.Exit");
			System.out.println("\nEnter your choice: ");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter task id: ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter task name: ");
				String task=sc.nextLine();
				
				Task t=new Task(id, task);
				s1.addTask(t);
				break;
			
			case 2: 
				s1.removeTask();
				break;
			
			case 3: 
				s1.showAllTasks();
				break;
			
			case 4: 
				System.out.println("Next Task: "+s1.nextTask());
				break;
			
			case 5:
				System.out.println("Enter urgent task id: ");
				int u_id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter urgent task name: ");
				String u_task=sc.nextLine();
				Task u_t=new Task(u_id, u_task);
				s1.addUrgentTask(u_t);
				break;
				
			case 6:
				System.out.println("Thanks for using Task Services!");
			}
			
		}while(ch!=6);

	}

}
