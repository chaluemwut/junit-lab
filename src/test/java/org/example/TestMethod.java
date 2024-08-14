package org.example;


import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class TestMethod {

    @Test
    public void testSum(){
        App app = new App();
        int sum = app.getSum(1, 2);
        Assert.assertTrue(sum == 3);
    }
}
