public class Main {
    public static void main(String[] args) {
        task1();
    }



        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }

        public static void task1() {
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int index = 0; index < arr.length; index = index + 1) {
                sum += arr[index];
            }
            System.out.println("Сумма трат в месяц составит " + sum + " рублей");


            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i = i + 1) {
                if (arr[i] < min) {
                    arr[i] = min;
                }
                if (arr[i] > max) {
                    arr[i] = max;
                }
            } System.out.println("Минимальная сумма за неделю составила " + min + " рублей");
            System.out.println("Максимальная ставка за неделю составит " + max + " рублей");



            double average = (double) sum / arr.length;
            System.out.println("Средняя сумма трат за месяц составит " + average + " рублей");


            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = 0; i < reverseFullName.length / 2; i = i + 1 ) {
                int temp = reverseFullName[i];
                reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
                reverseFullName[reverseFullName.length - i - 1] = (char) temp;
            }
            for (int i = 0; i < reverseFullName.length; i = i + 1 ) {
                System.out.print(reverseFullName[i]);
            }








    }
}