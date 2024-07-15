public class maxnumbers {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int max = m[0];
        int y = 1;
        while(y < m.length){
            if(max < m[y]){

                max = m[y];}
            y++;}

        return max;

    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        int z = max(numbers);
        System.out.print(z);
    }
}
