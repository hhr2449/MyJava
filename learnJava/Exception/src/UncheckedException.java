public class UncheckedException {
    public static void main(String[] args) {
        int[] a = new int[4];
        try {
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
        try {
            int c = 1 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
    }
}
