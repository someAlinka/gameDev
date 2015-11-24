import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player p1 = new Player('o');
        Player p2 = new Player('x');
        Game f = new Game();
        System.out.println(f.toString());
        Scanner sc = new Scanner(System.in);
        int j = 0;

        while (true) {
            String scan = sc.next();
            if (j % 2 == 0) {
                if(p1.move(scan, f)){
                    System.out.println(f.toString());
                    j++;
                }else{
                    System.out.println("try again");
                }
            } else {
                if(p2.move(scan, f)){
                    System.out.println(f.toString());
                    j++;
                }else{
                    System.out.println("try again");
                }
            }
        }
    }
}
