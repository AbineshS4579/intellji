import java.util.Scanner;
class bank{
    private int pin,balance;
    bank(int pin,int balance){
        this.pin=pin;
        this.balance=balance;
    }
    int banks(){
       return pin;
    }
    void am(int d){
        balance+=d;
    }
    void display(int w)throws Exception{
        if(balance<w)
            throw new Exception("Invalid balance.....");
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
                System.out.print("Set a ATM pin:");
                int pt=s.nextInt();
                System.out.print("Enter the initial depositing amount:");
                int ib=s.nextInt();

                bank o = new bank(pt,ib);
                boolean l=true;
                int d=2,y=0;
                do {

                while(l) {
                    System.out.print("Enter ATM pin:");
                    int p = s.nextInt();
                    if(o.banks()==p){
                        System.out.println("pin is correct...");
                        d=2;
                        break;
                    }
                    else if(d>0){
                        System.out.println("please enter vailed pin you have only "+d+" chance");
                        d--;
                    }
                    else {
                        System.out.println("your account is locked due invalid pin entered.....");
                        return ;
                    }
                }

                    System.out.print("1.Deposite\n2.Withdraw\n3.check Balance\nOther wise Enter :0 \nEnter the what the process you need:");
                    int x = s.nextInt();
                    y++;
                    switch (x) {
                        case 1:
                            System.out.print("Enter Deposit amount:");
                            int m = s.nextInt();
                            o.am(m);
                            System.out.println("Balance:" + o.show());
                            break;
                        case 2:
                            System.out.print("Enter Withdraw amount:");
                            int w = s.nextInt();
                            o.display(w);
                            System.out.println("Balance:" + o.show());
                            break;
                        case 3:
                            System.out.println("Balance:" + o.show());
                            break;
                        default:
                            return;

                    }
                }while(y<5);
                System.out.println("Your limit is over....");

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}
