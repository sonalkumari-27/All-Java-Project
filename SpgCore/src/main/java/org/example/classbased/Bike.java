package org.example.classbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {

    int bikeId;
    String bikeName;
    String bikeColor;

//    public Bike(int bikeId, String bikeName, String bikeColor) {
//        this.bikeId = bikeId;
//        this.bikeName = bikeName;
//        this.bikeColor = bikeColor;
//    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", bikeName='" + bikeName + '\'' +
                ", bikeColor='" + bikeColor + '\'' +
                '}';
    }

    public int getBikeId() {
        return bikeId;
    }

    @Value(value = "11")
    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

    public String getBikeName() {
        return bikeName;
    }

    @Value(value = "Kawasaki")
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getBikeColor() {
        return bikeColor;
    }

    @Value(value = "green")
    public void setBikeColor(String bikeColor) {
        this.bikeColor = bikeColor;
    }
}
