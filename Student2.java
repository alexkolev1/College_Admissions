import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Student2
{

    //initiate variables here
    private static String school;
    private static double gpa;
    private static String actsat;
    private static int actscore;
    private static int satscore;
    private static String sports;
    private static String extracurricular;
    private static int volhours;
    /*
    the method that runs everything
    */
    public static void main(String [] args)
    {
        start();
    }


    /*
    Starting method that leads to the rest of the methods and also initializes school
    */
    public static void start()
    {

        Scanner schoolScan = new Scanner(System.in);
        System.out.println("\n\nWhat type of school are you planning on attending? (Community College, 4 Year College, Ivy League)");
        school = schoolScan.nextLine();
        if(getSchool().equals("Community College") || getSchool().equals("4 Year College") || getSchool().equals("Ivy League"))
        {
            gpa();
        }
        else
        {
            System.out.println("Invalid data has been entered");
            System.exit(0);
        }
    }

    /* 
    method that initializes gpa
    */
    public static void gpa()
    {
        Scanner gpaScan = new Scanner(System.in);
        System.out.println("\n\nWhat is your gpa? (on a 5.0 scale)");
        gpa = gpaScan.nextDouble();
        if(gpa > 5 || gpa < 0)
        {
            System.out.println("Invalid data has been entered");
        }
        else
        {
            actSat();
        }
    }
    /*
     method that initializes what test you took
    */
    public static void actSat()
    {
        Scanner actSatScan = new Scanner(System.in);
        System.out.println("\n\nDid you take the ACT or SAT (if you took both enter whichever one you got a better score on)");
        actsat = actSatScan.nextLine();
        if(actsat.equals("ACT"))
        {
            act();
        }
        else if(actsat.equals("SAT"))
        {
            sat();
        }
        else
        {
            System.out.println("Invalid data has been entered");
            System.exit(0);
        }
    }

    /*
    Method that initializes what your sat score is
    */
    public static void sat()
    {
        Scanner satScan = new Scanner(System.in);
        System.out.println("\n\nWhat is your SAT Score?");
        satscore = satScan.nextInt();
        if(satscore > 1600 || satscore < 400)
        {
            System.out.println("Invalid data has been entered");
            System.exit(0);
        }
        else
        {
            sports();
        }
    }

    /*
    Method that initializes what your act score is
    */
    public static void act()
    {
        Scanner actScan = new Scanner(System.in);
        System.out.println("\n\nWhat is your ACT Score?");
        actscore = actScan.nextInt();
        if(actscore > 36 || actscore < 1)
        {
            System.out.println("Invalid data has been entered");
            System.exit(0);
        }
        else
        {
            sports();
        }
    }

    /*
    Method that initializes what sport you play
    */
    public static void sports()
    {
        try
        {
        Scanner sportScan = new Scanner(System.in);
        String sportsList [] = {" Cheer", " Cross Country", " Field Hockey", " Football", " Golf", " Soccer", " Tennis", " Volleyball", " Basketball", " Bowling", " Gymnastics", " Ice Hockey", " Swim", " Wrestling", " Baseball", " Lacross", " Softball", " Track", "None"};
        System.out.println("\tSports List:" + "\n\n " + "1." + sportsList [0] + " | " + "2." + sportsList[1] + " | " + "3." + sportsList[2] + "\n\n " + "4." + sportsList[3] + " | " + "5." + sportsList[4] + " | " + "6." + sportsList[5] + "\n\n " + "7." + sportsList[6] + " | " + "8." + sportsList[7] + " | " + "9." + sportsList[8] + "\n\n " + "10." + sportsList[9] + " | " + "11." + sportsList[10] + " | " + "12." + sportsList[11] + "\n\n " + "13." + sportsList[12] + " | " + "14." + sportsList[13] + " | " + "15." + sportsList[14] + "\n\n " + "16." + sportsList[15] + " | " + "17." + sportsList[16] + " | " + "18." + sportsList[17] + "\n\n");
        System.out.println("\n\nWhat sport do you play (enter the number that is located on the left of the sport on the list above and 0 if you dont do a sport)");
        int sportNumber = sportScan.nextInt();
        if(sportNumber == 0)
        {
            sports = "None";
        }
        for(int i = sportNumber; i < sportNumber; i++)
        {
            sports = sportsList[i];
        }
        }
        catch(Exception e)
        {
            System.out.println("Invalid data has been entered");
        }
        finally
        {
            extracurricular();
        }
    }

    /*
    Method that initializes what extracurricular you do
    */
    public static void extracurricular()
    {
        try
        {
        Scanner extracurricularScan = new Scanner(System.in);
        String extraList [] = {"Art Club", "Black Empowerment", "Journalism", "Class Cabinet", "Programming Club", "Drama", "Entrepreneurs Club", "French", "German", "Service Club", "Band", "Math", "Art", "Business", "Orchestra", "Ambassadors", "Robotics", "Science", "Choir", "Ski", "Spanish", "Student Council", "Yearbook", "None"};
        System.out.println("\tSports List:" + "\n\n" + "1. " + extraList[0] + " | " + "2. " + extraList[1] + " | " + "3. " + extraList[2] + "\n\n " + "4. " + extraList[3] + " | " + "5. " + extraList[4] + " | " + "6. " + extraList[5] + "\n\n " + " 7. " + extraList[6] + " | " + "8. " + extraList[7] + " | " + "9. " + extraList[8] + "\n\n " + "10. " + extraList[9] + " | " + "11. " + extraList[10] + " | " + "12. " + extraList[11] + "\n\n " + "13. " + extraList[12] + " | " + "14. " + extraList[13] + " | " + "15. " + extraList[14] + "\n\n " + "16. " + extraList[15] + " | " + "17. " + extraList[16] + " | " + "18. " + extraList[17] + "\n\n " + "19. " + extraList[18] + " | " + "20. " + extraList[19] + " | " + "21. " + extraList[20] + "\n\n " + "22. " + extraList[21] + " | " + "23. " + extraList[22]);
        System.out.println("\n\nWhat extracurricular's do you do (enter the number that is located on the left of the extracurricular on the list above and 0 if you dont do a extracurricular)");
        int extracurricularNumber = extracurricularScan.nextInt();
        if(extracurricularNumber == 0)
        {
            extracurricular = "None";
        }
        for(int i = extracurricularNumber; i < extracurricularNumber; i++)
        {
            extracurricular = extraList[i];
        }
        }
        catch(Exception e)
        {
            System.out.println("Invalid data has been entered");
        }
        finally
        {
            volHours();
        }
    }

    /*
    Method that initializes how many volunteer hours you have completed
    */ 
    public static void volHours()
    {
        
        Scanner volHoursScan = new Scanner(System.in);
        System.out.println("\n\nHow many hours have you volunteered?");
        volhours = volHoursScan.nextInt();
        review();
    }

    /*
    The Main review of all the information inputed and gives you a result
    */
    public static void review()
    {
        if(getSchool().equals("Community College"))
        {
            System.out.println("\n\nCongrats you have been accepted!");
            System.exit(0);
        }
        else if(getSchool().equals("4 Year College"))
        {
            if(gpa >= 3.0 && (actscore >= 24 || satscore >= 1000) && (sports != "None" || extracurricular != "None")  && volhours >= 40)
            {
                System.out.println("\n\nCongrats you have been accepted!");
                System.exit(0);
            }
            else
            {
                System.out.println("\n\nIm sorry to tell you that you have not been accepted");
                System.exit(0);
            }
        }
        else if(getSchool().equals("Ivy League"))
        {
            if(gpa >= 4.2 && (actscore >= 34 || satscore >= 1500) && (sports != "None" || extracurricular != "None") && volhours >= 100)
            {
                System.out.println("\n\nCongrats you have been accepted!");
                System.exit(0);
            }
            else
            {
                System.out.println("\n\nIm sorry to tell that you have not been accepted");
                System.exit(0);
            }
        }
    }

    public static String getSchool()
    {
        return school;
    }

    public static double getGpa()
    {
        return gpa;
    }

    public static String getActSat()
    {
        return actsat;
    }

    public static int getActScore()
    {
        return actscore;
    }

    public static int getSATScore()
    {
        return satscore;
    }

    public static String getSports()
    {
        return sports;
    }

    public static String getExtracurricular()
    {
        return extracurricular;
    }

    public static int getVolHours()
    {
        return volhours;
    }
}