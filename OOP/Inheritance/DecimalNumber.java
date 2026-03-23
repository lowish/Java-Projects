package OOP.Inheritance;

public class DecimalNumber extends BaseNumber {
    
    private int decimalPlaces;
    public DecimalNumber(int value, int decimalPlaces){
        super(value);
        this.decimalPlaces = decimalPlaces;
    }
    
    public int getDecimalPlaces(){
        return decimalPlaces;
    }
    
    public void setDecimalPlaces(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }
    
    public void multiply(DecimalNumber decimalNumber) {
        int newDigits = this.getValue() * decimalNumber.getValue();
        this.setValue(newDigits);
        this.decimalPlaces += decimalNumber.getDecimalPlaces();
    }
    @Override
    public String toString(){
        String resultStr = String.valueOf(this.getValue());
        
        while(resultStr.length() < decimalPlaces){
            resultStr = "0" + resultStr;
        }
        
        return "0." + resultStr;
    }
}