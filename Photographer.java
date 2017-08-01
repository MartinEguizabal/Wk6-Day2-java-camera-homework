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

}