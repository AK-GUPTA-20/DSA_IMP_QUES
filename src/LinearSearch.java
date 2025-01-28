import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to Search: ");
        int key = sc.nextInt();
        int[] arr = {3,6,2,1,4,8,10,7};
        int ans = linearsearch(arr,key);
        if (ans == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + ans);
        }
    }

    private static int linearsearch(int[] arr, int key) {
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i]==key) return i;
        }

        return -1;
    }
}
