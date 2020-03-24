//Shengnan You
//112361646
//CSE 114
//hw#6
public class HexBinDec {

    public static void main(String[] args){
        try {
            System.out.println(hex2Dec("12A"));
        }
        catch (HexFormatException ex ){
            System.out.println(ex.getMessage());
        }
        try{
            System.out.println(hex2Dec("dds"));
        }
        catch (HexFormatException ex ){
            System.out.println(ex.getMessage());
        }
        try{
            System.out.println(bin2Dec("10"));
        }
        catch (BinaryFormatException ex){
            System.out.println(ex.getMessage());
        }
        try{
            System.out.println(bin2Dec("12"));
        }
        catch (BinaryFormatException ex){
            System.out.println(ex.getMessage());
        }
    }


    public static int hex2Dec(String hexString) throws HexFormatException {
        int power = 0;
        int total = 0;
        for (int i = hexString.length()-1; i >= 0; i--) {

            char a = hexString.charAt(i);
            int temp;
            if (('A' <= a) && (a <='F')) {
                temp = (a - 'A' + 10);
                total += temp * Math.pow(16, power);
                power++;
            }

            else if (('a' <= a) && (a <='f')) {
                temp = (a - 'a' + 10);
                total += temp * Math.pow(16, power);
                power++;
            }

            else if (('0' <= a) && (a <='9')) {
                temp = (a - '0');
                total += temp * Math.pow(16, power);
                power++;
            } else throw new HexFormatException();
        }


        return total;

    }
    public static int bin2Dec(String binString) throws BinaryFormatException {
        int power = 0;
        int total = 0;
        for (int i = binString.length()-1; i >= 0; i--) {

            char a = binString.charAt(i);
            int temp = 0;

            if (('0' <= a) && (a <'2')) {
                temp = (a - '0');
                total += temp * Math.pow(2, power);
                power++;
            } else throw new BinaryFormatException();
        }


        return total;

    }

}
