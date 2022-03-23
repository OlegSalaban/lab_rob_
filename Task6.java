public class Task6 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 1_000_000; i++) {
            int left = i / 1000;
            int right = i % 1000;

            int leftSum = left % 10 + left / 10 % 10 + left / 100;
            int rightSum = right % 10 + right / 10 % 10 + right / 100;

            if(leftSum == rightSum){
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
