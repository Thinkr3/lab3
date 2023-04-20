import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class LinkedListTests {
    
    @Test
    public void testNullInput() {
        LinkedList input = new LinkedList();
        input.append(1);
        input.append(2);
        input.append(3);

        assertEquals(3, input.length());
    }
}
