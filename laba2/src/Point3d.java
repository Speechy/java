public class Point3d extends Point2d{
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        this(0, 0, 0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public static boolean isEquals(Point3d obj1, Point3d obj2) {
        if ((obj1.xCoord == obj2.xCoord) && (obj1.yCoord == obj2.yCoord) && ((obj1.zCoord == obj2.zCoord))) {
            return true;
        }
        return false;
    }

    public static double distanceTo(Point3d obj1, Point3d obj2){
        return  Math.pow(Math.pow(obj2.xCoord - obj1.xCoord, 2) + Math.pow(obj2.yCoord - obj1.yCoord, 2)
                + Math.pow(obj2.zCoord - obj1.zCoord, 2),0.5);
    }

}
