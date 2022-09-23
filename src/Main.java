public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1987, "Maxim", "Minsk", "brand-manager");
        Human anya = new Human(-1993, "Anna", null, "methodologistOfEducationalPrograms");
        Human katya = new Human(1994, "Katya", "Kaliningrad", "productManager");
        Human artem = new Human(1995, "Artem", "Moskow", "directorOfBusinessDevelopment");
        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города " + maxim.town +
                ". Я родился в " + maxim.yearOfBirth + " году. Я работаю на должности " + maxim.position + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.town +
                ". Я родилась в " + anya.yearOfBirth + " году. Я работаю на должности " + anya.position + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.town +
                ". Я родилась в " + katya.yearOfBirth + " году. Я работаю на должности " + katya.position + ".  Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.town +
                ". Я родился в " + artem.yearOfBirth + " году. Я работаю на должности " + artem.position + ".  Будем знакомы!");
    }
}