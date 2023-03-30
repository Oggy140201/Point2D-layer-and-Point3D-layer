public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(3,4);
        point2D1.setXY(6,7);
        System.out.println(point2D1);

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        Point3D point3D1 = new Point3D();
        point3D1.setXYZ(4,5,6);
        System.out.println(point3D1);
    }
}