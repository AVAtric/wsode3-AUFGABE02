package at.wsode3.aufgabe02;

import java.util.Date;

/**
 * Klasse mit Informationen einer Person
 */
public class Person01 {
    /**
     * Enum für das Geschlecht
     */
    public enum Gender {
        MALE, FEMALE
    }

    /**
     * Geschlecht
     */
    public Gender gender;

    /**
     * Name
     */
    public String name;

    /**
     * Geburtstag
     */
    public Date birthday;

    /**
     * Einkommen
     */
    public double income;
}
