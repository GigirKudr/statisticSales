package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void summAll() {
        StatsService service = new StatsService();
        long[] arrSales = {0, 100, 2000, 150, 220, 250, 300, 350, 400, 450, 1, 100000};
        long expectedSum = 104221;
        long actualSumm = service.generalSumm(arrSales);
        System.out.println("Общая сумма дохода за год = " + actualSumm + " <<====>> " + expectedSum);

        Assertions.assertEquals(expectedSum, actualSumm);
    }


    @Test
    public void averageSumm() {
        StatsService service = new StatsService();
        long[] arrSales = {0, 100, 2000, 150, 220, 250, 300, 350, 400, 450, 1, 100000};
        long expectedAverageSum = 8685;
        long actualAverageSumm = service.averageSumm(arrSales);
        System.out.println("Средняя сумма за год = " + actualAverageSumm + " <<====>> " + expectedAverageSum);
    }


    @Test
    public void maxSumm() {
        StatsService service = new StatsService();
        long[] arrSales = {0, 100, 2000, 150, 220, 250, 300, 350, 400, 450, 1, 100000};
        int expectedMaxSum = 12;
        long actualMaxSumm = service.maxSumm(arrSales);
        System.out.println("Месяц с максимальной суммой прибыли = " + actualMaxSumm + " <<====>> " + expectedMaxSum);
    }

    @Test
    public void minSumm() {
        StatsService service = new StatsService();
        long[] arrSales = {0, 100, 2000, 150, 220, 250, 300, 350, 400, 450, 1, 100000};
        int expectedMinSum = 1;
        long actualMinSumm = service.minSumm(arrSales);
        System.out.println("Месяц с минимальной суммой прибыли = " + actualMinSumm + " <<====>> " + expectedMinSum);
    }


    @Test
    public void declineMonth() {
        StatsService service = new StatsService();
        long[] arrSales = {0, 100, 2000, 150, 220, 250, 300, 350, 400, 450, 1, 100000};
        int expectedDeclineMonth = 11;
        int actualDeclineMonth = service.declineMonth(arrSales);
        System.out.println("Колличество месяцев ниже средней прибыли = " + actualDeclineMonth + " <<====>> " + expectedDeclineMonth);
    }


    @Test
    public void profitMonth() {
        StatsService service = new StatsService();
        long[] arrSales = {0, 100, 2000, 150, 220, 250, 300, 350, 400, 450, 1, 100000};
        int expectedProfitMonth = 1;
        int actualProfitMonth = service.profitMonth(arrSales);
        System.out.println("Колличество месяцев выше средней прибыли = " + actualProfitMonth + " <<====>> " + expectedProfitMonth);
    }
}
