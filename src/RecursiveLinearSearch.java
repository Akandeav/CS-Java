public class RecursiveLinearSearch {
    public static String findIndex(int[] arr, int target, int index) {
        if (arr.length == 0){
            return "Invalid Input";
        }
        else {
            if (arr[index] == target){
                return "Found at index: " + index;
            }
            else if (index == ( arr.length - 1 )){
                return "Target not in array";
            }
            else{
                index ++;
                return findIndex(arr, target, index);
            }
        }
    }
    public static void main (String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(findIndex(a, 9, 0));
    }
}
