import mypack.Vehicle;

public class Bus extends Vehicle implements Stopable{
  public Bus(int crewNum){
    this.crewNum = crewNum;
  }
  
  //Vehicleクラスをオーバーライドで書き換え
  @Override
  public void showCrewNum(){
    System.out.println("Number of bus passenger: " + crewNum);
  }

  //Stopableクラスを実装
  public void stop(){
    System.out.println("Stop");
  }
}