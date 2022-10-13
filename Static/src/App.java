public class App {
    public static void main(String[] args) throws Exception {
        //インスタンス化
        Robot r1 = new Robot("A");
        Robot r2 = new Robot("B");
        Robot r3 = new Robot("C");

        //インスタンスメソッドはインスタンス化すると動作可能
        r1.introduce(); 
        r2.introduce();
        r3.introduce();

        //クラスメソッドはインスタンス化しなくても動作可能
        System.out.println(Robot.getTotal());
    }
}
