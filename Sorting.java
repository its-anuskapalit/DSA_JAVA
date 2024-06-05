//-------------Sorting-------------------------
//Bubble Sort(comparing adjacent element)
//exchanging or sinking sort
class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Unsorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        int n = array.length;

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
//Selection sort(select element and put in its correct position)// )
//O(n^2)
class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Unsorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        int n = array.length;
        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted subarray
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println("\nSorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
