package at.wsode3.aufgabe02;

import java.util.Date;

/**
 * Klasse mit Informationen einer Person
 */
public class Person04 {
    /**
     * Enum für das Geschlecht
     */
    public enum Gender {
        MALE, FEMALE
    }

    /**
     * Geschlecht
     */
    private Gender gender;

    /**
     * Name
     */
    private String name;

    /**
     * Geburtstag
     */
    private Date birthday;

    /**
     * Einkommen
     */
    private double income;

    /**
     * Erstellt eine Person mit default-Werten.
     */
    Person04() {
        this(Gender.MALE, "John Doe", new Date(), 999.99);
    }

    /**
     * Erstellt eine Person mit übergebenen Werten
     *  @param gender Geschlecht
     * @param name Name
     * @param birthday Geburtsdatum
     * @param income Einkommen
     */
    Person04(Gender gender, String name, Date birthday, double income){
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
        this.income = income;
    }

    /**
     * Gibt das Geschlecht zurück
     *
     * @return Geschlecht
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Setzt das Geschlecht
     *
     * @param gender Geschlecht
     */
    void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Gibt den Namen zurück.
     *
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Setzt den Namen
     *
     * @param name Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gibt den Geburtstag zurück
     *
     * @return Geburtstag
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Setzt den Geburtstag
     *
     * @param birthday Geburtstag
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * Gibt das Einkommen zurück
     *
     * @return Einkommen
     */
    public double getIncome() {
        return income;
    }

    /**
     * Setzt das Einkommen
     *
     * @param income Einkommen
     */
    public void setIncome(double income) {
        this.income = income;
    }

    /**
     * Gibt einen Text mit den Daten der Person zurück
     *
     * @return Daten der Person
     */
    @Override
    public String toString() {
        return "Person04{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", income=" + income +
                '}';
    }
}
