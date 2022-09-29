package transport;

import java.time.LocalDate;
import java.time.Month;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private  String brand;
    private  String model;
    public double engineVolume;
    public String color;
    private  int productionYear;
    private  String productionCountry;
    public String transmission;
    private  String bodyType;
    public String registrationNumber;
   private  Integer numberOfSeats;
    public  String typeOfTires;



    public Car(String brand, String model, double engineVolume, String color,
               int productionYear, String productionCountry,String transmission, String bodyType, String registrationNumber,
               Integer numberOfSeats, String typeOfTires) {
        if (brand==null) {
            this.brand="default";
        }else {
            this.brand = brand;
        }
        if (model==null) {
            this.model="default";
        }else {
            this.model = model;
        }
        if (color==null) {
            this.color="white";
        }else {
            this.color = color;
        }
        if (productionCountry==null) {
            this.productionCountry="default";
        }else {
            this.productionCountry = productionCountry;
        }
        if (engineVolume==0.0) {
            this.engineVolume=1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        if (productionYear==0) {
            this.productionYear=2000;
        }else {
            this.productionYear = productionYear;
        }
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission=transmission;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType=bodyType;
        }
        Matcher m = Pattern.compile("[A-Z]\\d\\d\\d[A-Z][A-Z]\\d\\d\\d").matcher(registrationNumber);
        if (m.find()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = " некорректный номер ";
        }
        if (numberOfSeats == null||numberOfSeats<0) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats=numberOfSeats;
        }
        if (LocalDate.now().getMonth()== Month.DECEMBER||LocalDate.now().getMonth()==Month.JANUARY||
        LocalDate.now().getMonth()==Month.FEBRUARY) {
            this.typeOfTires = "winter";
        } else {
            this.typeOfTires="summer";
        }
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

    public void setTypeOfTires(String typeOfTires) {
        if (LocalDate.now().getMonth()== Month.DECEMBER||LocalDate.now().getMonth()==Month.JANUARY||
                LocalDate.now().getMonth()==Month.FEBRUARY) {
            this.typeOfTires = "winter";
        } else {
            this.typeOfTires="summer";
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
