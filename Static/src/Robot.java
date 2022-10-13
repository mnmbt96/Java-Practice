public class Robot {
  private int id; //インスタンスフィールド
  private String name;//インスタンスフィールド
  private static int total;//クラスフィールド

  //コンストラクタ
  public Robot(String name){
    this.name = name;
    total++;
    this.id = total;
  }
  //インスタンスメソッド
  public void introduce(){
    System.out.println(id+name);
  }
  //クラスメソッド
  public static int getTotal(){
    return total;
  }
}
