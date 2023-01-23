package ru.netology.stats;

public class StatsService {
    public int sumOfAllSales(int[] sale) {
        int sum = 0;

        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
        }

        return sum;
    }

    public double averageAmountOfSales(int[] sale) {
        int sum = 0;

        sum = sumOfAllSales(sale);

        double averageSum = sum / sale.length;
        return averageSum;
    }

    public int numberMonthMaxSales(int[] sale) {
        int maxMonth = 0;
        int month = 0;

        for (int i = 0; i < sale.length; i++) {
            if (month <= sale[i]) {
                month = sale[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numberMonthMinSales(int[] sale) {
        int minMonth = 0;
        int month = sale[0];

        for (int i = 0; i < sale.length; i++) {
            if (month >= sale[i]) {
                month = sale[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countOfMonthsSalesLessAverage(int[] sale) {
        int sum = 0;
        int month = 0;

        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
        }

        double averageSum = sum / sale.length;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averageSum) {
                month++;
            }
        }

        return month;
    }

    public int countOfMonthsSalesMoreAverage(int[] sale) {
        int sum = 0;
        int month = 0;

        sum = sumOfAllSales(sale);

        double averageSum = sum / sale.length;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSum) {
                month++;
            }
        }

        return month;
    }
}
