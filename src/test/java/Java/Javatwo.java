package Java;

public class Javatwo {

      int id;
      String name;
      char grade;


       void m1(){
            System.out.println("hello");
       }
       void m3(int numm){
            System.out.println(numm);
       }
       String m2(int num){
            return("tehsy " + num);
       }
       void m4(String num){
            System.out.println("Mahesh " + num);
       }

    //Poly
    void m6(){}
    void m2(String a){}
    void m4(int a){}

//Encp
    //all variable should be private
    //for evry variabl there should be 2 method get and set
    //variable can be operated only through method


       private int accno;
       private String name1;

    public char getGrade() { 
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    void setAccno(int acn){
    accno=acn;
}

int getAccnu(){
    return accno;
}




}
