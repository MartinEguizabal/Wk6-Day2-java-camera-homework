import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {

  Photographer photographer;
  AnalogueCamera analogueCamera;
  DigitalCamera digitalCamera;

  @Before
  public void before(){
    photographer = new Photographer();
    analogueCamera = new AnalogueCamera("Nikon", "34T", true, "Hi-resolution");
    digitalCamera = new DigitalCamera("Sony", "ILCE5100L", false, "Lo-resolution");
  }

  @Test
  public void canCountCamerasZero(){
    assertEquals(0, photographer.countCameras());
  }

  @Test
  public void canAddCameras(){
    photographer.addCamera(analogueCamera);
    assertEquals(1, photographer.countCameras());
  }

  // @Test
  // public void canPrintAllCameras(){
  //   photographer.PrintAllCameras();
  //   assertEquals()
  // }

  // @Test
  // public void canPrintAllCameras(){
  //   photographer.addCamera(analogueCamera);
  //   photographer.addCamera(digitalCamera);
  //   AnalogueCamera cameras = photographer.printAllCameras
  //   assertEquals()
  // }
}