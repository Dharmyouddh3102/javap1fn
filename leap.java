import java.util.Scanner;
public class leap {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("enter an year");
        int year = a.nextInt();
        if(year%100==0){
            if(year%400==0){
           System.out.println(" it is a leap year");
        }
        
    }
    else if(year%100!=0){
        if(year%4==0){
           System.out.println(" it is a leap year");
        }

    }
    else{
        System.out.println(" it is not a leap year");
    }
}
}