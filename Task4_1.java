public class Task4_1 {
    public static void main(String[] args) {
        long factorial = 1;

        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }

        System.out.println("10! = " + factorial);
    }
}
