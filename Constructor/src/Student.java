public class Student {

  //Field
    String name;
    int engScore;
    int mathScore;
  
  //コンストラクタ
  //1. クラス名に合わせる
  //2. void等の戻り値を持たない
  //3. コンストラクタを定義していない場合は、自動でデフォルトコンストラクタ（引数・処理なし）が生成される。
  //コンストラクタを書いた時点でデフォルトコンストラクタがなくなってしまうので、引数なしで呼び出した場合、コンパイルエラーになる。
  
  //オーバーロード
  //引数を１つだけ受け取るコンストラクタと、引数を３つ受け取るコンストラクタをそれぞれ書くことができる。
  
  //コンストラクタ
  Student(String n){
    name = n;
  }
  
  //コンストラクタ２つ目　オーバーロード
  Student(String n, int e, int m){
    name = n;
    engScore = e;
    mathScore = m;
  }

  //デフォルトコンストラクタ
  //これがないと別ファイルから呼び出すときに、引数の型や数が違っているとエラーになる
  //本来は引数のないデフォルトコンストラクタが自動で作成されているが、
  //上記のようにコンストラクタを記述した場合はデフォルトコンストラクターは動作しないため、デフォルトコンストラクタが必要な場合は記述する必要がある。
  Student(){}

public void display(){
  System.out.println("Name: " + name);
  System.out.println("English Score: " + engScore);
  System.out.println("Math Score: " + mathScore);
}
}