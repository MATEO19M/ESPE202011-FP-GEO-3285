package ec.edu.espe.SortingIntegers.controler;

public class Sorting {

    public int[] sortByBubbleSort(int[] integers) {
        int n = integers.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {

                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
            }
        }
        return integers;
    }

    public int[] sortBySelection(int[] integers) {

        return integers;
    }

}
