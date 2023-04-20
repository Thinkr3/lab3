import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testTwoElementReverseInPlace() {
    int[] input1 = {1, 2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2, 1}, input1);
  }

  @Test
  public void testTwoElementReversed() {
    int[] input1 = {1, 2};
    assertArrayEquals(new int[]{2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testThreeElementReverseInPlace() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
  }

  @Test
  public void testThreeElementReversed() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testSameElementReverseInPlace() {
    int[] input1 = {6, 6, 6};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{6, 6, 6}, input1);
  }

  @Test
  public void testSameElementReversed() {
    int[] input1 = {6, 6, 6};
    assertArrayEquals(new int[]{6, 6, 6}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testFiveElementReversed() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
  }

  @Test
  public void testFiveElementReverseInPlace() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
  }

  @Test 
  public void testAverageWithSameLowest() {
    double[] input = {5.0, 3.0, 3.0};
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input), 1);
  }

}
