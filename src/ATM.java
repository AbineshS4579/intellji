import java.util.Scanner;
class bank{
    private int pin =1207,balance=10000;
    bank(int p)throws Exception{
        if(pin!=p){
            throw new Exception("Invalid pin");
        }
    }
    void am(int d){
        balance+=d;
    }
    void display(int w)throws Exception{
        if(balance<w)
            throw new Exception("Invalid balance");
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
                System.out.print("Enter ATM pin:");
                int p=s.nextInt();
                bank o=new bank(p);
                System.out.println("1.Deposite\n2.Withdraw\n3.Balance");
                int x=s.nextInt();
                switch (x){
                    case 1:
                        System.out.print("Enter Deposit amount:");
                        int m=s.nextInt();
                        o.am(m);
                        System.out.println("Balance:"+o.show());
                        break;
                    case 2:
                        System.out.println("Enter Withdraw amount:");
                        int w=s.nextInt();
                        o.display(w);
                        System.out.println("Balance:"+o.show());
                        break;
                    case 3:
                        System.out.println("Balance:"+o.show());
                        break;
                }

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}
