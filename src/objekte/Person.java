package objekte;

public class Person {

    private final int GEWICHT; //kg

    private final String NAME;
    private final String GESCHLECHT;
    private boolean eingestiegen;
    private Auto benutztesAuto;

    public Person(int a, String b, String c) {

        GEWICHT = a;
        NAME = b;
        GESCHLECHT = c;
    }

    public int getGEWICHT() {
        return GEWICHT;
    }

    public String getNAME() {

        return NAME;
    }

    public boolean einsteigen(Auto a) {
        if (!eingestiegen) {
            a.einsteigen();
            benutztesAuto = a;
            eingestiegen = true;
            return true;
        }
        return false;
    }
    
    public boolean aussteigen() {
        if (eingestiegen) {
            benutztesAuto.aussteigen();
            eingestiegen = false;
            return true;
        }
        return false;
    }
}
