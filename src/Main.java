import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean end = false;
        while(!end){
            ArrayList<String> menu = new ArrayList<>();
            ArrayList<TaskName> tasks = new ArrayList<>();
            menu.add("(0) Add a task.");
            menu.add("(1) Remove a task.");
            menu.add("(2) Update a task.");
            menu.add("(3) List all tasks.");
            menu.add("(4) List all tasks of a certain priority.");
            menu.add("(5) End Process");
            System.out.println(menu);
            int selection = input.nextInt();
            switch(selection){
                case 0:
                    addTask(tasks);
                    break;
                case 1:
                    removeTask(tasks);
                    break;
                case 2:
                    updateTask(tasks);
                    break;
                case 3:
                    listTask(tasks);
                    break;
                case 4:
                    listTaskPriority(tasks);
                    break;
                case 5:
                    end = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
    }
    private static void listTask(ArrayList<TaskName> tasks) {
        if(!tasks.isEmpty()) System.out.println(tasks);
        else System.out.println("No tasks.");
    }
    private static void listTaskPriority(ArrayList<TaskName> tasks) {
        System.out.println("What is the priority of the tasks you want to list?");
        int priority = input.nextInt();
        for(TaskName task : tasks){
            if(task.getPriority() == priority){
                System.out.println(task);
            }
        }
    }

    private static void updateTask(ArrayList<TaskName> tasks) {

        System.out.println(tasks);
        System.out.println("Enter the index of the task to update: ");
        int index = input.nextInt();
        input.nextLine();
        System.out.println("Enter the name, description, and priority of the task");
        String name = input.nextLine();
        input.nextLine();
        String description = input.nextLine();
        input.nextLine();
        int priority = input.nextInt();
        TaskName task = new TaskName(name, description, priority);
        tasks.set(index, task);
        System.out.println(tasks);

    }

    private static void removeTask(ArrayList<TaskName> tasks) {

        System.out.println(tasks);
        System.out.println("Enter the index of the task to remove: ");
        tasks.remove(input.nextInt());
        input.nextLine();
        System.out.println(tasks);


    }

    public static void addTask(ArrayList<TaskName> tasks) {
        System.out.println("Enter the name, description, and priority(0-5) of the task");
        String name = input.nextLine();
        input.nextLine();
        String description = input.nextLine();
        input.nextLine();
        int priority = input.nextInt();
        input.nextLine();
        TaskName task = new TaskName(name, description, priority);
        tasks.add(task);
        System.out.println(tasks);
    }
}
