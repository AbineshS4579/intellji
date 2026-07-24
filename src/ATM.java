import java.util.Scanner;
class bank{
    private int pin =1207,balance;
    bank(int p)throws Exception{
        if(pin!=p){
            throw new Exception("invalid pin");
        }
    }
    void am(int i,int d){
        balance=i;
        balance+=d;
    }
    void display(int w)throws Exception{
        if(balance<w)
            throw new Exception("invalid balance");
        balance-=w;
    }
    int show(){
        return balance;
    }
        }
    public class ATM {
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            try{
                int p=s.nextInt();
                bank o=new bank(p);
                int n=s.nextInt(),m=s.nextInt();
                o.am(n,m);
                int w=s.nextInt();
                o.display(w);
                System.out.println(o.show());
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}
