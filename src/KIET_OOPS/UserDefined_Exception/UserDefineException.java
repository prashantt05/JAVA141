package KIET_OOPS.UserDefined_Exception;

public class UserDefineException {
    public void validate(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Cannot vote,Age is less than 18");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
