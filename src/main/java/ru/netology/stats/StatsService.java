package ru.netology.stats;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;

    }

    public int sumAllSales(int[] sales) {
        //int [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;

    }

    public int averageSum(int[] sales) {
        int averageSum = sumAllSales(sales);
        int total = averageSum / 12;
        return total;
    }

    public int maxSales(int[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }

        return maxSales + 1;
    }

    public int maxMonthSale(int[] sales) {
        int aboveaverage = 0;
        int middle = averageSum(sales);
        for (int monthsale : sales) {
            if (monthsale > middle) {
                aboveaverage = aboveaverage + 1;
            }
        }
        return aboveaverage;
    }

    public int minMonthSale(int[] sales) {
        int belowaverage = 0;
        int middle = averageSum(sales);
        for (int monthsale : sales) {
            if (monthsale < middle) {
                belowaverage = belowaverage + 1;
            }
        }
        return belowaverage;
    }
}


