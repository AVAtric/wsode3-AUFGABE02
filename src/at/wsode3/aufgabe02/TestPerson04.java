package at.wsode3.aufgabe02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Test-Klasse um die Funktionsweise von der Klasse Person04 zu untersuchen
 */
public class TestPerson04 {
    /**
     * Dient zum Testen der Personenklassen
     *
     * @param args Es werden keine verwendet
     */
    public static void main(String [] args) {
        Person04 p1 = new Person04(); // Erzeugen eines Objektes mittels Standartkonstruktor

        System.out.println("Person erzeugt:" + p1.toString()); // Ausgabe der Daten des Objekts

        p1.setGender(Person04.Gender.FEMALE); // Änderung des Geschlechts

        System.out.println("Geschlecht geändert: " + p1.toString()); // Änderungen anzeigen

        // Erzeuge ein Geburtsdatum für eine Person
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = new Date();

        // try-catch muss verwendet werde da parse eine Exception liefern könnte
        try {
            birthday = dateFormat.parse("1988-01-12");
        } catch (Exception ex){
            System.out.println("Something went wrong parsing Date. Using default date.\nMSG: " + ex.getMessage());
        }

        // Erstellen eines Objektes von Person mit alternativem Konstruktor
        Person03 p2 = new Person03(Person03.Gender.MALE, "Max Mustermann", birthday, 18240.50);

        // Ausgabe aller Infos der Person
        System.out.println("Neue Person erstellt.");
        System.out.println("Geschlecht: " + p2.getGender());
        System.out.println("Name: " + p2.getName());
        System.out.println("Geburtsdatum: " + p2.getBirthday());
        System.out.println("Einkommen: " + p2.getIncome());
    }

}
