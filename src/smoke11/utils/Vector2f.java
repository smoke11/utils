package smoke11.utils;

public class Vector2f {
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


    private float x;
    private float y;

    public Vector2f() {x=0;y=0;}
    public Vector2f(float x, float y) {this.x=x;this.y=y;}
    public Vector2f(int x, int y) {this.x=x;this.y=y;}
    public Vector2f(Vector2f vect) {this.x=vect.x;this.y=vect.y; }


    public void sub(Vector2f vec2) { this.x-=vec2.x; this.y-=vec2.y;}
    public void add(Vector2f vec2) { this.x+=vec2.x; this.y+=vec2.y;}
    public void sub(float val) { this.x-=val; this.y-=val;}
    public void add(float val) { this.x+=val; this.y+=val;}
    public void mul(int val) { this.x*=val; this.y*=val;}
    public void mul(int val1, int val2) { this.x*=val1; this.y*=val2;}
    public void mul(float val) { this.x*=val; this.y*=val;}
    public void mul(float val1, float val2) { this.x*=val1; this.y*=val2;}
    public void div(float val) { this.x/=val; this.y/=val;}
    public void div(Vector2f vec) { this.x/=vec.getX(); this.y/=vec.getY();}
    public double getLength() {  return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)); }
    public void normalize() {
        double len = getLength();
        this.x/=len;
        this.y/=len;
    }
    public Vector2f copy() { return new Vector2f(this.x,this.y); }

    public static Vector2f sub(Vector2f vec1, Vector2f vec2) {
        Vector2f newVec= new Vector2f(vec1);
        newVec.sub(vec2);
        return newVec;
    }
    public static Vector2f add(Vector2f vec1, Vector2f vec2) {
        Vector2f newVec= new Vector2f(vec1);
        newVec.add(vec2);
        return newVec;
    }
    public static Vector2f sub(Vector2f vec1, float val) {
        Vector2f newVec= new Vector2f(vec1);
        newVec.sub(val);
        return newVec;
    }
    public static Vector2f add(Vector2f vec1, float val) {
        Vector2f newVec= new Vector2f(vec1);
        newVec.add(val);
        return newVec;
    }
    public static Vector2f mul(Vector2f vec1, float val) {
        Vector2f newVec= new Vector2f(vec1);
        newVec.mul(val);
        return newVec;
    }
    public static Vector2f mul(Vector2f vec1, float val1, float val2) {
        Vector2f newVec= new Vector2f(vec1);
        newVec.mul(val1,val2);
        return newVec;
    }
    public static Vector2f div(Vector2f vec1, float val) {
        Vector2f newVec= new Vector2f(vec1);
        newVec.div(val);
        return newVec;
    }
    public static Vector2f div(Vector2f vec1, Vector2f vec2) {  //TODO: uzupelnic reszte nowych metod i zrobic vector2
        Vector2f newVec= new Vector2f(vec1);
        newVec.div(vec2);
        return newVec;
    }
    public static Vector2f normalize(Vector2f vec1) {
        Vector2f newVec= new Vector2f(vec1);
        newVec.normalize();
        return newVec;
    }


    public boolean checkIfEqual(Vector2f vec2) { return this.x==vec2.x&&this.y==vec2.y;}
    public boolean checkIfOppositeSign(Vector2f vec2){
        return (this.x>0&&vec2.getX()<0)||
        (this.x<0&&vec2.getX()>0)||
        (this.y>0&&vec2.getY()<0)||
        (this.y<0&&vec2.getY()>0);
    }
    public boolean isZero(){ return (this.x==0&&this.y==0);}
    public void reset() {this.x=0;this.y=0;}
    @Override
    public String toString(){return "("+x+","+y+")";}
}
