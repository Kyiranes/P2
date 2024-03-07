import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    static ArrayList<TaskName> tasks = new ArrayList<>();
    public static void main(String[] args) {
        boolean end = false;
        while(!end){
            ArrayList<String> menu = new ArrayList<>();

            menu.add("(0) Add a task.");
            menu.add("(1) Remove a task.");
            menu.add("(2) Update a task.");
            menu.add("(3) List all tasks.");
            menu.add("(4) List all tasks of a certain priority.");
            menu.add("(5) End Process");
            System.out.println(menu);
            int selection = input.nextInt();
            input.nextLine();
            switch (selection) {
                case 0 -> addTask();
                case 1 -> removeTask();
                case 2 -> updateTask();
                case 3 -> listTask();
                case 4 -> listTaskPriority();
                case 5 -> end = true;
                default -> System.out.println("Invalid input");
            }

        }
    }
    private static void listTask() {
        if(!tasks.isEmpty())
            System.out.println(tasks);
        else
            System.out.println("No tasks.");
    }
    private static void listTaskPriority() {
        System.out.println("What is the priority of the tasks you want to list?");
        int priority = input.nextInt();
        for(TaskName task : tasks){
            if(task.getPriority() == priority){
                System.out.println(task);
            }
        }
    }

    private static void updateTask() {
        TaskName task = new TaskName();
        System.out.println(tasks);
        System.out.println("Enter the index of the task to update: ");
        int index = input.nextInt();
        System.out.println("Enter the name, description, and priority(0-5) of the task");
        input.nextLine();
        String name = input.nextLine();
        String description = input.nextLine();
        int priority = input.nextInt();
        input.nextLine();
        task.setName(name);
        task.setDescription(description);
        task.setPriority(priority);
        tasks.set(index, task);
        System.out.println(tasks);

    }

    private static void removeTask() {

        System.out.println(tasks);
        System.out.println("Enter the index of the task to remove: ");
        tasks.remove(input.nextInt());
        input.nextLine();
        System.out.println(tasks);


    }

    public static void addTask() {
        System.out.println("Enter the name, description, and priority(0-5) of the task");
        String name = input.nextLine();
        String description = input.nextLine();
        int priority = input.nextInt();
        input.nextLine();
        TaskName task = new TaskName();
        task.setName(name);
        task.setDescription(description);
        task.setPriority(priority);
        tasks.add(task);

    }
}
