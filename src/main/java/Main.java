import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string one: ");
        String inputStringOne = in.nextLine();
        System.out.print("Input a string two: ");
        String inputStringTwo = in.nextLine();
        System.out.println(checker(inputStringOne,inputStringTwo));
    }

    public static String checker(String inputStringOne, String inputStringTwo) {


        Map<String, Integer> dictionaryFromStringOne = createMap(inputStringOne);
        Map<String, Integer> dictionaryFromStringTwo = createMap(inputStringTwo);

        if (dictionaryFromStringOne.equals(dictionaryFromStringTwo)) {
            if (mapComparator(dictionaryFromStringOne, dictionaryFromStringTwo))
                return  "Являются перестановкой";
            else return  "Не являются перестановкой";
        } else {
            return "Не являются перестановкой";
        }
    }

    private static Map<String, Integer> createMap(String input) {
        Map<String, Integer> outMap = new HashMap<String, Integer>();
        String[] arrayFromInpustring = input.split("");
        for (String sr : arrayFromInpustring) {
            outMap.put(sr, (input.length() - input.replace(sr, "").length()));
        }
        return outMap;
    }

    public static boolean mapComparator(Map<String, Integer> a, Map<String, Integer> b) {
        boolean returning = true;
        for (String key : a.keySet()) {
            if (!a.get(key).equals(b.get(key))) {
                returning = false;
            }
        }
        return returning;
    }
}
