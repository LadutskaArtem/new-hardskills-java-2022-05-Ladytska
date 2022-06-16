public class HomeworkLesson3_4 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 2, 8, 1, 2, 3, 4};
        int min = arr[0];
        for (int number : arr) {
            if (number < min) {
                min = number;
            }
        }
        int max = arr[0];
        for (int number1 : arr) {
            if (number1 > max)
                max = number1;

        }
       int sum = min+max;
        System.out.println(min);
        System.out.println(max);
        System.out.println(min+" + "+max +" = "+sum);
    }
}








