import java.util.Scanner;

public class oxgame {
    public static void check(int a[][]){
        for(int i=0;i<3;i++){
            if(a[i][0]==a[i][1]&&a[i][0]==a[i][2])
        }
    }
    public static void display(int a[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]==0)
                System.out.print(" - ");
                else if(a[i][j]==1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print(" @ ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a[][]=new int[3][3];
        int i=0;
        while(i<4){
            int x=s.nextInt();

            int n=x/3,m=x%3;
            while(a[n][m]!=0){
                System.out.println("Enter");
                int y=s.nextInt();
                n=y/3;
                m=y%3;
            }
            a[n][m]=1;
            display(a);
            x=s.nextInt();
            n=x/3;
            m=x%3;
            while(a[n][m]!=0){
                System.out.println("Enter");
                int y=s.nextInt();
                n=y/3;
                m=y%3;
            }
            a[n][m]=2;
            check(a);
            display(a);
            i++;
        }

    }
}
