package OOP.Inheritance;

public class Pawn extends ChessPiece{
    
    private boolean hasMoved;
    
    public Pawn(boolean isWhite){
        super("Pawn", isWhite);
        this.hasMoved = false;
    }
    
    public void move(boolean isTwoMoves) {
        String color = getIsWhite() ? "White" : "Black";
        
        if(isTwoMoves) {
            if(!hasMoved){
                System.out.println(color + " pawn has moved two steps");
                hasMoved =  true;
            }
        } else {
            System.out.println(color + " pawn has moved one step");
            hasMoved = true;
        }
    }
    
    @Override
    public  String toString(){
        String color = getIsWhite() ? "White" : "Black";
        String status = hasMoved ? "already moved" : "not yet moved";
        return color + " pawn has " + status;
    }
}
