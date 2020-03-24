//Shengnan You
//112361646
//CSE 114
//hw#6
public class ShapeTests {
    public static void main(String[] args) throws IllegalTriangleException, CloneNotSupportedException {
        GeometricObject[] shapes = {new Octagon(3), new Octagon(), new Octagon(4), new Triangle(3, 4, 5), new Triangle(3, 3, 3), new Triangle(3, 4, 3)};
        shapes[1] = (Octagon)((Octagon)shapes[0]).clone();



        System.out.println("Total area of elements in array: " + sumArea(shapes));


    }

    public static double sumArea(GeometricObject[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].getArea();
        }
        return sum;

    }
}

abstract class GeometricObject  {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();


}

class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable {
    private double side;

    public Octagon(){
        this.side=0;
    }
    public Octagon(double side){
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public  int compareTo(Octagon o){
        if(getArea()>o.getArea()) return 1;
        else if(getArea()<o.getArea()) return -1;
        else return 0;
    }
    @Override
    public double getArea() {
        return (2 + 4 * Math.sqrt(2)) * side * side;
    }
    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public Object clone() {
        try {Octagon octagonClone=(Octagon) super.clone();
            return octagonClone;}
        catch (CloneNotSupportedException ex){
            return null;
        }
    }
}


class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        if(check(side1,side2,side3)){
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
        }
        else throw new IllegalTriangleException();
    }
    public boolean check(double side1,double side2, double side3){
        if((side1+side2>side3)&&(side1+side3>side2)&&(side2+side3>side1)) return true;
        else return false;

    }
    @Override
    public double getArea() {
        double p=getPerimeter();
        double area=p*(p-side1)*(p-side2)*(p-side3);
        area=Math.sqrt(area);
        return area;
    }
    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }
}

class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
        super("IllegalTriangleExceptio");
    }
}





