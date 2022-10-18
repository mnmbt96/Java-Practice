public class Arr {
    public static void main(String[] args) throws Exception {
        int[][] number = {{1,2,3}, {4,5,6,7,8,9}};
        display(number);
    }

    private static void display(int[][] number) {
        for(int i = 0; i< number.length; i++){
            for(int j = 0; j < number[i].length; j++){
                System.out.println(number[i][j]);
            }
        }

    }
}

