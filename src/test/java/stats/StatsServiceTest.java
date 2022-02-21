package stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void shouldSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(purchases);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void shouldAvg() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.avg(purchases);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMax() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthWithMax(purchases);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMin() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthWithMin(purchases);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountWithMoreThanAvg() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.moreThanAvgCount(purchases);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountWithLessThanAvg() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.lessThanAvgCount(purchases);
        long expected = 5;
        assertEquals(expected, actual);
    }


}