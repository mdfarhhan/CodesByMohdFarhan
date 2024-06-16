public class BitManipulation {
    public static void main(String[] args) {
        // getbit(5,2);
        // setbit(5,1);
        // clearbit(5,2);
        // updatebit(5,2,0);
        
    }
    static void getbit(int n,int pos){
        int  bitmask= 1<<pos;
        if((bitmask & n)==0){
            System.out.println("bit was zero");

        }
        else{
            System.out.println("bit was one");
        }
    }
    static void setbit(int n,int pos){
        int  bitmask= 1<<pos;
        int newnumber = (bitmask | n);
        System.out.println(newnumber);
    }
    static void clearbit(int n,int pos){
        int bitmask=1<<pos;
        int newnumber = n & (~(bitmask));
        System.out.println(newnumber);
    }
    static void updatebit(int n,int pos,int oper){
        int  bitmask= 1<<pos;
        if(oper == 1){
        int newnumber = (bitmask | n);
        System.out.println(newnumber);
        }
        else{
        int newnumber = n & (~(bitmask));
        System.out.println(newnumber);
        }
    }
    
}
