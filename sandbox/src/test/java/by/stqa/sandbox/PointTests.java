package by.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PointTests {
    public void testDistance1(){
        Point p1 = new Point (1,-1);
        Point p2 = new Point(1,0);
        Assert.assertEquals(p1.distance(p2), 1.0);

    }

    public void testDistance2(){
        Point p1 = new Point (3,-1);
        Point p2 = new Point(-7,5);
        Assert.assertEquals(p1.distance(p2), 11.661903789690601);

    }
    public void testDistance3(){
        Point p1 = new Point (2,0);
        Point p2 = new Point(3,-1);
        Assert.assertEquals(p1.distance(p2), 1.4142135623730951);

    }
}
