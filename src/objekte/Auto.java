package objekte;

public class Auto {

    private final String TYP;

    private int geschwindigkeit; //km/h
    private final int ANZTÜREN;
    private final int SITZE;
    private int anzInsassen;

    private final double LÄNGE;  //m
    private final double BREITE; //m
    private final double HÖHE;   //m

    private String farbe;

    public Auto(String m, int g, String f, int t, int s, double l, double b, double h) {

        TYP = m;
        geschwindigkeit = g;
        farbe = f;
        ANZTÜREN = t;
        SITZE = s;
        LÄNGE = l;
        BREITE = b;
        HÖHE = h;

    }

    public boolean bremsen(int geschwindigkeitsverlust) {

        if ((geschwindigkeitsverlust > 0) && (geschwindigkeitsverlust < geschwindigkeit)) {

            geschwindigkeit = geschwindigkeit - geschwindigkeitsverlust;
            return true;
        } else {
            System.out.println("Du bist doof, das geht nicht!");
            return false;
        }
    }

    public boolean gasGeben(int geschwindigkeitszunahme) {

        if (geschwindigkeitszunahme > 0) {

            geschwindigkeit = geschwindigkeit + geschwindigkeitszunahme;
            return true;
        } else {
            System.out.println("Du bist doof, das geht nicht!");
            return false;
        }

    }

    public String getFarbe() {

        return farbe;
    }

    public void umlackieren(String neueFarbe) {
        farbe = neueFarbe;

    }

    public int getGeschwindigkeit() {

        return geschwindigkeit;
    }

    public double getLÄNGE() {
        return LÄNGE;
    }

    public double getBREITE() {
        return BREITE;
    }

    public double getHÖHE() {
        return HÖHE;
    }

    public int getANZTÜREN() {
        return ANZTÜREN;
    }

    boolean einsteigen(){

        if (anzInsassen < SITZE){

            anzInsassen++;
            return true;
        }else {
            return false;
        }
    }

    void aussteigen(){
        
        anzInsassen--;
    }

    public int getAnzInsassen() {

        return anzInsassen;
    }

    public int getSITZE() {

        return SITZE;
    }
}
