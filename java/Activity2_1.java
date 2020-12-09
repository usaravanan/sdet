package activities;

public class Activity2_1 {
    public static void main(String args[]) {
        int[] ages = {10,77,20,44,11,3};
        int temp = 0;
        for(int i=0; i<ages.length; i++) {
            if(ages[i]>=18)
                System.out.println(ages[i]+" is eligible for Vote");
            else
                System.out.println(ages[i]+" is not eligible for Vote");
            temp = temp + ages[i];
        }
        System.out.println("First age in the array "+ages[0]);
        System.out.println("Last age in the array "+ages[ages.length-1]);
        System.out.println("Total count of ages "+temp);

    }
}
