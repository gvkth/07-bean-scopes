package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println(
                "In constructor: "+getClass().getSimpleName()
        );
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast blowling for 15 minutes!!!";
    }
}
