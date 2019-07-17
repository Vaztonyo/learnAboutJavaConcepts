public class LambdaFunc{
    interface Calculate{
        void multiply(int x, int y, int z);
    }


    public static void main(String[] args) {
        Calculate sum;
        sum = (int x, int y, int z) -> 
            System.out.println((x * y) * z);

            sum.multiply(4, 8, 7);

    }
}