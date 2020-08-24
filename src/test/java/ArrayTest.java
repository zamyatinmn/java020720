import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void newArrTest() {
        Assert.assertArrayEquals(ArrayFour.arrayAfterFour(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}), new int[]{1, 7});
        Assert.assertArrayEquals(ArrayFour.arrayAfterFour(new int[]{1, 2, 4, 4}), new int[]{});
        Assert.assertArrayEquals(ArrayFour.arrayAfterFour(new int[]{1, 2, 4, 4, 2, 3}), new int[]{2, 3});
        Assert.assertArrayEquals(ArrayFour.arrayAfterFour(new int[]{1, 2, 4, 4, 2, 3, 4, 1}), new int[]{1});
    }

    @Test
    public void oneFourTest() {
        Assert.assertTrue(ArrayFour.isArrWithOneFour(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    public void oneFourTest2() {
        Assert.assertTrue(ArrayFour.isArrWithOneFour(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void oneFourTest3() {
        Assert.assertTrue(ArrayFour.isArrWithOneFour(new int[]{4, 4, 4, 4}));
    }

    @Test
    public void oneFourTest4() {
        Assert.assertTrue(ArrayFour.isArrWithOneFour(new int[]{1, 4, 4, 1, 1, 4, 3}));
    }
}
