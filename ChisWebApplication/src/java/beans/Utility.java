
package beans;
import java.util.ArrayList;
public class Utility {
    public static String[] replaceSingleQuote(String[] inputs) {
        ArrayList<StringBuilder> stringBuilders = new ArrayList();
        for (String input : inputs) {
            StringBuilder sb = new StringBuilder(input);
            stringBuilders.add(sb);
        }
        for (StringBuilder stringBuilder : stringBuilders) {
            for (int index = 0; index < stringBuilder.length(); index++) {
                if (stringBuilder.charAt(index) == '\'') {
                    stringBuilder.setCharAt(index, '’');
                }
            }
        }
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = stringBuilders.get(i).toString();
        }
        return inputs;
    }
    public static String replaceApostrophe(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        for (int index = 0; index < stringBuilder.length(); index++) {
            if (stringBuilder.charAt(index) == '’') {
                stringBuilder.setCharAt(index, '\'');
            }
        }
        input = stringBuilder.toString();
        return input;
    }
}
