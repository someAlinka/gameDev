/**
 * Created by Алинка on 18.11.2015.
 */
public class Game extends Field {
    public Field seField = new Field();

    public String toString() {
        String printField = "", s = "";
        for (int i = 0; i < seField.field.length; i++) {
            if ((i + 1) % 3 == 0) {
                s = seField.getSeField()[i] + "\n";
            } else {
                s = seField.getSeField()[i] + "|";
            }
            printField += s;
        }
        return printField;
    }

    public boolean move(int i, char s) {
        if (seField.getSeField()[i] == '_') {
            seField.setSimbol(i, s);
            return true;
        }else{
            return false;
        }

    }
}
