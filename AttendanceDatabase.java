import java.util.Scanner;

public class AttendanceDatabase {

    String name;
    String track;
    String aClass;
    String attendance;
    String excuse;
    int points;


    public AttendanceDatabase() {
        Scanner input01 = new Scanner(System.in);
        System.out.print("\nenter first and last name of student: ");
        name = input01.nextLine();

        System.out.printf("what track is %s taking: ", name);
        track = input01.nextLine();

        System.out.printf("what class is %s taking: ", name);
        aClass = input01.nextLine();

        points = 200;

        setAttendance();
    }


    public void setAttendance() {
        Scanner input02 = new Scanner(System.in);
        System.out.printf("what is the attendance of %s: ", name);
        attendance = input02.nextLine();

        if (attendance.contains("absent")) {
            attendance = "absent";
            setExcuse();
        } else if (attendance.contains("not here")) {
            attendance = "absent";
            setExcuse();
        } else {
            attendance = "present";
            System.out.print("thank you!\n\n");
        }
    }

    public void setExcuse() {
        Scanner input03 = new Scanner(System.in);
        System.out.print("enter the reasoning for absence: ");
        excuse = input03.nextLine();

        if (excuse.contains("sick day")) {
            System.out.print("excused, no points removed\n\n");
            addPoints(0);
        } else if (excuse.contains("emergency")) {
            System.out.print("excused, no points removed\n\n");
            addPoints(0);
        } else {
            System.out.print("oops! not a valid excuse!\n\n");
            decreasePoints(20);
        }
    }

    public void addPoints(int a) {
        points += a;

    }

    public void decreasePoints(int d) {
        points -= d;
    }

    public String getName() {
        return name;
    }

    public String getTrack() {
        return track;
    }

    public String getAClass() {
        return aClass;
    }

    public String getAttendance() {
        return attendance;
    }

    public String getExcuse() {
        return excuse;
    }

    public int getPoints() {
        return points;
    }

    public String results() {
        if (attendance.equals("absent")) {
            return "\nname: " + getName() +
                    "\ntrack: " + getTrack() +
                    "\nclass: " + getAClass() +
                    "\nattendance: " + getAttendance() +
                    "\nreasoning: " + getExcuse() +
                    "\ncurrent points: " + getPoints();
        } else if (attendance.equals("present")) {
            return "\nname: " + getName() +
                    "\ntrack: " + getTrack() +
                    "\nclass: " + getAClass() +
                    "\nattendance: " + getAttendance() +
                    "\ncurrent points: " + getPoints();

        }
        else {
            return null; // return nothing basically
        }
    }
}

