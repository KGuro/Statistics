package stats;

public class StatsService {
    public long sum(long[] items) {
        long result = 0;
        for (long item : items) {
            result = result + item;

        }
        return result;
    }

    public double avg(long[] items) {
        return ((double) sum(items)) / items.length;
    }

    public int monthWithMax(long[] items) {
        long max = getMax(items);
        int monthCount = 0;
        int monthNumber = 0;
        for (long item : items) {
            monthCount++;
            if (item == max) {
                monthNumber = monthCount;
            }
        }
        return monthNumber;
    }

    public long getMax(long[] items) {
        long max = items[0];
        for (long item : items) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public long getMin(long[] items) {
        long min = items[0];
        for (long item : items) {
            if (item < min) {
                min = item;
            }
        }
        return min;

    }

    public int monthWithMin(long[] items) {
        long min = getMin(items);
        int monthCount = 0;
        int monthNumber = 0;
        for (long item : items) {
            monthCount++;
            if (item == min) {
                monthNumber = monthCount;
            }
        }
        return monthNumber;
    }

    public int moreThanAvgCount(long[] items) {
        double avg = avg(items);
        int count = 0;
        for (long item : items) {
            if (item > avg) {
                count++;

            }
        }
        return count;
    }

    public int lessThanAvgCount(long[] items) {
        double avg = avg(items);
        int count = 0;
        for (long item : items) {
            if (item < avg) {
                count++;

            }
        }
        return count;
    }
}