

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class back {

    public static void bac(List<List<Integer>> l, List<Integer> li, int a[]) {

        if (li.size() == a.length) {
            l.add(new ArrayList<>(li));
            return;
        }

        for (int f : a) {

            if (li.contains(f))
                continue;

            li.add(f);

            bac(l, li, a);

            li.remove(li.size() - 1);
        }
    }

    public static List<List<Integer>> permu(int[] a) {

        List<List<Integer>> l = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        bac(l, li, a);

        return l;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println(permu(a));
    }
}