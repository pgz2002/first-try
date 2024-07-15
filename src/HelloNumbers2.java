public class HelloNumbers2 {
    public static void main(String[] args) {
        for(int z = 0;z<10;z++){
            int x = 0;
            for(int y = 0;y<=z;y++){
                x += y;
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}