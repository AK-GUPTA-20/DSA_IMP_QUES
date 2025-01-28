public class MergeSort {
    public static void mergesort(int[] arr , int low , int high){
        if(low<high){
            int mid = low + (high-low)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1 , high);
            Merge(arr,low,mid,high);
        }
    }

    public static void Merge(int[] arr , int low , int mid , int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] l1 = new int[n1];
        int[] l2 = new int[n2];

        System.arraycopy(arr, low + 0, l1, 0, n1);
        for(int j=0 ; j<n2 ; j++) l2[j] = arr[mid+1+j];

        int i=0 ; int j=0 ; int k=low;
        while(i!=n1 && j!=n2){
            if(l1[i]<l2[j]){
                arr[k++] = l1[i++];
            }
            else {
                arr[k++] = l2[j++];
            }
        }

        while(i!=n1) arr[k++] = l1[i++];
        while (j!=n2) arr[k++] = l2[j++];
    }

    public static void main(String[] args) {
        int [] arr = {89,21,6,20,15,7,33,5,16,7};
        System.out.print("Array Before Sorting = ");
        printArray(arr);
        System.out.println();

        mergesort(arr , 0 , arr.length-1);

        System.out.print("Array After Sorting = ");
        printArray(arr);


    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
