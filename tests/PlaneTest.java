import org.junit.Assert;
import org.junit.Test;

public class PlaneTest {
    @Test
    public void planeisflying(){
        Plane plane = new Plane();
        Assert.assertEquals(true, plane.flying);
    }

    @Test
    public void planelands(){
        Plane plane = new Plane();
        plane.land();
        Assert.assertEquals(false, plane.flying);
    }

    @Test
    public void planetakesoff(){
        Plane plane = new Plane();
        plane.land();
        plane.takeOff();
        Assert.assertEquals(true, plane.flying);
    }

}
