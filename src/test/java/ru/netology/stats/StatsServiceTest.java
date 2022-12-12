package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void shouldCalcSum() {
        StatsService service = new StatsService();

        int[] sale  = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 180;
        int actual = service.sumOfAllSales(sale);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSum() {
        StatsService service = new StatsService();

        int[] sale  = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        double expected = 15;
        double actual = service.averageAmountOfSales(sale);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumberMonthMaxSales() {
        StatsService service = new StatsService();

        int[] sale  = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 8;
        int actual = service.numberMonthMaxSales(sale);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumberMonthMinSales() {
        StatsService service = new StatsService();

        int[] sale  = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 9;
        int actual = service.numberMonthMinSales(sale);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountOfMonthsSalesLessAverage() {
        StatsService service = new StatsService();

        int[] sale  = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.countOfMonthsSalesLessAverage(sale);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountOfMonthsSalesMoreAverage() {
        StatsService service = new StatsService();

        int[] sale  = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.countOfMonthsSalesMoreAverage(sale);

        assertEquals(expected, actual);
    }
}
