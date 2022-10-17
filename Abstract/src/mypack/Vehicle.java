package mypack;

public abstract class Vehicle {
  //自分のクラスとサブクラスにアクセスを許す
  protected int crewNum;
  //抽象メソッドなので中身の処理を書かない
  public abstract void showCrewNum();
}


