import static org.junit.Assert.*;
import org.junit.*;

public class AnalogueCameraTest {

  AnalogueCamera analogueCamera;

  @Before
  public void before(){
    analogueCamera = new AnalogueCamera("Nikon", "34T", true, "Hi-resolution");
  }
}