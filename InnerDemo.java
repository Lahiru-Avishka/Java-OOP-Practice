class Cylinder{
    private double length;
    private double radius;

    public Cylinder(){

    }
   
}
class Demo {
    public static void main(String args[]) {
        Cylinder c1 = new Cylinder();
        c1.setLength(12.5);
        c1.setRadius(5.0);
        c1.printVolume();
        c1.printArea();
        Cylinder c2 = new Cylinder();
        c2.setDimensions(5.0, 1.5);
        c2.printVolume();
        c2.printArea();
        Cylinder c3 = new Cylinder(1.2, .5);
        System.out.println("Volume of c3 : " + c3.getVolume());
        System.out.println("Area of c3 : " + c3.getArea());
        System.out.println("Length of c3 : " + c3.getLength());
        System.out.println("Radius of c3 : " + c3.getRadius());
    }
}