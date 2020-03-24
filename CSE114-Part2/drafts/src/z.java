class z{

        public static void main(String[] args) {
            tartan(3);
            tartan(4);
        }
        public static void tartan(int n) {
        tartanRec(0, 0,n);
    }


    public static void tartanRec(int m, int n,int w)
    {
        if(m<w) {
            tartanRow(m,n,w);
            System.out.println();
            tartanRec(m+1,n,w);
        }
        else return;
    }


    public static void tartanRow(int m, int n,int w){


              if(n<w) {
                  System.out.print((n % 2 == 0) ? w : w - 1);
                  tartanRow(m,  n+1, w);
              }
        else return;

        }




    }


