/**
 * Created by Norbert on 2017-08-13.
 */
public class Person {

    private String name;
    private String surname;
    private String sportType;

    public Person(String name, String surname, String sportType) {
        this.name = name;
        this.surname = surname;
        this.sportType = sportType;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSportType() {
        return sportType;
    }

    @Override
    public String toString() {
        return name + " " + surname+ " "+ sportType;
    }
}
