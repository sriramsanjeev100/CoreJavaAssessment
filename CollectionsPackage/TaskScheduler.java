package CollectionsPackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Task
{
    int taskId;
    String taskName;

    public Task(int taskId, String taskName)
    {
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public int getTaskId()
    {
        return taskId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                '}';
    }
}

public class TaskScheduler
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Task> tasks = new LinkedList<>();

        int choice;

        do
        {
            System.out.println("===== TASK SCHEDULER =====");
            System.out.println("1. Add Normal Task");
            System.out.println("2. Add Urgent Task");
            System.out.println("3. Complete Task");
            System.out.println("4. Cancel Task");
            System.out.println("5. Display Pending Tasks");
            System.out.println("6. Search Task");
            System.out.println("7. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Task ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name : ");
                    String name = sc.nextLine();

                    tasks.addLast(new Task(id, name));
                    System.out.println("Normal Task Added.");
                    break;

                case 2:
                    System.out.print("Enter Task ID : ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name : ");
                    name = sc.nextLine();

                    tasks.addFirst(new Task(id, name));
                    System.out.println("Urgent Task Added.");
                    break;

                case 3:
                    if (tasks.isEmpty())
                    {
                        System.out.println("No Tasks Available.");
                    }
                    else
                    {
                        System.out.println(tasks.removeFirst());
                        System.out.println("Task Completed");
                    }
                    break;

                case 4:
                    if (tasks.isEmpty())
                    {
                        System.out.println("No Tasks Available.");
                    }
                    else
                    {
                        System.out.print("Enter Task ID to Cancel : ");
                        int cancelId = sc.nextInt();

                        int i;
                        for (i = 0; i < tasks.size(); i++) {

                            if (tasks.get(i).getTaskId() == cancelId)
                            {
                                tasks.remove(i);
                                System.out.println("Task Cancelled.");
                                break;
                            }
                        }
                    }
                    break;

                case 5:
                    if (tasks.isEmpty())
                    {
                        System.out.println("No Pending Tasks.");
                    }
                    else
                    {
                        System.out.println("===== Pending Tasks =====");
                        for (Task task : tasks)
                        {
                            System.out.println(task);
                        }
                    }
                    break;

                case 6:
                    if (tasks.isEmpty())
                    {
                        System.out.println("No Tasks Available.");
                    }
                    else
                    {
                        System.out.print("Enter Task ID to Search : ");
                        int searchId = sc.nextInt();
                        int i;
                        for (i = 0; i < tasks.size(); i++) {
                            if (tasks.get(i).getTaskId() == searchId) {
                                System.out.println("Task Found:");
                                System.out.println(tasks.get(i));
                                break;
                            }
                        }
                    }

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice!=7);
    }
}
