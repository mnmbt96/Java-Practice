import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    System.out.println("Enter 2 numbers: ");
    Scanner in = new Scanner(System.in);
    try{
      //通常の処理を書く
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("a/b = " + (a/b) + " reminder " + a%b);
    //例外のサブクラスから書く
    //数字以外を入力したときにエラーメッセージを表示させる
    }catch(InputMismatchException e){
      System.out.println("Not a number. Please Enter 2 numbers. ");
    //その他のエラー
    }catch(Exception e){
      System.out.println("Something went wrong");
    //エラーが起きても起きなくても表示
    }finally{
      System.out.println("Finished the program");
    }
    in.close();
  }
}  