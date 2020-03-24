public class tuna {
    private String first;
    private String second;
    public static int total = 0; //static means all of the objects share the same variable

    public tuna(String fn, String sn) {
        first = fn;
        second = sn;
        total++;
        System.out.printf("members: %s,%s , total is:c%d", first, second, total);
    }


    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public static int getTotal() {//define a method static
        return total;
    }
}