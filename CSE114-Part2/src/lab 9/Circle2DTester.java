//Shengnan You
//112361646
//CSE 114
//Lab#9
public class Circle2DTester {
    public static void main(String[] args){
        Circle2D circle1=new Circle2D();
        Circle2D circle2=new Circle2D(0.5,0.5,0);
        Circle2D circle3=new Circle2D(1,1.5,0);

        System.out.println("The first circle's area is "+circle1.getArea());
        System.out.println("The second circle's perimeter is "+circle1.getPerimeter());
        double x1=1;
        double y1=0;
        System.out.println("The distance between (x1,y1) and the center of the first circle is "+
                Circle2D.distance(x1,y1,circle1.getXCenter(),circle2.getYCenter()));
        System.out.println("The second circle "+((circle3.circleIsInside(circle2))?"is":"is not ")+
                "inside the third circle ");


    }
}
