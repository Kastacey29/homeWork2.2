package transport;

import java.time.LocalDate;
import java.time.Month;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final Integer numberOfSeats;
    private String typeOfTires;
    private Key key;
    private Insurence insurence;


    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteRunEngine, boolean keylessAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurence {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurence() {
            this(null, 10000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать офрмлять новую страховку!!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер введен некорректно!");
            }
        }

        public Insurence(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {

                this.number = number;
            }

        }
    }


    public Car(String brand, String model, double engineVolume, String color,
               int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber,
               Integer numberOfSeats, String typeOfTires, Key key, Insurence insurence) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (color == null) {
            this.color = "white";
        } else {
            this.color = color;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (engineVolume == 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == null || numberOfSeats < 0) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (LocalDate.now().getMonth() == Month.DECEMBER || LocalDate.now().getMonth() == Month.JANUARY ||
                LocalDate.now().getMonth() == Month.FEBRUARY) {
            this.typeOfTires = "winter";
        } else {
            this.typeOfTires = "summer";
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurence == null) {
            this.insurence = new Insurence();
        } else {
            this.insurence = insurence;
        }
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTypeOfTires() {
        return typeOfTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Insurence getInsurence() {
        return insurence;
    }

    public void setTypeOfTires(String typeOfTires) {
        if (LocalDate.now().getMonth() == Month.DECEMBER || LocalDate.now().getMonth() == Month.JANUARY ||
                LocalDate.now().getMonth() == Month.FEBRUARY) {
            this.typeOfTires = "winter";
        } else {
            this.typeOfTires = "summer";
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }
}
