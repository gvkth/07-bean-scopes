package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println(
                "In constructor: "+getClass().getSimpleName()
        );
    }

    @Override
    public String getDailyWorkout() {
        return "Practice something for tracking";
    }
}
