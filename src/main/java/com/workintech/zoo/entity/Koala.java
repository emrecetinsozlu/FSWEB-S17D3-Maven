package com.workintech.zoo.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Koala {

    private Integer id;
    private String name;
    private Double sleepHour;
    private Double weight;
    private String gender;

    public void setSleepHour(Double sleepHour) {
        this.sleepHour = sleepHour;
    }
    public Double getSleepHour() {
        return sleepHour;
    }
}
