package com.keyin;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {
    @Test
    public void testGetTotal() {
        Invoice I1 = new Invoice("1011", "ITEM1", 4, 10.99);
        Invoice I2 = new Invoice("1022", "ITEM2", 35, 11.75);
        Invoice I3 = new Invoice("1033", "ITEM3", 68, 419.70);

        I1.getTotal();
        I2.getTotal();
        I3.getTotal();

        Assert.assertTrue(I1.getTotal() == 43.96);
        Assert.assertTrue(I2.getTotal() == 411.25);
        Assert.assertTrue(I3.getTotal() == 28539.60);

    }
}
