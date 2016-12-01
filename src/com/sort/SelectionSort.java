package com.sort;

public class SelectionSort {
    private Integer[] arr = {23, 45, -34, 786, 12, 1, -456};

    private static void sort(Comparable[] a) {
        int n = a.length; // длина массива
        for (int i = 0; i < n; i++) { // Перестановка a[i] с наименьшим элементом из a[i+l...n].
            int min = i; // индекс минимального элемента,
            for (int j = i + 1; j < n; j++)
                if (less(a[j], a[min])) min = j;
            exch(a, i, min);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) { // Вывод массива в одной строке,
        for (int i = 0; i < a.length; i++)
            System.out.println((a[i] + " "));
        System.out.println();
    }

    public static void main(String[] args) { // Чтение строк из стандартного ввода, их сортировка и вывод.
        SelectionSort selectionSort = new SelectionSort();
        sort(selectionSort.arr);
        show(selectionSort.arr);
    }
}

