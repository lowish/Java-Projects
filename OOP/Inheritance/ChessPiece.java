package OOP.Inheritance;

public class ChessPiece {
    private String type;
    private boolean isWhite;
    
    public ChessPiece(String type, boolean isWhite){
        this.type = type;
        this.isWhite = isWhite;
    }
    
    public String getType(){
        return type;
    }
    public boolean getIsWhite(){
        return isWhite;
    }
}