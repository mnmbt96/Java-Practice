import java.io.*;

public class WriteFile{
  public void open(){
    System.out.println("Open file");
  }
  //write()が呼び出されると例外が発生することを宣言
  public void write() throws IOException{
    throw new IOException();
  }
  public void close(){
    System.out.println("Close file");
  }
}

