public class Point3D extends point2dAnd3d{
    private float z = 0.0f;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){

    }
    public float[] getXYZ(){
        return new float[]{this.getX(),this.getY(),this.getZ()};
    }
    public String toString(){
        return "x =" + this.getX() + "y =" + this.getY() + "z =" +this.getZ();
    }
}
