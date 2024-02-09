import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * LeetCode17
 */
public class LeetCode17 {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        HashMap<Character, String> digitMap = new HashMap<>();
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");

        StringBuilder currentCombination = new StringBuilder();
        generateCombinations(digits, 0, currentCombination, result, digitMap);

        return result;
    }

    private void generateCombinations(String digits, int index, StringBuilder currentCombination,
            List<String> result, HashMap<Character, String> digitMap) {
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        char currentDigit = digits.charAt(index);
        String possibleLetters = digitMap.get(currentDigit);

        for (int i = 0; i < possibleLetters.length(); i++) {
            currentCombination.append(possibleLetters.charAt(i));
            generateCombinations(digits, index + 1, currentCombination, result, digitMap);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }

    public static void main(String[] args) {
        LeetCode17 obj = new LeetCode17();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        String inputDigits = sc.next();
        List<String> result = obj.letterCombinations(inputDigits);
        System.out.println("Letter Combinations: " + result);

        sc.close();
    }
}
