//Shengnan You
//112361646
//CSE 114
//Lab#9

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
      Stock (String symbol,String name){
     this.symbol=symbol;
     this.name=name;
    }
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
   public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double getcurrentPrice(){
        return currentPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double changePersent(){

          return  currentPrice - previousClosingPrice;
    }
}
