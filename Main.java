//to do list where you input the assignment and date due
//if you input a date, it will return a list of all the assignements you have due on that date
//if you finish an assignment you can remove it from the list

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ToDo test = new ToDo();

        //use scanner to interact with user
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while (i == 1) {
            System.out.println("1. Add, 2. Mark As Done, 3. View A Day's Work, 4. View Total List, or 5. Quit");
            System.out.println("Select one to continue: ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Add"))
            {
                System.out.println("What is the name of the assignment you want to add?");
                String addName = scanner.nextLine();
                System.out.println("When is the due date of that assignment?");
                String addDate = scanner.nextLine();
                test.add(addName, addDate);
                System.out.println("Your assignment has been added!" + "\n");
            }
            else if (choice.equalsIgnoreCase("Mark As Done"))
            {
                System.out.println("What is the name of the assignment you want to mark as done?");
                String removeName = scanner.nextLine();
                test.remove(removeName);
                System.out.println("Your assignment has been marked as done!" + "\n");
            }
            else if (choice.equalsIgnoreCase("View A Day's Work"))
            {
                System.out.println("What day would you like to view?");
                String daysWorkDate = scanner.nextLine();
                System.out.println(test.getAssignments(daysWorkDate) + "\n");
            }
            else if (choice.equalsIgnoreCase("View Total List"))
            {
                System.out.println(test.printList());
            }
            else if (choice.equalsIgnoreCase("Quit"))
            {
                break;
            }
            else System.out.println("This is not an option. Try again." + "\n");
        }
    }
}