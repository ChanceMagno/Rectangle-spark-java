import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {

@Test
public void newCube_instantiatesCorrectly() {
  Rectangle testRectangle = new Rectangle(30, 30);
  Cube testCube = new Cube(testRectangle);
  assertEquals(true, testCube instanceof Cube);
  }//   END INSTANTIATE CUBE


@Test
 public void newCube_savesRectangleInformation_Rectangle() {
   Rectangle testRectangle = new Rectangle(30, 30);
   Cube testCube = new Cube(testRectangle);
   assertEquals(testRectangle, testCube.getFace());
 } // END RECT NEWCUBE


@Test
public void volume_determinesTheVolumeOfTheCube_27000() {
    Rectangle testRectangle = new Rectangle (30,30);
    Cube testCube = new Cube(testRectangle);
    assertEquals(27000, testCube.volume());
  } // END TEST

  @Test
  public void surfaceArea_determinesTheSurfaceAreaOfACube_5400() {
    Rectangle testRectangle = new Rectangle(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertEquals(5400, testCube.surfaceArea());
  }
}
