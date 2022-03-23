public class Task4_2 {
    public static void main(String[] args) {
        long factorial = 1;

        int i = 1;
        while(i <= 10){
            factorial *= i++;
        }

        System.out.println("10! = " + factorial);
    }
}
