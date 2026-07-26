import java.util.Scanner;

import java.util.Scanner;
public class removee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],tm[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int t=sc.nextInt(),c=0,j=0;
        for(int i=0;i<n-1;i++){
            if(a[i]!=t){
                c++;
               tm[j++]=a[i];
            }


            for(int k:tm) {

                System.out.print(k + " ");
            }
            System.out.println();

        }
        System.out.println(c);
    }
}
