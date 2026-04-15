package org.robots;

import java.time.LocalDate;
import java.time.Year;

public abstract class Robot {
    public String name;
    public String maker;
    public Year creationDate;
    public LocalDate dateRegistered;

    public Robot(String name, String maker, Year creationDate, LocalDate dateRegistered) {
        this.name = name;
        this.maker = maker;
        this.creationDate = creationDate;
        this.dateRegistered = dateRegistered;
    }

    public String getName() {
        return name;
    }

    public String getMaker() {
        return maker;
    }

    public abstract String getTechnicalDescription();

}
