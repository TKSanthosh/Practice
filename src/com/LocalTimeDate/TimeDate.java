package com.LocalTimeDate;
import java.time.*;
public class TimeDate {
    public static void main(String[] args){
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.plusYears(100));

    }
}
