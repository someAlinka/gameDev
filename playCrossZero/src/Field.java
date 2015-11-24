/**
 * Created by Алинка on 17.11.2015.
 */
public class Field {
    public char[] field = new char[9];

    public Field() {
        for (int i = 0; i < field.length; i++) {
            field[i] = '_';
        }
    }

    public char[] getSeField() {
        return field;
    }

    public void setSimbol(int i, char s) {
        field[i] = s;
    }
}
