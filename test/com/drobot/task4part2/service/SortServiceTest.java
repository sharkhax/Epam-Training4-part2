package test.com.drobot.task4part2.service;

import com.drobot.task4part2.service.JaggedComparator;
import com.drobot.task4part2.service.SortService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortServiceTest {

    @Test
    public void sortBySum_True() {
        SortService sortService = new SortService();
        JaggedComparator jaggedComparator = new JaggedComparator();

        int[][] jagged = new int[5][];
        jagged[0] = new int[]{1, 2, 3, 4, 5};
        jagged[1] = new int[]{6, 7};
        jagged[2] = new int[]{8};
        jagged[3] = new int[]{9, 10};
        jagged[4] = new int[]{0};

        int[][] actual = sortService.sortBySum(jagged);
        int[][] expected = new int[5][];
        expected[0] = new int[]{0};
        expected[1] = new int[]{8};
        expected[2] = new int[]{6, 7};
        expected[3] = new int[]{1, 2, 3, 4, 5};
        expected[4] = new int[]{9, 10};

        boolean condition = jaggedComparator.areJagsEqual(actual, expected);

        assertTrue(condition);
    }

    @Test
    public void sortBySum_False() {
        SortService sortService = new SortService();
        JaggedComparator jaggedComparator = new JaggedComparator();

        int[][] jagged = new int[6][];
        jagged[0] = new int[]{1, 2, 3, 4, 5};
        jagged[1] = new int[]{6, 7};
        jagged[2] = new int[]{8};
        jagged[3] = new int[]{9, 10};
        jagged[4] = new int[]{0};
        jagged[5] = new int[]{99};

        int[][] actual = sortService.sortBySum(jagged);
        int[][] expected = new int[6][];
        expected[0] = new int[]{0};
        expected[1] = new int[]{8};
        expected[2] = new int[]{6, 7};
        expected[3] = new int[]{1, 2, 3, 4, 5};
        expected[4] = new int[]{99};
        expected[5] = new int[]{9, 10};

        boolean condition = jaggedComparator.areJagsEqual(actual, expected);

        assertFalse(condition);
    }

    @Test
    public void sortByMin_True() {
        SortService sortService = new SortService();
        JaggedComparator jaggedComparator = new JaggedComparator();

        int[][] jagged = new int[5][];
        jagged[2] = new int[]{1, 2, 3, 4, 5};
        jagged[3] = new int[]{6, 7};
        jagged[0] = new int[]{8};
        jagged[1] = new int[]{9, 10};
        jagged[4] = new int[]{0};

        int[][] actual = sortService.sortByMin(jagged);
        int[][] expected = new int[5][];
        expected[0] = new int[]{0};
        expected[1] = new int[]{1, 2, 3, 4, 5};
        expected[2] = new int[]{6, 7};
        expected[3] = new int[]{8};
        expected[4] = new int[]{9, 10};

        boolean condition = jaggedComparator.areJagsEqual(actual, expected);

        assertTrue(condition);
    }

    @Test
    public void sortByMin_False() {
        SortService sortService = new SortService();
        JaggedComparator jaggedComparator = new JaggedComparator();

        int[][] jagged = new int[5][];
        jagged[2] = new int[]{1, 2, 3, 4, 5};
        jagged[3] = new int[]{6, 7};
        jagged[0] = new int[]{8};
        jagged[1] = new int[]{9, 10};
        jagged[4] = new int[]{0};

        int[][] actual = sortService.sortByMin(jagged);
        int[][] expected = new int[5][];
        expected[4] = new int[]{0};
        expected[1] = new int[]{1, 2, 3, 4, 5};
        expected[2] = new int[]{6, 7};
        expected[3] = new int[]{8};
        expected[0] = new int[]{9, 10};

        boolean condition = jaggedComparator.areJagsEqual(actual, expected);

        assertFalse(condition);
    }

    @Test
    public void sortByMax_True() {
        SortService sortService = new SortService();
        JaggedComparator jaggedComparator = new JaggedComparator();

        int[][] jagged = new int[5][];
        jagged[2] = new int[]{1, 2, 8, 4, 5};
        jagged[3] = new int[]{6, 7};
        jagged[0] = new int[]{11};
        jagged[1] = new int[]{9, 10};
        jagged[4] = new int[]{0};

        int[][] actual = sortService.sortByMax(jagged);
        int[][] expected = new int[5][];
        expected[0] = new int[]{0};
        expected[2] = new int[]{1, 2, 8, 4, 5};
        expected[1] = new int[]{6, 7};
        expected[4] = new int[]{11};
        expected[3] = new int[]{9, 10};

        boolean condition = jaggedComparator.areJagsEqual(actual, expected);

        assertTrue(condition);
    }

    @Test
    public void sortByMax_False() {
        SortService sortService = new SortService();
        JaggedComparator jaggedComparator = new JaggedComparator();

        int[][] jagged = new int[5][];
        jagged[2] = new int[]{1, 2, 8, 4, 5};
        jagged[3] = new int[]{6, 7};
        jagged[0] = new int[]{11};
        jagged[1] = new int[]{9, 10};
        jagged[4] = new int[]{0};

        int[][] actual = sortService.sortByMax(jagged);
        int[][] expected = new int[5][];
        expected[0] = new int[]{0};
        expected[2] = new int[]{1, 2, 8, 4, 5};
        expected[1] = new int[]{6, 7};
        expected[3] = new int[]{11};
        expected[4] = new int[]{9, 10};

        boolean condition = jaggedComparator.areJagsEqual(actual, expected);

        assertFalse(condition);
    }
}
