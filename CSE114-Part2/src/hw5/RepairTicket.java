//Shengnan You
//112361646
//CSE 114
//Homework#5
package hw5;
public class RepairTicket {


        private String VIN;
        private double cost;
        private String description;
        private static int number;
        private int ticketNum;
        RepairTicket(String VIN, double cost, String description){
            this.VIN=VIN;
            this.cost=cost;
            this.description=description;
            ++number;
           ticketNum= number;
        }
        public String getVIN()
        {
            return VIN;
        }
        public  int getNum(){
            return ticketNum;
        }
        public double getCost(){
            return cost;
        }
        public void setCost(double cost){
            this.cost=cost;

        }
        }







