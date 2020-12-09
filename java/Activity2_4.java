package activities;

public class Activity2_4 {
    public String printDetails(int age) {
        if(age<18)
            throw new RuntimeException("Your age "+age+" is not eligible for Vote");
        else
            return "Cheers, Your age "+age+" is Eligible for Vote!";
    }

    public static void main(String args[]) {
        Activity2_4 activity = null;
        try {
            activity = new Activity2_4();
            System.out.println(activity.printDetails(24));
            System.out.println(activity.printDetails(10));
        }catch (Exception e) {
            System.out.println("Exception Occured while executing printDetails "+e);
        } finally {
            System.out.println("Thank you for participating Voting Survey !!!");
        }
    }
}
