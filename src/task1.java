import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(" Введите ваше число...");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] + numb;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println (sum);
    }
}
