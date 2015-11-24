/**
 * Created by Алинка on 17.11.2015.
 */
public class Player {
    private char simb;

    public Player(char simb) {
        this.simb = simb;
    }

    public char getSimb() {
        return simb;
    }

    public boolean move(String scan, Game f) {
        String s = String.valueOf(scan);
        int x = 0;
        try {
            x = Integer.parseInt(s);
            return f.move(--x, simb);
        } catch (Exception ex) {
            System.out.println("Try again");
            return false;
        }

    }
}
