import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
    //Test Case
    @Test
    public void fibonacciTest(){
        //Arrange
        Fibonacci obj = new Fibonacci();
        int nThTerm = 5;
        int expected = 3;
        //Actual
        int actual = obj.fibonacci(nThTerm);
        //Assert
        assertEquals(expected, actual);
    }
}
