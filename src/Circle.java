public class Circle {
    public static int count;
    private double radius;
    public double areaCalc;
    public Circle(int n){
        setRadius(n);
        count++;
    }

    public void setRadius(int n){
        radius = n;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        areaCalc = 3.14159265358979 * Math.pow(getRadius(),2);
        return areaCalc;
    }
}