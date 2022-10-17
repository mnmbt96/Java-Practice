import java.io.*;

public class ThrowsMethod{
  public static void main(String[] args){
    WriteFile wf = new WriteFile();
    try{
      //openとwriteをWriteFileから呼び出し
      wf.open();
      wf.write();
    //writeが呼び出された場合の処理
    }catch(IOException e){
      System.out.println("IOException is happening");
    }catch(Exception e){
      System.out.println("Exception is happening");
    }finally{
      wf.close();
    }
  }
}
