package dev.chumin.testing_github_copilot.utils;

import java.time.LocalDate;

public class CalendarUtils {
    int calculateDaysBetweenDates(LocalDate startDate, LocalDate endDate) {
        return endDate.getDayOfYear() - startDate.getDayOfYear();
    }

    int calculateDaysBetweenDatesByCronoUnits(LocalDate startDate, LocalDate endDate) {
        return (int) java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
    }

    int calculateDaysBetweenDatesByPeriod(LocalDate startDate, LocalDate endDate) {
        return java.time.Period.between(startDate, endDate).getDays();
    }

    int calculateDaysBetweenDatesByDuration(LocalDate startDate, LocalDate endDate) {
        return (int) java.time.Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay()).toDays();
    }

    int getDaysFromDate(LocalDate date) {
        return date.getDayOfMonth();
    }

}
