public class TestPunkt {

    public static void main (String[] args){

        Punkt p1 = new Punkt();

        p1.setX(1); p1.setY(2);

          /* Lassen Sie hier die x- und y-Koordinaten von p1 auf der

          Konsole ausgeben, aber in einer Zeile und durch Komma

          getrennt */

        p1.verschiebe(2,2);

        System.out.println(p1.getX() + ", " + p1.getY()); //Ausgabe: 3

        //System.out.println(p1.getY()); //Ausgabe: 4
        //Verschieben Sie p1 um den Vektor (1,-3)
        p1.verschiebe(1,-3);

        //Lassen Sie die x- und y-Koordinaten von p1 ausgeben
        System.out.println(p1.getX() + ", " + p1.getY()); //Ausgabe: --

        //Erzeugen Sie den zweiten Punkt p2 = (3,5)
        Punkt p2 = new Punkt();
        p2.setX(3);
        p2.setY(5);

        //Verschieben Sie p2 um den Vektor (0,0)
        p2.verschiebe(0,0);
        //Lassen Sie die x- und y-Koordinaten von p2 ausgeben
        System.out.println(p2.getX() + ", " + p2.getY());
        //Erzeugen Sie den dritten Punkt p3 = (2,4)
        Punkt p3 = new Punkt ();
        p3.setX(0);
        p3.setY(0);
        p1.verschiebeUmEins();
        System.out.println(p1.getX() + ", " + p1.getY());
        //neue Methode verschiebe um 1
        System.out.println("Ist Ursprung?: p3 " + p3.istUrsprung() );
    }

}