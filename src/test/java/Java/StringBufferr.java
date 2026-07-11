package Java;

public class StringBufferr {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();


        sb.append("abcdefghij");
        sb1.append("abcdefghj");

        String rev = String.valueOf(sb.reverse());
        String rev1 = String.valueOf(sb.reverse());

        int capcity = sb.capacity();

        String xx =  sb.toString();

        int check = sb.compareTo(sb1);

        char a = sb.charAt(2);

       String delelt = String.valueOf(sb.delete(1,4));

       System.out.println(rev);
       System.out.println(rev1);
       System.out.println(capcity);
       System.out.println(xx);
       System.out.println(check);
       System.out.println(a);
       System.out.println(delelt);
       
    }
}
