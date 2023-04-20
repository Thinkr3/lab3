import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {
    @Test
    public void testListWithNoOutput() {
        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("pie");
        input.add("cinnamon");
        List<String> res = ListExamples.filter(input, new StringCheckerSuper());
        assertArrayEquals(new String[] {}, res.toArray());
    }

    @Test
    public void testListWithOneOutput() {
        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("pie");
        input.add("cinnamon");
        input.add("supermarket");
        List<String> res = ListExamples.filter(input, new StringCheckerSuper());
        assertArrayEquals(new String[] {"supermarket"}, res.toArray());
    }

    @Test
    public void testListWithTwoOutput() {
        List<String> input = new ArrayList<>();
        input.add("superman");
        input.add("pie");
        input.add("cinnamon");
        input.add("supermarket");
        List<String> res = ListExamples.filter(input, new StringCheckerSuper());
        assertArrayEquals(new String[] {"superman", "supermarket"}, res.toArray());
    }

    @Test
    public void testMergeInterwovenElements() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("c");

        List<String> input2 = new ArrayList<>();
        input2.add("b");
        input2.add("s");

        List<String> res = ListExamples.merge(input1, input2);
        System.out.println(res.toString());
        assertArrayEquals(new String[] {"a", "b", "c", "s"}, res.toArray());
    }

}
