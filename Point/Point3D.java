package Point;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    public Point3D(){
    }
    public Point3D(float z) {
        super();
        this.z = z;
    }
    float[]arr1=new float[3];

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        setZ(z);
    }
    public float[] getXYZ(float x,float y,float z){
        arr1[2]=z;
        arr1[0]=x;
        arr1[1]=y;
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "(x,y,z)= " + Arrays.toString(arr1) +
                '}';
    }
}
