public class Queen implements Piece {
    Color color; 

    public Queen(Color color){
        this.color = color;
    }

    @Override
    public boolean differentColor(Piece other) {
        return false;
    }

    @Override
    public boolean validMoving(String start, String end) {
        // if (Rook.validMoving(start, end) || Bishop.validMoving(start, end)) {
        //     return truel;
        // }

        char a = start.charAt(0);
        int a1 = (int)a - 65;
        char b = start.charAt(1);
        int a2 = (int)b;
        
        
        char c = end.charAt(0);
        int b1 = (int)a - 65;
        char d = end.charAt(1);
        int b2 = (int)b;

        if ((a1 != b1) && (a2 != b2)) {
            return true;
        }else if (Math.abs(a1 - b1) == Math.abs(a2 - b2)){
            return true;
        }else{
            return false;
        }

        // if (Math.abs(a1 - b1) != Math.abs(a2 - b2)) {
        //     return false;
        // }



        // // TODO Auto-generated method stub
        // return false;
    }


    @Override
    public String getType(){
        return "Queen";
    }

    @Override
    public Color getColor() {
        return null;
    }
    
}
