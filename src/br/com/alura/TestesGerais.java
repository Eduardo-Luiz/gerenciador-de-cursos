package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TestesGerais {
    public static void main(String[] args) {
        var currentTimev1 = LocalDateTime.now();

        System.out.println(currentTimev1);

        System.out.println(currentTimev1.getHour() * 60 + currentTimev1.getMinute());

        var currentTime = LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo"));

        System.out.println(currentTime);

        System.out.println(currentTime.getHour() * 60 + currentTime.getMinute());
    }
}
