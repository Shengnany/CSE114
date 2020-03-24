public class mushroom {


    int month;
    int day;
    int year;

    public mushroom(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }
        public String toString() {
            return String.format("%d/%d/%d",month, day, year);

        }
//any time you need a string representation of an object , use this method
    //toString is a string representation of this object

    }


