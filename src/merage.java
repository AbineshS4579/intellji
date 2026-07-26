import java.util.Scanner;
public class merage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],m=sc.nextInt(),b[]=new int[m],t[]=new int[n+m];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            t[i]=a[i];
        for(int i=0;i<m;i++)
            t[i+n]=b[i];
        for(int i:t)
            System.out.print(i+" ");

    }
}
