public class Human {
    int yearOfBirth;
    String name;
    String town;
    String position;

    public Human(int yearOfBirth, String name, String town, String position) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name!=null) {
            this.name = name;
        }else {
            this.name = "Информация не указана";
        }
        if (town!=null) {
            this.town = town;
        }else {
            this.town = "Информация не указана";
        }
        if (position!=null) {
            this.position = position;
        }else {
            this.position = "Информация не указана";
        }
    }
}
