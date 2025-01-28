public class SelectionSort {
    private static void Selectionsort(int[] arr) {
        int n = arr.length;
        for(int i=0 ;i<n ; i++){
            int min = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }
    public static void main(String[] args) {
        int[] arr = {89, 21, 56, 24, 15, 7, 23, 5, 1, 7};
        System.out.print("Array Before Sorting = ");
        printArray(arr);
        System.out.println();

        Selectionsort(arr);

        System.out.print("Array After Sorting = ");
        printArray(arr);
    }

    public static void printArray ( int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


