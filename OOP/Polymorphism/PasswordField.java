package OOP.Polymorphism;

public class PasswordField {
    public void validate(String password, PasswordInputElement passwordInputElement){
        System.out.println("Validating " + password);
        for (int i = 0; i < password.length(); i++){
            passwordInputElement.setValue(password.charAt(i));
        }
        boolean isValid = passwordInputElement.validate();
        System.out.println("Password validation result: " + isValid);
    }
}