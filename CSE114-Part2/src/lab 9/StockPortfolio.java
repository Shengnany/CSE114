//Shengnan You
//112361646
//CSE 114
//Lab#9
public class StockPortfolio {
    public static void main(String[] args) {
        Stock[] stockArray = new Stock[5];
            stockArray[0] = new Stock("A","a");
            stockArray[0].setPreviousClosingPrice(1);
            stockArray[0].setCurrentPrice(2);
            stockArray[1] = new Stock("B","b");
        stockArray[1].setPreviousClosingPrice(3);
        stockArray[1].setCurrentPrice(4);
        stockArray[2] = new Stock("C","c");
        stockArray[2].setPreviousClosingPrice(5);
        stockArray[2].setCurrentPrice(6);
        stockArray[3] = new Stock("D","d");
        stockArray[3].setPreviousClosingPrice(7);
        stockArray[3].setCurrentPrice(8);
        stockArray[4] = new Stock("E","e");
        stockArray[4].setPreviousClosingPrice(9);
        stockArray[4].setCurrentPrice(10);
        int sum=0,count=0;
        for (int i = 0; i <5 ; i++) {
            sum+=stockArray[i].changePersent();
            count++;
        }
        double average=sum/count;
        System.out.println("The average percentage change for the array of stocks is :"+average);

    }
}
