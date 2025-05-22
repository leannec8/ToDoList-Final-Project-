//to do list where you input the assignment and date due
//if you input a date, it will return a list of all the assignements you have due on that date
//if you finish an assignment you can remove it from the list

import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        ToDo test = new ToDo();
        test.add("Math", "5-16-25");
        test.add("CSA", "5-17-25");
        test.remove("CSA");
        test.add("AP LANG", "6-21-25");
        test.add("CSA", "6-21-25");
        System.out.println(test.printList());
        System.out.println(test.getAssignments("6-21-25"));
    }
}