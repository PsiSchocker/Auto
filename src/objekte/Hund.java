package objekte;

public class Hund extends Tiere {

    private final String name;
    private double größe; 
    private String aussehen;

    //Construktor
    public Hund(String name, double größe, String aussehen) {
        this.name = name;
        this.größe = größe;
        this.aussehen = aussehen;
    }
    
    @Override
    public void bewegen() {
        int anzMoeglichkeiten = 4;

        int zufallszahl = (int) ((Math.random() * anzMoeglichkeiten) + 1);

        switch (zufallszahl) {

            case 1: {
                System.out.println("Ist zu faul sich zu bewegen.. trag ihn!");
                break;
            }

            case 2: {
                System.out.println("läuft zu dir und will gestreichelt werden :P");
                break;
            }

            case 3: {
                System.out.println("Hund jagt seinem Schwanz hinterher");
                break;

            }

            case 4:
                System.out.println(" 'Hund macht eine Rolle' ");

        }
    }

    @Override
    public void gerauuscheMachen() {
        System.out.println("Wuff!");
    }

    @Override
    public double getGröße() {
        return größe;
    }

    @Override
    public String getAussehen() {
        return aussehen;
    }

    @Override
    public String getName() {
        return name;
    }
    
    

}
