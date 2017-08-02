import java.util.*;

class Photographer{
  private ArrayList<Printable> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
  }

  public int countCameras(){
    return this.cameras.size();
  }

  public void addCamera(Printable camera){
    this.cameras.add(camera);
  }

  public String printAllCameras(){
    for (int i = 0; i < cameras.length; i++) {
      if(cameras[i] == digitalCamera){
        return digitalCamera.printDetails;
      // if(cameras[i] == analogueCamera){
      //   return analogueCamera.printDetails;
      // }
      }
    }
  }

}