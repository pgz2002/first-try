public class TriangleDrawer {
    public static void drawTriangle(int N) {
        int row = 0;

        while (row < N){
            row = row + 1;
            int col = 0 ;
            while (col<row){
                System.out.print("*");
                col++;}
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}