import java.util.HashMap;
import java.util.Map;

public class Main {

    protected static final String text = "Lorem ipsum dolor sit amet, consectetur " +
            "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore " +
            "magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco " +
            "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
            "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
            "mollit anim id est laborum.";

    public static void main(String[] args) {
        char[] kitSymbols = text.toCharArray();


        Map<Character, Integer> symbols = new HashMap<>();

//        for (int i = 0; i < kitSymbols.length; i++) {
//
//            System.out.println(symbols[i] + " цена = " + prices[i] + " руб./шт.");
//        }


        for (Character currentSymbols : kitSymbols) {
            int value = symbols.get(currentSymbols);
            if (Character.isLetter(currentSymbols) && simbols.equals(currentSymbols)) {

                System.out.println(currentSymbols + " - " + value);
            }
            //System.out.println(currentSymbols + " - " + value);
        }

        for (Map.Entry<Character, Integer> currentSymbols : symbols.entrySet()) {
            if (Character.isLetter(symbols) && symbols.equals(currentSymbols)) {

                System.out.println(currentSymbols + " - " + value);
            }
        }

        Map.Entry<Character, Integer> maxSymbols = getMaxSymbol(symbols);
        Map.Entry<Character, Integer> minSymbols = getMinSymbol(symbols);
        System.out.println();


    }
    protected static Map.Entry<Character, Integer> maxSymbols(Map<Character, Integer> symbols){
        int maxCount = -1;
        Map.Entry<Character, Integer> rezultEntry = null;
        for (Map<Character, Integer> currentEntry : symbols.entrySet()){
            if (currentEntry.getValue() > maxCount) {

            }
        }
    }
}