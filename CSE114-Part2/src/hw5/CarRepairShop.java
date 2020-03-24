//Shengnan You
//112361646
//CSE 114
//Homework#5
package hw5;
public class CarRepairShop {

    Car[] carList = new Car[100];
    RepairTicket[] repairList = new RepairTicket[100];
    private int numbersOfCars = 0;
    int ticket = 0;


    public int addNewCar(String vin, String make, int year) {


        if (numbersOfCars == carList.length) {
            Car[] a = new Car[2 * numbersOfCars];
            for (int i = 0; i < numbersOfCars; i++)
                a[i] = carList[i];
            carList = a;
        }

        for (int i = 0; i < numbersOfCars; i++) {
            if (carList[i].getVIN().equals(vin))
                return -1;
        }

        carList[numbersOfCars++] = new Car(vin, make, year);
        return numbersOfCars - 1;
    }


    public int addRepairTicket(String vin, double cost, String description) {
        for (int i = 0; i < numbersOfCars; i++) {
            if (carList[i].getVIN().equals(vin)) {
                repairList[ticket++] = new RepairTicket(vin, cost, description);
                return repairList[ticket - 1].getNum();

            }
        }
        return -1;
    }

    public double getRepairCost(int ticketNum) {
        for (int i = 0; i < ticket; i++) {
            if (repairList[i].getNum() == ticketNum)
                return repairList[i].getCost();
        }
        return -1.0;
    }

    public double getTotalRepairCosts(String vin) {
        double sum = 0;
        boolean exist = false;
        for (int i = 0; i < ticket; i++) {
            if (repairList[i].getVIN().equals(vin)) {
                sum += repairList[i].getCost();
                exist = true;
            }
        }
        if (exist)
            return sum;
        else
            return -1.0;
    }

    public String getMake(String vin) {
        for (int i = 0; i <numbersOfCars; i++) {
            if (vin.equals(carList[i].getVIN()))
                return carList[i].getMake();
        }
        return null;
    }
        public String getWorstCarMake (){

            int numberOfMakes = 0;
            String[] makes = new String[100];
            int[] makesNum = new int[100];
            makes[numberOfMakes++] = carList[0].getMake();
            for (int i = 0; i < numbersOfCars; i++) {
                int j=0;
            while(j < numberOfMakes&&(!(carList[i].getMake().equals(makes[j])))) {
                j++;
                }
            if(j==numberOfMakes) {
                makes[numberOfMakes++] = carList[i].getMake();
            }
            }

            for (int j = 0; j < numberOfMakes; j++) {
                for (int i = 0; i < ticket ; i++)
                    if ((getMake(repairList[i].getVIN())).equals(makes[j]))
                        makesNum[j]++;
            }

            String worstMake = null;
            int worst = 0;

            for (int k = 0; k < numberOfMakes; k++) {
                if (makesNum[k] > worst) {
                    worstMake = makes[k];
                    worst = makesNum[k];
                }
            }
        return worstMake;

        }


        public boolean updateRepairCost ( int ticketNum, double newCost){
            for (int i = 0; i < ticket; i++) {
                if (repairList[i].getNum() == ticketNum) {
                    repairList[i].setCost(newCost);
                    return true;
                }
            }
            return false;

        }

        public boolean deleteRepair ( int ticketNum){
            boolean sign = false;
            for (int i = 0; i < ticket; i++) {
                if (repairList[i].getNum() == (ticketNum)) {
                    RepairTicket[] a = new RepairTicket[repairList.length - 1];
                    int j = 0;
                    int k = 0;
                    while (repairList[j].getNum() != ticketNum) {
                        a[j++] = repairList[k++];
                    }
                    ticket--;
                    while (j < ticket) {
                        a[j] = repairList[k + 1];
                        j++;
                        k++;
                    }
                    repairList = a;
                    sign = true;
                }

            }
            return sign;
        }

        public boolean deleteAllRepairsForCar (String VIN){
            boolean sign = false;
            for (int i = 0; i < ticket; i++) {
                if (repairList[i].getVIN().equals(VIN)) {
                    deleteRepair(repairList[i].getNum());
                }
                sign = true;
            }
            return sign;
        }
        public boolean deleteCar (String VIN){
            for (int i = 0; i < numbersOfCars; i++) {
                if (carList[i].getVIN().equals(VIN)) {
                    Car[] a = new Car[carList.length - 1];
                    int j = 0;
                    int k = 0;
                    while (!carList[j].getVIN().equals(VIN)) {
                        a[j++] = carList[k++];
                    }
                    while (j < numbersOfCars) {
                        a[j] = carList[k + 1];
                        j++;
                        k++;
                    }
                    numbersOfCars--;
                    carList = a;
                    return true;
                }
            }
            return false;
        }

        public boolean deleteCarAndRepairs (String VIN){

            if (deleteCar(VIN)) {
                deleteAllRepairsForCar(VIN);
                return true;

            }

            return false;
        }
    }