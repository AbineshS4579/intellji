public class quick {
    static void sort(int a[],int l,int r){
        if(l<r){
            int pi = p(a, l, r);
            sort(a, pi + 1, r);
            sort(a, l, pi - 1);
        }
    }
    static int p(int a[],int l,int r){
        int i=l-1,pi=r;
        for(int j=l;j<r;j++) {
            if (a[j] < a[pi]) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t=a[i+1];
        a[i+1]=a[pi];
        a[pi]=t;
        return i+1;
    }
    public static void main(String[]args){
        int a[]={24,47,28,76,7,4,5,7,45,67,89};
        sort(a,0,a.length-1);
        for(int i:a)System.out.println(i);
    }
}
