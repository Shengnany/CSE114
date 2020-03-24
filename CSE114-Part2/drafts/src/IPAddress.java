public class IPAddress {
    private int intIP;
    public IPAddress(){
    }
    public IPAddress(int intIP){

        this.intIP = intIP;
    }
    public int getIntIP(){
        return intIP;
    }
    public void setIntIP(int intIP){
        this.intIP = intIP;
    }



    public byte[] extractIpaddressInt(int intIP){


        System.out.println("IP Address in single int: " + intIP);
        byte[] bs= new byte[4];
       int newVal=intIP;
        bs[3] = (byte)(intIP%256);
        int newval = intIP/256;
        bs[2] = (byte)(newval%256);
        newval = newval/256;
        bs[1] = (byte)(newval%256);
        bs[0] = (byte)(newval/256);
        for(int j=0;j<3;j++){
            System.out.print(bs[j]+".");
        }
        System.out.println(bs[3]);
        return bs;

    }


    public void setIP(byte[] bs)throws Exception {

        if (bs.length != 4) throw new Exception("Not enough arguments");
        else {

            int power = 0;
            int a = 0;
            for (int i = bs.length - 1; i >= 0; i--) {
                intIP += bs[i] * (int) Math.pow(256, power);
                power++;

            }
        }
    }
    public IPAddress( byte[] bs) throws Exception {
            this.setIP(bs);
        }

        public static void main (String[] args){
            try {
                IPAddress ip1 = new IPAddress(839391568);
                byte[] bs = {50, 8, 25, 81};
                byte[] bsnew = {50, 8, 25, 82};
                IPAddress ip2 = new IPAddress(bs);
                ip1.setIP(bsnew);
                ip2.setIP(bsnew);
                ip1.extractIpaddressInt(ip1.getIntIP());
                ip2.extractIpaddressInt(ip2.getIntIP());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

