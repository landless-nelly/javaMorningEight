package jkl;

public class fileTwo {
    public static void main(String[] args) {
        try {
            System.out.println(56777/0);
        }catch (Exception e){
            System.out.println("noma"+e);
        }finally {
            System.out.println("The try catch finished");
        }
    }
}
