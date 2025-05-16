import java.util.ArrayList;

public class ToDo
{
    private ArrayList<String> assignment_names;
    private ArrayList<String> due_dates;

    //constructor which makes an empty ArrayList for names and dates
    public ToDo()
    {
        assignment_names = new ArrayList<String>();
        due_dates = new ArrayList<String>();
    }

    //accessor methods for the ArrayLists
    public ArrayList<String> getAssignmentNames()
    {
        return assignment_names;
    }
    public ArrayList<String> getDueDates()
    {
        return due_dates;
    }

    //adds the assignment name and date onto seperate ArrayList at the same index
    public void add(String assignement, String due_date)
    {
        assignment_names.add(assignement);
        due_dates.add(due_date);
    }

    //utilizes the assignment name to remove it from the names ArrayList
    //also removes corresponding date at the same index in the dates ArrayList
    public void remove(String assignment)
    {
        for (int i = 0; i < assignment_names.size(); i++)
        {
            if (assignment_names.get(i).equals(assignment))
            {
                assignment_names.remove(i);
                due_dates.remove(i);
            }
        }
    }
}