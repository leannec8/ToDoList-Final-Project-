//to do list where you input the assignment and date due
//if you input a date, it will return a list of all the assignements you have due on that date
//if you finish an assignment you can remove it from the list

public class Main
{
    public static void main(String[] args)
    {
        ToDo test = new ToDo();
        test.add("Math homework", "5-16-25");
        System.out.println(test.getAssignmentNames());
        System.out.println(test.getDueDates());
        test.add("CSA", "5-17-25");
        System.out.println(test.getAssignmentNames());
        System.out.println(test.getDueDates());
        //test.remove("CSA");
        System.out.println(test.getAssignmentNames());
        System.out.println(test.getDueDates());
        System.out.println(test.getAssignments("5-17-25"));
    }
}