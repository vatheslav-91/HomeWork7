public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int expensesDay : arr) {
            sum += expensesDay;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", sum);

        int minExpensesDay = arr[0];
        int maxExpensesDay = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minExpensesDay > arr[i]) {
                minExpensesDay = arr[i];
            } else if (maxExpensesDay < arr[i]) {
                maxExpensesDay = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей\n" + "Максимальная сумма трат за день составила %s рублей\n", minExpensesDay, maxExpensesDay);


        double averageExpenses = (double) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", averageExpenses);


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}