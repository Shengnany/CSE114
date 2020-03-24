//Shengnan You
//112361646
//CSE 114
//Homework#5
package hw5;
public class Car {
    private String VIN;
    private String make;
    private int year;
    public static int cars;
    Car(){}
    Car(String VIN, String make, int year){
this.VIN=VIN;
this.make=make;
this.year=year;
cars++;
}
    public String getVIN()
    {
        return VIN;
    }

    public String getMake(){
        return make;
    }
}