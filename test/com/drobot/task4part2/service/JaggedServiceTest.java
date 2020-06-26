package test.com.drobot.task4part2.service;

import com.drobot.task4part2.service.JaggedComparator;
import com.drobot.task4part2.service.JaggedService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JaggedServiceTest {

    @Test
    public void reflectJagged_True() {
        JaggedService jaggedService = new JaggedService();
        JaggedComparator jaggedComparator = new JaggedComparator();

        int[][] jagged = new int[5][];
        jagged[0] = new int[]{1, 2, 3, 4, 5};
        jagged[1] = new int[]{6, 7};
        jagged[2] = new int[]{8};
        jagged[3] = new int[]{9, 10};
        jagged[4] = new int[]{0};

        int[][] actual = jaggedService.reflectJagged(jagged);
        int[][] expected = new int[5][];
        expected[4] = new int[]{1, 2, 3, 4, 5};
        expected[3] = new int[]{6, 7};
        expected[2] = new int[]{8};
        expected[1] = new int[]{9, 10};
        expected[0] = new int[]{0};

        boolean condition = jaggedComparator.areJagsEqual(actual, expected);

        assertTrue(condition);
    }

    @Test
    public void reflectJagged_False() {
        JaggedService jaggedService = new JaggedService();
        JaggedComparator jaggedComparator = new JaggedComparator();

        int[][] jagged = new int[6][];
        jagged[0] = new int[]{1, 2, 3, 4, 5};
        jagged[1] = new int[]{6, 7};
        jagged[2] = new int[]{8};
        jagged[3] = new int[]{9, 10};
        jagged[4] = new int[]{0};
        jagged[5] = new int[]{0};

        int[][] actual = jaggedService.reflectJagged(jagged);
        int[][] expected = new int[5][];
        expected[4] = new int[]{1, 2, 3, 4, 5};
        expected[3] = new int[]{6, 7};
        expected[2] = new int[]{8};
        expected[1] = new int[]{9, 10};
        expected[0] = new int[]{0};

        boolean condition = jaggedComparator.areJagsEqual(actual, expected);

        assertFalse(condition);
    }

    @Test
    public void calculateLineSum_True() {
        JaggedService jaggedService = new JaggedService();
        int[] line = {1, 2, 3};

        int actual = jaggedService.calculateLineSum(line);
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    public void calculateLineSum_False() {
        JaggedService jaggedService = new JaggedService();
        int[] line = {1, 2, 3};

        int actual = jaggedService.calculateLineSum(line);
        int expected = 4;

        assertNotEquals(actual, expected);
    }

    @Test
    public void max_True() {
        JaggedService jaggedService = new JaggedService();
        int[] array = {1, 2, 3};

        int actual = jaggedService.max(array);
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    public void max_False() {
        JaggedService jaggedService = new JaggedService();
        int[] array = {1, 2, 3};

        int actual = jaggedService.max(array);
        int expected = 1;

        assertNotEquals(actual, expected);
    }

    @Test
    public void min_True() {
        JaggedService jaggedService = new JaggedService();
        int[] array = {1, 2, 3};

        int actual = jaggedService.min(array);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void min_False() {
        JaggedService jaggedService = new JaggedService();
        int[] array = {1, 2, 3};

        int actual = jaggedService.min(array);
        int expected = 3;

        assertNotEquals(actual, expected);
    }
}
