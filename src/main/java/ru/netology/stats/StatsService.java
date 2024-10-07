package ru.netology.stats;

public class StatsService {
    public long generalSumm(long[] arrSales) {
        long sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += arrSales[i];
        }
        return sum;
    }


    public long averageSumm(long[] arrSales) {
        return generalSumm(arrSales) / 12;
    }

    public long maxSumm(long[] arrSales) {
        long sum = arrSales[0];
        int month = 0;
        for (int i = 0; i < 12; i++) {
            if (sum <= arrSales[i]) {
                sum = arrSales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public long minSumm(long[] arrSales) {
        long sum = arrSales[0];
        int month = 0;
        for (int i = 0; i < 12; i++) {
            if (sum >= arrSales[i]) {
                sum = arrSales[i];
                month = i + 1;
            }
        }
        return month;
    }


    public int declineMonth(long[] arrSales) {
        int month = 0;
        long average = averageSumm(arrSales);
        for (int i = 0; i < 12; i++) {
            if (average > arrSales[i]) {
                month++;
            }
        }
        return month;
    }


    public int profitMonth(long[] arrSales) {
        int month = 0;
        long average = averageSumm(arrSales);
        for (int i = 0; i < 12; i++) {
            if (average < arrSales[i]) {
                month++;
            }
        }
        return month;
    }


}
