package Sorting;

import java.lang.Math;

public class MergeSortAlgo {
    static int n = 10;
    static int A[] = new int[n];

    public static void main(String[] args) {
        System.out.println("Merge Sort Algorithm");

        System.out.println("Original A");
        for (int i = 0; i < n; i++) {
            A[i] = (int) (Math.random() * 1000);
            System.out.print(A[i] + " ");
        }
        System.out.println("\nSorted A");
        MergeSort(0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    static void MergeSort(int i, int j) {
        if (i < j) {
            int m = (int) Math.floor((i + j) / 2);
            MergeSort(i, m);
            MergeSort(m + 1, j);
            Merge(i, m, j);
        }
    }

    static void Merge(int i, int m, int j) {
        int B[] = new int[j - i + 1];
        int l = i, r = m + 1, k = 0;
        while (l <= m && r <= j) {
            if (A[l] <= A[r])
                B[k++] = A[l++];
            else
                B[k++] = A[r++];
        }
        while (l <= m)
            B[k++] = A[l++];
        while (r <= j)
            B[k++] = A[r++];

        l = i;
        k = 0;
        while (l <= j)
            A[l++] = B[k++];
    }
}