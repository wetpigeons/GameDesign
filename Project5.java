public class Project5 {
    public static void main(String[] args){
        Turtle t = new Turtle();
        t.hide();
        t.speed(0.001);
       // square(t,0,0,100);
        //recursiveSquares(t,0,0,200,15);
        recursiveTriangles(t,-500,-300,0,-300+500*Math.tan(Math.toRadians(60)),500,-300,5);
    }
    public static void square(Turtle t, double x, double y, double size){
        t.up();
        t.setPosition(x-size/2,y+size/2);
        t.down();
        for(int i=0;i<4;i++) {
            t.forward(size);
            t.right(90);
        }
    }
    public static void triangle(Turtle t, double x1, double y1, double x2, double y2, double x3, double y3){
        t.up();
        t.setPosition(x1,y1);
        t.down();
        t.setPosition(x2,y2);
        t.setPosition(x3,y3);
        t.setPosition(x1,y1);
    }
    public static void circle(Turtle t, double x, double y, double radius){
        t.up();
        t.setPosition(x,y);
        t.dot();

        t.setPosition(x-radius,y);
        t.setDirection(90);

        double circumference=2*Math.PI*radius;
        double step=circumference/360;
        for(int i=0;i<360;i++)
        {
            t.forward(step);
            t.right(1);
        }
    }
    public static void recursiveSquares(Turtle t, double x, double y, double size, int iterations){
        square(t, x, y, size);
        if(iterations>0) {
            recursiveSquares(t, x - size / 2, y + size / 2, size / 2, iterations - 1);
            recursiveSquares(t, x + size / 2, y + size / 2, size / 2, iterations - 1);
            recursiveSquares(t, x - size / 2, y - size / 2, size / 2, iterations - 1);
            recursiveSquares(t, x + size / 2, y - size / 2, size / 2, iterations - 1);
        }
    }
    public static void recursiveTriangles(Turtle t, double x1, double y1, double x2, double y2, double x3, double y3, int iterations){
        triangle(t, x1, y1, x2, y2, x3, y3);
        if(iterations>0) {
            recursiveTriangles(t, x1, y1, (x1 + x2) / 2, (y1 + y2) / 2, (x1 + x3) / 2, (y3 + y1) / 2, iterations - 1);
            recursiveTriangles(t, (x1+x2)/2, (y1+y2)/2, x2, y2, (x2 + x3) / 2, (y3 + y2) / 2, iterations - 1);
            recursiveTriangles(t, (x1+x3)/2, (y1+y3)/2, (x3 + x2) / 2, (y3 + y2) / 2, x3, y3, iterations - 1);
        }
    }
}

