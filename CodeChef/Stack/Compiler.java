/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main(String[] args) throws java.lang.Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numOfTestCases = scanner.nextInt();

        for (int i = 0; i < numOfTestCases; i++) {
            parseLine(scanner.next());
        }
    }

    private static void parseLine(String input) {
        Stack<Character> stack = new Stack<>();
        int matching = 0;
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == '<') {
                stack.push(c);
            } else {
                if (stack.empty()) break;

                stack.pop();
                if (stack.isEmpty()) {
                    matching = i + 1;
                }
            }
        }
        System.out.println(matching);
    }
}
