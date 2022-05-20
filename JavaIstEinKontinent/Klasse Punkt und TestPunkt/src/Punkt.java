public class Punkt {

    private int x;

    private int y;

    public void setX (int i) {

        x = i;

    }

    public void setY (int i) {

        y = i;

    }

    public void verschiebe(int deltaX, int deltaY){

        x = x + deltaX;

        y = y + deltaY;

    }

    public int getX(){

        return x;

    }

    public int getY(){

        return y;

    }
    public void verschiebeUmEins() {
        x = x + 1 ;
        y = y + 1 ;
    }
    public boolean istUrsprung() {
        boolean istUrsprung = x == 0 && y == 0 ;
        return istUrsprung;
    }

}