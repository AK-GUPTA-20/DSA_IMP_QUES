public class InsertionSort {
    public static void insertionsort(int[] arr){
        for(int i=0 ; i< arr.length ; i++){
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }

    public static void main(String[] args) {
        int [] arr = {89,21,56,24,5,7,23,5,1,7};
        System.out.print("Array Before Sorting = ");
        printArray(arr);
        System.out.println();

        insertionsort(arr);

        System.out.print("Array After Sorting = ");
        printArray(arr);


    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
