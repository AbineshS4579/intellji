import java.util.Scanner;

public class dayfind {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("year:");
        int ye=s.nextInt();
        System.out.print("month:");
        int m=s.nextInt();
        System.out.print("date:");
        int d=s.nextInt();
        int y=(ye-1)%400;
        int o=(((y/4)*2)+(y-(y/4)))%7;
        int a[]={0,3,3,6,8,11,13,16,19,21,24,26};
        int om=ye%100==0&&ye%400==0?a[m-1]+d+o+1:ye%4==0?a[m-1]+d+o+1:a[m-1]+o+d;
//        int om=a[m-1]+o+d;
        switch(om%7){
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
        }
    }
}
