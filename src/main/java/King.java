public class King extends Piece {
    Color color;

    public King(Color color){
        this.color = color;
    }

    @Override
    public boolean differentColor(Piece other) {
        return false;
    }

    @Override
    public boolean validMoving(String start, String end) {
        //return false;
        char a = start.charAt(0);
       int a1 = (int)a - 65;
       char b = start.charAt(1);
       int a2 = Character.getNumericValue(b) - 1;
       
       
       char c = end.charAt(0);
       int b1 = (int)a - 65;
       char d = end.charAt(1);
       int b2 = Character.getNumericValue(d) - 1;

        if (Math.abs(a1 - b1) > 1 || Math.abs(a2 - b2) > 1){
            return false;
        }
        return true;

    }


    public String getType(){
        return this.getClass().toString();
    }

<<<<<<< HEAD
=======

    @Override
    public Color getColor() {
        return null;
    }
>>>>>>> bb98d0a26f2f94661c3ef3ac9b89045700fd370a
    
}
