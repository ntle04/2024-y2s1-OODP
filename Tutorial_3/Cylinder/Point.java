package Tutorial_3.Cylinder;

public class Point {
    private int x, y;

    public Point(int x, int y){
        this.x = 0;
        this.y = 0;
    }

    public String toString(){
        String s = "[" + x + "," + y + "]";
        return s;
    }

    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}
