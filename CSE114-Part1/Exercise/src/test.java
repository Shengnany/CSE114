
public class test {
    public static void main(String[] args) {
       tuna member1= new tuna("megan","fox");
       tuna member2=new tuna("natalie","botman");
       tuna member3=new tuna("taylor","swift");
       // each object can't see other members' names but they can see the total
        // if member is not static, then each time you build an object, you should follow member++
        System.out.println();
        System.out.println(member1.getFirst());
        System.out.println(member1.getSecond());
        System.out.println(member1.getTotal());//total is static so it is 3
        System.out.println(tuna.getTotal());//static --static; instance-static/instance
    }
}


