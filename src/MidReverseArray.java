public class  MidReverseArray {
    public static int[] reverse (int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[(len-1) - i];
            arr[(len-1) - i] = temp;
        }
        return arr;
    }
    public static void main (String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] rev = reverse(a);
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
            System.out.println(rev[i]);
        }
    } 
}
