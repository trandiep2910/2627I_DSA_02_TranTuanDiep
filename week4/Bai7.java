import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai7 {

    public static List<Integer> countingSort(List<Integer> arr) {

        int[] countMap = new int[100];

        for (int num : arr) {
            countMap[num]++;
        }

        List<Integer> result = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            result.add(countMap[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        List<Integer> result = countingSort(arr);

        // In kết quả
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}