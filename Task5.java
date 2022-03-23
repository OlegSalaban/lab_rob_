public class Task5 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if(i % 10 == j / 10 && i / 10 == j % 10) {
                    count++;
                }
            }
        }

        System.out.println("Count: " + count);
    }
}
