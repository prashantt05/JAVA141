package KIET_OOPS.UserDefined_Exception;

public class Mymain {
    public static void main(String[] args) throws InvalidAgeException {
       UserDefineException udf = new UserDefineException();
       try{
           udf.validate(18);
       } catch (InvalidAgeException e) {
           System.out.println(e.getMessage());
       }
    }
}
