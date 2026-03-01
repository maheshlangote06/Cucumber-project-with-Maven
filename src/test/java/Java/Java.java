package Java;

public class Java {
    public static void main(String[] args) {
//     String s = "mahesh";
//     String rev = "";
//
//     for(int i = s.length()-1; i>=0; i--){
//         rev = rev+ s.charAt(i);
//     }
//
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

        String s = "welcome";
        String rev = "";

        char s1[] = s.toCharArray();
        for (int i = s.length()-1; i>=0; i--){

            rev = rev+ s1[i];

        }System.out.println(rev);

    }
}
