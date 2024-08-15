package org.example;



import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestMethod {

    @Test
    public void testSum(){
        App app = new App();
        int sum = app.getSum(1, 2);
        Assert.assertTrue(sum == 3);
    }

    @Test
    public void testNotCorrect(){
        App app = new App();
        int sum = app.getSum(2, 2);
        Assert.assertTrue(sum==4);
    }
}
