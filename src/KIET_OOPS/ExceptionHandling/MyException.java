package KIET_OOPS.ExceptionHandling;
import java.util.*;
public class MyException {
    public static void main(String[] args) {
        int x, y, z = 0;
        Scanner sc = new Scanner(System.in);

        try {
            x =sc.nextInt();
            y = sc.nextInt();
            z = x/y;
            System.out.println("Exception not occur");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
//        catch (Exception e){ // it handles all types of exceptions and it declared directly after try block
//            System.out.println(e.getMessage());
//        }
        finally {//It always executed whether there is a error or not
            System.out.println("Result "+ z);
        }
    }
}
