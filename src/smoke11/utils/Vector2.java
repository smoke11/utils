package smoke11.utils;

/**
 * Similar to Vector2f, just int
 * Methods are added as neeeded.
 */
public class Vector2 {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    private int x;
    private int y;

    public Vector2() {x=0;y=0;}
    public Vector2(int x, int y) {this.x=x;this.y=y;}
    public Vector2(float x, float y) {this.x=(int)x;this.y=(int)y;}
    public Vector2(Vector2 vect) {this.x=vect.x;this.y=vect.y; }
    public Vector2(Vector2f vect) {this.x=(int)vect.getX();this.y=(int)vect.getY(); }

    public void sub(Vector2 vec2) { this.x-=vec2.x; this.y-=vec2.y;}
    public void add(Vector2 vec2) { this.x+=vec2.x; this.y+=vec2.y;}
    public void sub(int val) { this.x-=val; this.y-=val;}
    public void add(int val) { this.x+=val; this.y+=val;}
    public void mul(int val) { this.x*=val; this.y*=val;}
    public void mul(int val1, int val2) { this.x*=val1; this.y*=val2;}
    public void mul(float val) { this.x*=val; this.y*=val;}
    public void mul(float val1, float val2) { this.x*=val1; this.y*=val2;}
    public void mul(Vector2 vec) { this.x*=vec.getX(); this.y*=vec.getY();}
    public void mul(Vector2f vec) { this.x*=vec.getX(); this.y*=vec.getY();}
    public void div(int val) { this.x/=val; this.y/=val;}
    public void div(Vector2 vec) { this.x/=vec.getX(); this.y/=vec.getY();}
    public void div(Vector2f vec) { this.x/=vec.getX(); this.y/=vec.getY();}
    public double getLength() {  return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)); }
    public void normalize() {
        double len = getLength();
        this.x/=len;
        this.y/=len;
    }
    public Vector2 copy() { return new Vector2(this.x,this.y); }

    public static Vector2 sub(Vector2 vec1, Vector2 vec2) {
        Vector2 newVec= new Vector2(vec1);
        newVec.sub(vec2);
        return newVec;
    }
    public static Vector2 add(Vector2 vec1, Vector2 vec2) {
        Vector2 newVec= new Vector2(vec1);
        newVec.add(vec2);
        return newVec;
    }
    public static Vector2 sub(Vector2 vec1, int val) {
        Vector2 newVec= new Vector2(vec1);
        newVec.sub(val);
        return newVec;
    }
    public static Vector2 add(Vector2 vec1, int val) {
        Vector2 newVec= new Vector2(vec1);
        newVec.add(val);
        return newVec;
    }
    public static Vector2 mul(Vector2 vec1, int val) {
        Vector2 newVec= new Vector2(vec1);
        newVec.mul(val);
        return newVec;
    }
    public static Vector2 mul(Vector2 vec1, int val1, int val2) {
        Vector2 newVec= new Vector2(vec1);
        newVec.mul(val1,val2);
        return newVec;
    }
    public static Vector2 mul(Vector2 vec1, Vector2f vec2) {
        Vector2 newVec= new Vector2(vec1);
        newVec.mul(vec2);
        return newVec;
    }
    public static Vector2 div(Vector2 vec1, int val) {
        Vector2 newVec= new Vector2(vec1);
        newVec.div(val);
        return newVec;
    }
    public static Vector2 div(Vector2 vec1, Vector2 vec2) {
        Vector2 newVec= new Vector2(vec1);
        newVec.div(vec2);
        return newVec;
    }
    public static Vector2 div(Vector2 vec1, Vector2f vec2) {
        Vector2 newVec= new Vector2(vec1);
        newVec.div(vec2);
        return newVec;
    }
    public static Vector2 div(Vector2f vec1, Vector2 vec2) {
        Vector2 newVec= new Vector2(vec1);
        newVec.div(vec2);
        return newVec;
    }
    public static Vector2 normalize(Vector2 vec1) {
        Vector2 newVec= new Vector2(vec1);
        newVec.normalize();
        return newVec;
    }


    public boolean checkIfEqual(Vector2 vec2) { return this.x==vec2.x&&this.y==vec2.y;}
    public boolean checkIfOppositeSign(Vector2 vec2){
        return (this.x>0&&vec2.getX()<0)||
        (this.x<0&&vec2.getX()>0)||
        (this.y>0&&vec2.getY()<0)||
        (this.y<0&&vec2.getY()>0);
    }
    public boolean checkIfXorYIsGreater(Vector2 vec2){
        return (this.x>vec2.getX())||
                (this.y>vec2.getY());
    }
    public boolean isZero(){ return (this.x==0&&this.y==0);}
    public void reset() {this.x=0;this.y=0;}
    @Override
    public String toString(){return "("+x+","+y+")";}
}
