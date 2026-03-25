package OOP.Polymorphism;

public class PasswordInputElement extends InputElement{
    private char[] allowedCharacters;
    
    public PasswordInputElement(int maxLength, char[] allowedCharacters){
        super(maxLength);
        this.allowedCharacters = allowedCharacters;
    }
    
    @Override
    public boolean validate(){
        if (!super.validate()){
            return false;
        }
    
        String currentVal = getValue();
        for (int i = 0; i < currentVal.length(); i++) {
            char c = currentVal.charAt(i);
            
            boolean found = false;
        
            for (char allowed : allowedCharacters){
                if(c == allowed){
                found = true;
                break;
                }
            }
            if (!found) { 
                return false;
            }
        }
        return true;
    }
}