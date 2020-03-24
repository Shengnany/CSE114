//Shengnan You
//112361646
//CSE 114
//Homework#5
import java.util.ArrayList;

abstract public class DessertCafe {
    public static void main(String[] args){
        ArrayList<Dessert> desserts= new ArrayList<> ();
Dessert cake=new Cake(3);
Dessert cookiePack= new CookiePack(2,5);
desserts.add(cake);
desserts.add(cookiePack);
for(int i=0;i<desserts.size();i++ ){
    System.out.print(desserts.get(i).getName());
    System.out.print(": $");
    System.out.println(desserts.get(i).getCost());
}
    }
}

abstract class Dessert {
    private int cost;
    private String name;

   Dessert(){
   }
    Dessert(String name, int cost){
}
   abstract public String getName();
    abstract public int getCost();
}


    class Cake extends Dessert{
    private int layers;
    Cake(int layers){
        this.layers=layers;
    }
    @Override
    public String getName() {
        return"Cake";
    }
    @Override
    public int getCost(){
     return  layers*2+15 ;
    }
    @Override
    public String toString(){
        return getName()+": $"+getCost();
    }

}

class CookiePack extends Dessert{
    private int numbersOfCookies;
    private int pricePerCookies;

    CookiePack(int numbersOfCookies,int pricePerCookies){
        this.numbersOfCookies=numbersOfCookies;
        this.pricePerCookies=pricePerCookies;
    }
    @Override
    public String getName() {
        return"CookiePack";
    }
    @Override
    public int getCost(){
        return  numbersOfCookies*pricePerCookies ;
    }
    @Override
    public String toString(){
        return getName()+": $"+getCost();
    }
}

class Icecream extends Dessert{

    private int startingValue;

    Icecream(int startingValue){
        this.startingValue=startingValue;
    }

    @Override
    public String getName() {
        return "Icecream";
    }
    @Override
    public int getCost(){
        return startingValue ;
    }
@Override
    public String toString(){
        return getName()+": $"+getCost();
    }

}

class Sundae extends Icecream{

    private int topping;

    Sundae(int topping,int startingValue){
        super(startingValue);
       this.topping=topping;
    }
    @Override
    public String getName() {
        return "Sundae";
    }
    @Override
    public int getCost(){
        return topping+super.getCost() ;
    }
    @Override
    public String toString(){
        return getName()+": $"+getCost();
    }

        }
