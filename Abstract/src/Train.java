import mypack.Vehicle;

public class Train extends Vehicle {
  public Train(int crewNum){
    this.crewNum = crewNum;
  }
public void showCrewNum(){
  System.out.println("Number of train passenger: " + crewNum);
}
}
