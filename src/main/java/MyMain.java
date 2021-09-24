import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int[] newArr=new int[arr.length];
        for (int i =0;i< arr.length;i++){
            if (!(i==0)){
                newArr[i-1]=arr[i];
            }
            else{
                newArr[arr.length-1]=arr[i];
            }
        }
        return newArr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int[] newArr=new int[arr.length];
        for (int i =0;i< arr.length;i++){
            if (!(i== (arr.length-1))){
                newArr[i+1]=arr[i];
            }
            else{
                newArr[0]=arr[i];
            }
        }
        return newArr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            for (int x = 0;x<i;x++){
                if (arr[x] == arr[i]) {
                    arr[i] = -1;
                    break;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
