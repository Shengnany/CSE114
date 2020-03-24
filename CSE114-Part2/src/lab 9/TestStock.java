//Shengnan You
//112361646
//CSE 114
//Lab#9
public class TestStock {
    public static void main(String[] args) {
        Stock objStock = new Stock("GOOG", "Gogle Inc.");
       objStock.setPreviousClosingPrice(100);
        objStock.setCurrentPrice(90);
        System.out.println("The price-change percentage is "+objStock.changePersent());
    }
}
