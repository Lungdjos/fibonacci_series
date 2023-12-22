import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Fibonacci2Test {
    //Creating a Global object
    Fibonacci2 obj = new Fibonacci2();
    //Test Case
    @Test
    public void fibonacci2Test(){
        //Arrange
        
        int nthTerm = 3;
        double expected = 1.0;
        //Actual
        double actual = obj.fibonacci2(nthTerm);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void getFibonacciSeriesTest(){
        //Arrange
        //Initializing the object
        obj.setNTh(4);
        //Setting the expected
        double[] expecteds = {0.0, 1.0, 1.0, 2.0};

        //Actual
        double[] actual = obj.getFibonacciSeries();

        //Asserting
        assertArrayEquals(message, expecteds, actuals);

    }
    
}
