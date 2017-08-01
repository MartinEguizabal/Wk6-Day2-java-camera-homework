import static org.junit.Assert.*;
import org.junit.*;

public class DigitalCameraTest {

  DigitalCamera digitalCamera;

  @Before
  public void before(){
    digitalCamera = new DigitalCamera("Sony", "ILCE5100L", false, "Lo-resolution");
  }
}