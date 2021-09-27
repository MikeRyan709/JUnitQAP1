package com.keyin;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testGetArea() {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(2, 4);
        Rectangle r3 = new Rectangle(8, 10);
        Rectangle r4 = new Rectangle(20, 40);


        Assert.assertTrue(r1.getArea() == 50);
        Assert.assertTrue(r2.getArea() == 8);
        Assert.assertTrue(r3.getArea() == 80);
        Assert.assertTrue(r4.getArea() == 800);

    }
    @Test
    public void testGetPerimeter() {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(2, 4);
        Rectangle r3 = new Rectangle(8, 10);
        Rectangle r4 = new Rectangle(20, 40);

        Assert.assertTrue(r1.getPerimeter() == 30);
        Assert.assertTrue(r2.getPerimeter() == 12);
        Assert.assertTrue(r3.getPerimeter() == 36);
        Assert.assertTrue(r4.getPerimeter() == 120);
    }
}
