public class Rectangle {
    private int x, y;
    private int width, height;

    public Rectangle(){
        this(0,0,1,1);
    }
    public Rectangle(int width, int height){
        this(0,0,width,height);
    }
    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int[] ReturnValue() {
        int n = this.x;
        int m = this.y;
        int w = this.width;
        int h = this.height;
        int[] arr = {n, m, w, h};
        return arr;
    }
}
