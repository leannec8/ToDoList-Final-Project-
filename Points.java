public class Points
{
    private int totalPoints;

    public Points()
    {
        totalPoints = 0;
    }

    //accessor method
    public int getTotalPoints()
    {
        return totalPoints;
    }

    public void addPoints()
    {
        totalPoints = totalPoints + 10;
    }

    //0-100 inclusive you are beginner level
    //101-200 inclusive you are intermediate level
    //201 or greater inclusive you are advanced level
    public String getLevel()
    {
        String level = "";
        if (totalPoints <= 100) level = "Beginner";
        if (totalPoints >= 101 && totalPoints <= 200) level = "Intermediate";
        if (totalPoints >= 201) level = "Advanced";
        return "You are currently at the " + level + " level with a total of " + totalPoints + " points!";
    }
}
