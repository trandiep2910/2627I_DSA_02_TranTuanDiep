import java.util.Scanner;

public class Bai6 {

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }

    public static void insertionSort(int[] A) {
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        insertionSort(arr);
    }
}