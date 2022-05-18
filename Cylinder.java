package Th;

 public class Cylinder {
    public static double getVolume(int height,int radius){
        double volume = getperimeter(radius) * height + 2 * getbaseArea(radius);
        return volume;
    }
public static double getbaseArea(int radius){
    double baseArea = Math.PI * radius * radius;
    return baseArea;
}
     public static double getperimeter(int radius){
         double perimeter = 2 * Math.PI  * radius;
         return perimeter;
     }
}
