//Shengnan You
//112361646
//CSE 114
//Lab#9
public class Circle2D {
    double xCenter;

    public double getXCenter() {
        return xCenter;
    }

    double yCenter;

    public double getYCenter() {
        return yCenter;
    }

    double radius;

    public double getRadius() {
        return radius;
    }

    Circle2D() {
        radius = 1;
        xCenter = 0;
        yCenter = 0;
    }

    Circle2D(double radius, double xCenter, double yCenter) {
        this.radius = radius;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;

    }

    public static double distance(double x1, double y1, double x2, double y2) {

        double distance = Math.pow((Math.pow((x1-x2),2)+Math.pow((y1-y2),2)),0.5);
        return distance;

    }
    public boolean pointIsInside(double x, double y){
        return distance(x,y,xCenter,yCenter)<radius;
    }

    public boolean circleIsInside(Circle2D c){
        boolean isInside= ((c.distance(c.getXCenter(),c.getYCenter(),xCenter,yCenter)+c.getRadius())<=radius);

        return isInside;
    }
}