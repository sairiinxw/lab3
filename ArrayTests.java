import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);

    int[] input2 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input2);

    int[] input3 = { 0, 0, 0 };
    ArrayExamples.reverseInPlace(input3);

    int[] input4 = { -1, 8, -6 };
    ArrayExamples.reverseInPlace(input4);

    int[] input5 = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input5);

    assertArrayEquals(new int[]{ 3}, input1);
    assertArrayEquals(new int[]{ 3, 2, 1}, input2);
    assertArrayEquals(new int[]{ 0, 0, 0}, input3);
    assertArrayEquals(new int[]{ -6, 8, -1}, input4);
    assertArrayEquals(new int[]{ 1, 2, 3}, input5);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1};
    int[] input3 = {1, 2, 3};
    int[] input4 = {3, 2, 1};
    int[] input5 = {0, 0 , 0};
    int[] input6 = {-1, 9, -3};
    int[] input7 = {-4, -5, -7};

    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input3));
    assertArrayEquals(new int[]{1, 2, 3}, ArrayExamples.reversed(input4));
    assertArrayEquals(new int[]{0, 0, 0}, ArrayExamples.reversed(input5));
    assertArrayEquals(new int[]{-3, 9, -1}, ArrayExamples.reversed(input6));
    assertArrayEquals(new int[]{-7, -5, -4}, ArrayExamples.reversed(input7));
  }
}
