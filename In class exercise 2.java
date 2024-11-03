//in class extercise 2 for csc222
//veron kotey
//9/15/24



import java.util.*;

class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the number of male students: ");
        int male = keyboard.nextInt();
        
        System.out.print("Enter the number of female students: ");
        int female = keyboard.nextInt();
        
        int total = male + female;
        
        double malePercent = male * 100.0 / total;
        double femalePercent = female * 100.0 / total;
        
        System.out.println("Male student percentage: " + malePercent + "%");
        System.out.println("Female student percentage: " + femalePercent + "%");
    }
}