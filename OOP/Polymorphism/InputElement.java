package OOP.Polymorphism;

public class InputElement{
    private int maxLength;
    private String value;
    
    public InputElement(int maxLength){
        this.maxLength = maxLength;
        this.value = "";
    }
    
    public boolean validate(){
        int len = value.length();
        return len >= 1 && len <= maxLength;
    }
    
    public String getValue(){
        return value;
    }
    
    public void setValue(char c){
        if (c == '/'){
            if (value.length() > 0){
                value = value.substring(0, value.length() -1);
            }
        } else {
            
            String oldVal = value;
            value = value + c;
            
            if (!validate()){
                value = oldVal;

        }
    }
}
}
