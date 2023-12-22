import static org.junit.Assert.assertEquals;

import org.junit.Test;

Fibonacci2 obj = new Fibonacci2();
public class Fibonacci2Test {
    
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
    public void getFibonacciTest(){
        //Arrange
        //Initializing the object

    }
    
}
