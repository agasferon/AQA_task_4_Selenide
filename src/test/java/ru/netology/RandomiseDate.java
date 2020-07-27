package ru.netology;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class RandomiseDate {
    public String getDateIncrement() {
        Random random = new Random();
        int increment = random.nextInt(7) + 1;
        LocalDate date = LocalDate.now().plusDays(3 + increment);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(date);
    }

    public String getTomorrowDate() {
        LocalDate date = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(date);
    }

}