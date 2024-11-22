package service;

public class Validator {

    public static boolean validatePhone(String phone){
        return phone.matches("^0\\d{9}$");
    }

    public static boolean validateEmail(String email){
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }
}