public class BubbleSort {
    public static void bubblesort(int[] arr){
        int n= arr.length;
        for(int i=0 ; i<n-1 ; i++){
            for (int j=0 ;j<n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {89,21,56,24,15,7,23,5,1,7};
        System.out.print("Array Before Sorting = ");
        printArray(arr);
        System.out.println();

        bubblesort(arr);

        System.out.print("Array After Sorting = ");
        printArray(arr);


    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}