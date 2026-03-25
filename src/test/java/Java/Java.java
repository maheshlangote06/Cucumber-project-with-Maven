package Java;

import java.lang.reflect.Array;

public class Java {


    public static void main(String[] args) {
//     String s = "mahesh";
//     String rev = "";
//
//     for(int i = s.length()-1; i>=0; i--){
//         rev = rev+ s.charAt(i);
//     }
       
        String main = "Mahesh langote";
        int count = main.length()-main.replace("M", "").length();
         System.out.println(count);

        int array[] = {12,23,34,56,67,89};

        int max = array[0];

        for (int i=0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }

        System.out.println(max);

//     char a[] = s.toCharArray();
//
//     for (int i = a.length-1;i>=0; i--){
//         rev = rev+ a[i];
//     }
//
//
//       System.out.println(rev);
//        StringBuffer s = new StringBuffer("Welcome");
//        StringBuilder s1 = new StringBuilder("Welcome");
//        System.out.println(s.reverse());
//        System.out.println(s1.reverse());

//        String q = "welcome";
//        String aq = new String("welcome");
//        System.out.println(q==aq);
//        System.out.println(q.equals(aq));

//        String s = "welcome";
//        String rev = "";
//
//        char s1[] = s.toCharArray();
//        for (int i = s.length()-1; i>=0; i--){
//
//            rev = rev+ s1[i];
//
//        }System.out.println(rev);


        Javatwo secondclass = new Javatwo();

        String str = secondclass.m2(22);
        System.out.println(str);
        secondclass.m2(23);

        secondclass.m3(25);
        String strr = new String();

        secondclass.m4("String");

secondclass.setAccno(100);
System.out.println(secondclass.getAccnu());

















    }
}
