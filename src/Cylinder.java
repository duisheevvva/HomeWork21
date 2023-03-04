public class Cylinder {
    private double radius;
    private double height1;

    public Cylinder(){

    }

    public Cylinder(int radius, int height1) {
        this.radius = radius;
        this.height1 = height1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws AreaException{
        if (radius<=0){
            throw new AreaException("Value cannot be a negative number!");
        }
    }

    public double getHeight1() {
        return height1;
    }

    public void setHeight1(double height1) throws AreaException{
        if (height1<=0){
            throw new AreaException("Value cannot be a negative number!");
        }
    }
    void area1(){
        System.out.println(2*Math.PI * getRadius()*(getHeight1()+getRadius()));
    }
    void volume1(){
        System.out.println(Math.PI * getRadius()*getRadius()*getHeight1());
    }
}
