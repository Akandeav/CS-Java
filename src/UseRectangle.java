public class UseRectangle {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(2, 2);
        int[] v = rect.ReturnValue();
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
         
    }
}
