package print_task;

import java.util.*;

public class TaskService {
	
	Deque<Task> allTask=new ArrayDeque<>();
	
	void addTask(Task newTask) {
		allTask.offer(newTask);
		System.out.println("New task added!");
	}
	
	void removeTask() {
		allTask.poll();
		System.out.println("Task removed!");
	}
	
	void showAllTasks() {
		System.out.println("\nAll Tasks: ");
		for(Task t:allTask) {
			System.out.println(t);
		}
	}
	
	Task nextTask() {
		return allTask.peek();
	}
	
	void addUrgentTask(Task newTask) {
		allTask.addFirst(newTask);
		System.out.println("Urgent task added!");
	}
	
}
