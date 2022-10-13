public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        Student student2 = new Student("Aya",30,100);

        System.out.println("=== Student1 ===");
        student1.display();

        System.out.println("=== Student2 ===");
        student2.display();
    }
}