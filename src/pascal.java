public class pascal {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            int n=1;
            for(int j=0;j<=i;j++){
                System.out.print(n);
                n=n*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
