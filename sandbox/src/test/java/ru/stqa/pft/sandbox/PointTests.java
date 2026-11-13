package ru.stqa.pft.sandbox;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PointTests {
    @Test
    public void testDistance(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        Assert.assertEquals(p1.distance(p2), 5.0, 0.001);
    }
    @Test
    public void testDistanceBetweenSamePoints() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);

        Assert.assertEquals(p1.distance(p2), 0.0, 0.001);
    }

    @Test
    public void testHorizontalDistance() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 2);

        Assert.assertEquals(p1.distance(p2), 4.0, 0.001);
    }

    @Test
    public void testVerticalDistance() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 7);

        Assert.assertEquals(p1.distance(p2), 5.0, 0.001);
    }

    @Test
    public void testDistanceWithNegativeCoordinates() {
        Point p1 = new Point(-3, -4);
        Point p2 = new Point(0, 0);

        Assert.assertEquals(p1.distance(p2), 5.0, 0.001);
    }
}
