public class TeilerVielfaches {
    public static int ggTrekursiv(int x, int y){
        if (y==0) return x;
        // wenn die Zahlen gleich oder y ==0; gib x aus
        else return ggTrekursiv(y,x%y);
        //return ist, dass die Werte y und x%y wieder in die Methode hinein geschüttet werden. Diese werden auf die Abbruchbedingung geprüft
        //nehmen wir mal x33,y33
        //Beispiel ggtrekursiv(33, 33%33) return in Zeile 5, geschüttet wird das  in Zeile 2 mit 33, 0<---- ABBRUCH ALARM in Zeile 3. Return x. x==33
        }

    public static void main (String[]args){
        int x = 99;
        int y = 99;
        System.out.println(ggTrekursiv(x,y));
    }
}
