import java.util.Scanner;
public class oxgame {
    public static boolean check(int a[][]) {
        for (int i = 0; i < 3; i++) {
            if (((a[i][0] != 0 && a[i][0] == a[i][1] && a[i][0] == a[i][2]) || (a[0][i] != 0 && a[0][i] == a[1][i] && a[0][i] == a[2][i]))) {
                return true;
            } else if ((a[0][0] != 0 && a[0][0] == a[1][1] && a[0][0] == a[2][2]) || a[0][2] != 0 && a[0][2] == a[2][0] && a[2][0] == a[1][1])
                return true;
        }
        return false;
    }

    public static void display(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] == 0 ? " _ " : a[i][j] == 1 ? " O " : " X ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            int d;
            do {

                int a[][] = new int[3][3];
                System.out.println("ox game");
                display(a);
                for (int i = 0; i < 9; i++) {
                    int p = i % 2;
                    System.out.print("Enter " + (p == 1 ? 'X' : 'O') + " index value(1 to 9):");
                    int x = s.nextInt() - 1;
                    try {
                    if(x>=9||x<=1){i--;throw new Exception("invalid index");}
                    int n = x / 3, m = x % 3;
                    while (a[n][m] != 0) {
                        System.out.print("reEnter:");
                        int y = s.nextInt() - 1;
                        n = y / 3;
                        m = y % 3;
                    }
                    a[n][m] = (p == 1 ? 2 : 1);
                    display(a);
                    if (check(a)) {
                        System.out.println((p != 1 ? "O" : "X") + " is winner");
                        return;
                    }
                    }catch(Exception e){System.out.println(e.getMessage());}
                }
                System.out.println("tie");


                System.out.print("Play again enter 1 \nquit enter 0:");
                d = s.nextInt();
            } while (d != 0);

    }
    }

