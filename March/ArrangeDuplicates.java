import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {4, 2, 3, 1, 2, 4, 3, 5};
        findDuplicates(arr);
    }
    public static void findDuplicates(int[] arr){
        Arrays.sort(arr);
        System.out.println("Sorted Array in Ascending Order: ");
        for(int num:arr){
            System.out.println(num+" ");
        }
        System.out.println();

    // Iterate through the sorted array to find duplicates
    boolean DuplicatesFound =  false;
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
            if(!DuplicatesFound){
                System.out.println("Duplicates: ");
                DuplicatesFound = true;
            }
            System.out.println(arr[i]+" ");
        }
    }
        // Print message if no duplicates found
        if (!DuplicatesFound) {
            System.out.println("No duplicates found");
        } else {
            System.out.println();
        }
    }
}