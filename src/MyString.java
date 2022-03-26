import java.util.Arrays;
import java.util.Locale;

public class MyString {
    private String str;

    MyString(String str) {
        this.str = str;
    }

    public void printLastIndex() {
        System.out.println(this.str.charAt(str.length() - 1));
    }

    public void isStringEndsWith(String tmpStr) {
        System.out.println(this.str.endsWith(tmpStr));
    }

    public void isStartsWith(String tmpStr) {
        System.out.println(this.str.startsWith(tmpStr));
    }

    public void isStringContains(String tmpStr) {
        System.out.println(this.str.contains(tmpStr));
    }

    public void findStringStartIndex(String tmpStr) {
        System.out.println(this.str.indexOf(tmpStr));
    }

    public void replaceSymbols(char oldSymbol, char newSymbol) {
        System.out.println(this.str.replace(oldSymbol, newSymbol));
    }

    public void stringToUp() {
        System.out.println(this.str.toUpperCase(Locale.ROOT));
    }

    public void stringToDown() {
        System.out.println(this.str.toLowerCase(Locale.ROOT));
    }

    public void substringString(int beginIndex, int rndIndex) {
        System.out.println(this.str.substring(beginIndex, rndIndex));
    }

    public void palindromes(String str) {
        String[] words = str.split(" ");
        System.out.println(str);
        System.out.println("\nPalindromes:");

        for (int i = 0; i < words.length; i++) {
            String[] symbols = words[i].split("");

            int left = 0, right = symbols.length - 1;
            boolean symmetric = true;

            while (left < right) {
                if (!(symbols[left].equalsIgnoreCase(symbols[right]))) {
                    symmetric = false;
                    break;
                }
                left++;
                right--;
            }
            if (symmetric && words[i].length() != 1 && words[i].length() != 0)
                System.out.println(words[i]);
        }
    }

    public void WordsFrom3To5(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 3 && words[i].length() <= 5)
                System.out.println(words[i]);
        }
    }

    public void smallestWorld(String str) {
        String[] words = str.split(" ");
        int smallSize = words[0].length();
        String smallWorld = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallSize && words[i].length() != 0) {
                smallSize = words[i].length();
                smallWorld = words[i];
            }
        }
        System.out.println("\nSmallest world: " + smallWorld);
    }

    public void biggestWorld(String str) {
        String[] words = str.split(" ");
        int bigSize = words[0].length();
        String bigWorld = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > bigSize) {
                bigSize = words[i].length();
                bigWorld = words[i];
            }
        }
        System.out.println("\nBiggest world: " + bigWorld);
    }

    public void expression() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("\n" + stringBuilder.append(3).append("+").append(56).append("=").append(59));
        stringBuilder.delete(0, stringBuilder.length());
        System.out.println(stringBuilder.append(3).append("-").append(56).append("=").append(-53));
        stringBuilder.delete(0, stringBuilder.length());
        System.out.println(stringBuilder.append(3).append("*").append(56).append("=").append(168));
    }

    public void combine(String firstStr, String secondStr) {
        String[] firstArr = firstStr.split("");
        String[] secondArr = secondStr.split("");
        StringBuilder newWorld = new StringBuilder();

        for (int i = 0; i < firstArr.length / 2; i++) {
            newWorld.append(firstArr[i]);
        }

        for (int j = secondArr.length / 2; j < secondArr.length; j++) {
            newWorld.append(secondArr[j]);
        }
        System.out.println("\n" + newWorld);
    }
}



