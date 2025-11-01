import java.util.ArrayList;
import java.util.HashSet;

class PracticeProblem {

    public static void main(String[] args) {
        System.out.println(perms("abc"));  
        System.out.println(permsUnique("aab"));  
    }

    public static ArrayList<String> perms(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str.length() == 0) {
            result.add("");
            return result;
        }
        char first = str.charAt(0);
        String remainder = str.substring(1);
        ArrayList<String> words = perms(remainder);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                result.add(word.substring(0, i) + first + word.substring(i));
            }
        }
        return result;
    }

    public static ArrayList<String> permsUnique(String str) {
        HashSet<String> set = new HashSet<>(perms(str));
        return new ArrayList<>(set);
    }
}
