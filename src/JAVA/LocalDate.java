package JAVA;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDate {
    public static void main(String[] args){
        LocalTime present = LocalTime.now();

        String ampm;



        if(present.get(ChronoField.AMPM_OF_DAY) == 0) {

            ampm = "오전";

        } else {

            ampm = "오후";

        }

        System.out.println("지금은 " + ampm + " " + present.get(ChronoField.HOUR_OF_AMPM) + "시입니다.");


    }


}
