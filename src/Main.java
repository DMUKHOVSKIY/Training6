public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString("I like Java!!!");
        myString.printLastIndex();
        myString.isStringEndsWith("!!!");
        myString.isStartsWith("I like");
        myString.isStringContains("Java");
        myString.findStringStartIndex("Java");
        myString.replaceSymbols('a', 'o');
        myString.stringToUp();
        myString.stringToDown();
        myString.substringString(2,6);
        myString.palindromes("Дед пошел в кабак и увидел шалаш");
        System.out.println();
        myString.WordsFrom3To5("Суп пюре картошка фри гг");
        myString.smallestWorld("God good fog ok fridge grow");
        myString.biggestWorld("God good fog ok fridge grow");
        myString.expression();
        myString.combine("Exercise", "good");
    }
}
