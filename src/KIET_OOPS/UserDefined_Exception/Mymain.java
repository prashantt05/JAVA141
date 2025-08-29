package KIET_OOPS.UserDefined_Exception;

public class Mymain {
<<<<<<< HEAD
    public static void main(String[] args) {
=======
    public static void main(String[] args) throws InvalidAgeException {
>>>>>>> origin/main
       UserDefineException udf = new UserDefineException();
       try{
           udf.validate(18);
       } catch (InvalidAgeException e) {
           System.out.println(e.getMessage());
       }
    }
}
