package org.robots;

import java.time.LocalDate;

public class Robot {
    public String name;
    public String maker;
    public int creationDate;
    public LocalDate dateRegistered;

    public Robot(String name, String maker, int creationDate, LocalDate dateRegistered) {
        this.name = name;
        this.maker = maker;
        this.creationDate = creationDate;
        this.dateRegistered = dateRegistered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(LocalDate dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", creationDate=" + creationDate +
                ", dateRegistered=" + dateRegistered +
                '}';
    }
}
