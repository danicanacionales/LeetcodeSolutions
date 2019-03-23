package string;

public class ToLowerCase {
    /*
    Created by danicanacionales on 22/03/2019

    709. To Lower Case

    Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

    Example 1:
        Input: "Hello"
        Output: "hello"
    */

    public static void main(String[] args) {
        String str = "LOVElY";
        System.out.println(new ToLowerCase().toLowerCase(str));
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
