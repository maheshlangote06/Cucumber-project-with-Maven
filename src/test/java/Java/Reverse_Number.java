package Java;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Provide new Value - "   );
        int number = SC.nextInt();
//
//        int rev = 0;
//
//        while (number!=0){
//            rev = rev*10 + number%10; //0+2=2 - 20
//            number = number/10;       //12/10=1 - 0
//        }
//        System.out.println(rev); //

        StringBuffer SB = new StringBuffer(String.valueOf(number));
        StringBuffer rev = SB.reverse();
        System.out.println(rev);
    }

}
