public class This {
    //----- Instance Veriables
    private int x;
    private int y;

    //------ Constructors:
    public This(int x, int y){
        this.x = x; // instance variable x = local variable x
        this.y = y;
    }
    public This(int x){
        //this.x = x;
        //this.y = 0;
        this(x,0);
    }
    public This(){
        this(0);
    }

    public static void main(String[] args) {
        This t1 = new This(4, 13);
        System.out.println("t1.x: "+ t1.x + " " + "t1.y: " + t1.y);
        This t2 = new This(5);
        System.out.println("t2.x: "+ t2.x + " " + "t2.y: " + t2.y);
        This t3 = new This();
        System.out.println("t3.x: "+ t3.x + " " + "t3.y: " + t3.y);
    }
}