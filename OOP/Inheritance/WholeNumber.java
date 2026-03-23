package OOP.Inheritance;

public class WholeNumber extends BaseNumber {
    public  WholeNumber(int value){
        super(value);
    }
    
    public void multiply(WholeNumber wholeNumber) {
        this.setValue(this.getValue() * wholeNumber.getValue());;
    }
    @Override
    public String toString(){
        return String.valueOf(this.getValue());
    }
    
}
