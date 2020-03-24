//Shengnan You
//112361646
//CSE 114
//hw#6
public class Test {
    public static void main(String[] args){
        CookingAppliance a = new Blender();
        a.use("high");
        a.clean();
        a = new Toaster();
        a.use("pizza", "low");
        a.clean();
    }
}
abstract class CookingAppliance {
    public void use(Object... a) {
    }

    public void clean() {
    }
}
class Blender extends CookingAppliance{


    @Override
    public void use(Object...a){
        System.out.println("Running blender at "+a[0]+" speed.");
    }
    @Override
    public void clean(){
        System.out.println("Cleaning the blender.");
    }
}

class Toaster extends CookingAppliance{

    @Override
    public void use(Object...a){
        System.out.println("Toasting food on "+a[0]+" setting at "+a[1]+" temperature.");
    }
    @Override
    public void clean(){
        System.out.println("Cleaning the toaster.");
    }
}