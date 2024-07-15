public class HelloNumbers {
    public static void main(String[] args) {
        int z = 0;

        while(z < 10){
            int x = 0;
            int y = 0;
            while(x <= z){
                y = y + x;
                x++;
                System.out.print(y + " ");}
            z++;
            System.out.println();

        }
    }
}

