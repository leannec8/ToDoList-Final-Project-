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
        //test.add("Math", "5-16-25");
        //test.add("CSA", "5-17-25");
        //test.remove("CSA");
        //test.add("AP LANG", "6-21-25");
        //test.add("CSA", "6-21-25");
        //System.out.println(test.printList());
        //System.out.println(test.getAssignments("6-21-25"));

        //use scanner to interact with user
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while (i == 1) {
            System.out.println("1. Add, 2. Remove, 3. View A Day's Work, 4. View Total List, or 5. Quit");
            System.out.println("Select one to continue: ");
            int choice = scanner.nextInt();
            if (choice == 1)
            {
                System.out.println("What is the name of the assignment you want to add?");
                String addName = scanner.nextLine();
                System.out.println("When is the due date of that assignment?");
                String addDate = scanner.nextLine();
                test.add(addName, addDate);
                System.out.println("Your assignment has been added!");
            }
            if (choice == 2)
            {
                System.out.println("What is the name of the assignment you want to remove?");
                String removeName = scanner.nextLine();
                test.remove(removeName);
                System.out.println("Your assignment has been removed!");
            }
            if (choice == 3)
            {
                System.out.println("What day would you like to view?");
                String daysWorkDate = scanner.nextLine();
                test.getAssignments(daysWorkDate);
            }
            if (choice == 4)
            {
                System.out.println(test.printList());
            }
            if (choice == 5)
            {
                break;
            }
        }

        //System.out.println("Enter your age: ");
        //int age = scanner.nextInt();
        //System.out.println("Hello, " + name + "! You are " + age + " years old!");
        //scanner.close();
    }
}