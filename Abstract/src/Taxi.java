import mypack.Vehicle;

public class Taxi extends Vehicle implements Stopable{
  public Taxi(int crewNum){
    this.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("Number of taxi passenger: " + crewNum);
  }  
  public void stop(){
    System.out.println("I am getting off");
  }
}
