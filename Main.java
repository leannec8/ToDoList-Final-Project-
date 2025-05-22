//to do list where you input the assignment and date due
//if you input a date, it will return a list of all the assignements you have due on that date
//if you finish an assignment you can remove it from the list

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //ToDo test = new ToDo();
        //test.add("Math", "5-16-25");
        //test.add("CSA", "5-17-25");
        //test.remove("CSA");
        //test.add("AP LANG", "6-21-25");
        //test.add("CSA", "6-21-25");
        //System.out.println(test.printList());
        //System.out.println(test.getAssignments("6-21-25"));

        //use scanner to interact with user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old!");
        scanner.close();
    }
}