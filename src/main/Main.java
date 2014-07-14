package main;

import objekte.Auto;
import objekte.Hund;
import objekte.Person;

public class Main {
    
    public static void main(String[] args) {
        
        Auto opelAstra = new Auto ("Opel Astra", 200, "Silber", 5, 5, 3.4, 1.8, 1.6);
        Auto smart = new Auto ("Smart", 100, "gelb", 3, 2, 2.0, 1.7, 1.5);
        
        Person eddi = new Person (86, "Eddi", "männlich");
        Person paula = new Person (67, "Paula", "weiblich");
        Person lisa = new Person (28, "Lisa", "weiblich");
        
       
        if(lisa.einsteigen(smart)){
        
            System.out.println("Ist eingesteigen");
        }
        if(lisa.aussteigen()){
        
            System.out.println("Ist ausgestiegen");
        }
        
        Hund eyka = new Hund("Eyka", 0.75, "4 Pfoten schwarzes Fell und einen Wedelschwanz.");
        
        System.out.println(eyka.getName() + " ist "  + eyka.getGröße() + " Meter groß und hat "
                           + eyka.getAussehen());
        
//        
//        for (int i = 0; i < opelAstra.getAnzInsassen(); i++){
//            
//            System.out.print(opelAstra.getInsassen()[i].getNAME()+" ,");
//        }
//        System.out.println(" sitzen im Opel");


//System.out.println("Opel Astra_Wer hockt in dem Auto?: ");
//        
//        System.out.println("Opel Astra Farbe: "+opelAstra.getFarbe());
//        System.out.println("Smart Geschwindigkeit: "+smart.getGeschwindigkeit());
//        System.out.println("Smart Türen: "+smart.getANZTÜREN());
//        
//        if (smart.bremsen(10)){
//            System.out.println("Smart bremst.. Geschwindigkeit: "+smart.getGeschwindigkeit());
//        }
//        
//        if (opelAstra.gasGeben(10)){
//            System.out.println("Opel gibt Gas: "+opelAstra.getGeschwindigkeit());
//        }
//        opelAstra.umlackieren("rot");
//        System.out.println("Opel Astra neue Farbe: "+opelAstra.getFarbe());
//        
//        System.out.println("Länge vom Opel: "+opelAstra.getLÄNGE());
//        
//        eyka.bewegen();
    }
    
}
