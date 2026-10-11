package bai2;

import java.util.Random;

public class DataGenerator {
    // Tạo mảng ngẫu nhiên
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }

    // Tạo mảng đã được sắp xếp tăng dần
    public static int[] generateSortedArray(int size) {
        int[] arr = generateRandomArray(size);
        java.util.Arrays.sort(arr);
        return arr;
    }

    // Tạo mảng sắp xếp nghịch đảo (giảm dần)
    public static int[] generateReverseSortedArray(int size) {
        int[] arr = generateSortedArray(size);
        int[] revArr = new int[size];
        for (int i = 0; i < size; i++) {
            revArr[i] = arr[size - 1 - i];
        }
        return revArr;
    }
}