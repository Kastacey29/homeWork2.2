import transport.Car;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1987, "Maxim", "Minsk", "brand-manager");
        Human anya = new Human(-1993, "Anna", null, "methodologistOfEducationalPrograms");
        Human katya = new Human(1994, "Katya", "Kaliningrad", "productManager");
        Human artem = new Human(1995, "Artem", "Moskow", "directorOfBusinessDevelopment");
        Human vlad = new Human(2001,"Vladimir","Kazan",null);
        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города " + maxim.getTown() +
                ". Я родился в " + maxim.getYearOfBirth() + " году. Я работаю на должности " + maxim.position + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.getTown() +
                ". Я родилась в " + anya.getYearOfBirth() + " году. Я работаю на должности " + anya.position + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.getTown() +
                ". Я родилась в " + katya.getYearOfBirth() + " году. Я работаю на должности " + katya.position + ".  Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.getTown() +
                ". Я родился в " + artem.getYearOfBirth() + " году. Я работаю на должности " + artem.position + ".  Будем знакомы!");
        System.out.println("Привет! Меня зовут " + vlad.name + ". Я из города " + vlad.getTown() +
                ". Я родился в " + vlad.getYearOfBirth() + " году. Я работаю на должности " + vlad.position + ".  Будем знакомы!");


        Flower rose = new Flower(null,"Голландия",35.59, null);
        Flower chrysanthemum = new Flower(null,null,15, 5);
        Flower pion = new Flower(null,"Англия",69.9, 1);
        Flower gypsophila = new Flower(null,"Турция",19.5, 10);
        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);

        Car lada = new Car("Lada", "Grande", 1.7, "yellow", 2015,
                "Russia","механическая","хэтчбек", "Н258РО257",4,
                "Summer");
        Car audi = new Car("Audi", "A8_50_L_TDI_quattro", 3.0, "black",
                2020, "Germany","Автомат", "Седан", "Р785АВ078",
                4,null);
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany",
                "Автомат", "седан", null,5,null);
        Car kia = new Car("Kia", "Sportage", 2.4, "red", 2018, "SouthKorea",
                null, "универсал", "О748ВУ041",4,"winter");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016,
                "SouthKorea", null, null,"С894РК787",
                4,"summer");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}