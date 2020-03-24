//Shengnan You
//112361646
//CSE 114
//Lab#13
package lab13;
public class ObjectTester {
    public static void main(String[] args){
        Pet  p1 = new Cat(3);
        p1.eat();
        ((Cat)p1).makeNoise();
        Pet p2 = new Fish(4);
        p2.eat();
        Vehicle v = new Ship(2100);
        v.move();
        ((Boat)v).move();
        ((Ship)v).dropAnchor();
        Taxi t = new Taxi(1800);
        t.move();
        t.makeNoise();
        Noisemaker n1 = new Cat(3);
        n1.makeNoise();
        Noisemaker n2 = new Taxi(500);
        n2.makeNoise();
        System.out.println(p1.compareTo(p2));
        System.out.println(v.compareTo(t));
        System.out.println(v.equals(t));

    }
}

interface Noisemaker{
    void makeNoise();
}


abstract class Vehicle implements Comparable<Vehicle> {
    abstract void move();

    private int price;

    public Vehicle(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Vehicle v) {
        if (getPrice() > v.getPrice()) return 1;
        else if (getPrice() < v.getPrice()) return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object v) {
        if (getPrice() == ((Vehicle) v).getPrice()) return true;
        else return false;
    }

}
class Boat extends Vehicle{
    public Boat(int price) {
        super(price);
    }
    @Override
    public void move(){
        System.out.println("DADA");
    }
}

class Ship extends Boat{

    public Ship(int price){
        super(price);
    }
    @Override
    public void move(){
        System.out.println("BABA");
    }

    public void dropAnchor(){
        System.out.println("DROPPED");
    }

}

class Taxi extends Vehicle implements Noisemaker{

    public Taxi(int price) {
        super(price);
    }
    @Override
    public void move(){
        System.out.println("DIDI");
    }
    @Override
    public void makeNoise(){
        System.out.println("Taxi Making noise");
    }

}

abstract class Pet implements Comparable<Pet>{
    private int age;
    abstract void  eat();
    public Pet(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    @Override
    public int compareTo(Pet p){
        if (age<p.getAge()) return -1;
        else if(age>p.getAge()) return 1;
        else return 0;
    }

}

class Cat extends Pet implements Noisemaker{
    public Cat(int age){
        super(age);
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void makeNoise(){
        System.out.println("Cat Making Noise");
    }
}

class Fish extends Pet{
    public Fish(int age){
        super(age);
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }
}