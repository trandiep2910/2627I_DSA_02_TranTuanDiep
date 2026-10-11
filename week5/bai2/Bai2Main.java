package bai2;

import java.util.Arrays;

public class Bai2Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 50000, 100000};

        System.out.println("Khảo sát thời gian chạy (Dữ liệu ngẫu nhiên):");
        System.out.println("Kích thước (n)\tInsertion Sort (ms)\tMerge Sort (ms)");
        System.out.println("---");

        for (int n : sizes) {
            // Lấy cùng một bộ dữ liệu ngẫu nhiên cho cả 2 thuật toán
            int[] originalArr = DataGenerator.generateRandomArray(n);

            // Đo thời gian Insertion Sort
            int[] arr1 = Arrays.copyOf(originalArr, originalArr.length);
            long start1 = System.nanoTime();
            InsertionSort.sort(arr1);
            long end1 = System.nanoTime();
            double timeInsertion = (end1 - start1) / 1_000_000.0;

            // Đo thời gian Merge Sort
            int[] arr2 = Arrays.copyOf(originalArr, originalArr.length);
            long start2 = System.nanoTime();
            MergeSort.sort(arr2, 0, arr2.length - 1);
            long end2 = System.nanoTime();
            double timeMerge = (end2 - start2) / 1_000_000.0;

            System.out.printf("%-15d\t%-20.2f\t%.2f\n", n, timeInsertion, timeMerge);
        }
    }
}