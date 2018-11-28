package tasks;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Strings {

    //kek lol kek
    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    //lol kek lol
    public static char toUpper(char c) {
        return Character.toUpperCase(c);
    }

    //3
    public static char changeCase(char c) {
        if (c == Character.toUpperCase(c)) return Character.toLowerCase(c);
        else
            return Character.toUpperCase(c);
    }

    //4
    public static boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    //5
    public static int wordsAmount(String s) {
        return s.split(" ").length;
    }

    //6
    public static void longestWord(String s) {
        int maxLength = 0;
        int maxIndex = -1;
        String mas[] = s.split(" ");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].length() > maxLength) {
                maxLength = mas[i].length();
                maxIndex = i;
            }
        }
        System.out.println(maxLength);
        System.out.println(mas[maxIndex]);
    }

    //7
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    //8
    public static char sameLetters(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') return s.charAt(i);
            }
        }
        return '~';
    }

    //9
    public static boolean isContains(String s1, String s2) {
        return s2.contains(s1);
    }

    //10
    public static void treasure(String[] strings) {
        int x = 0, y = 0;
        String[] directions = new String[strings.length];
        int[] steps = new int[strings.length];
        String[] buffer = new String[2];

        for (int i = 0; i < strings.length; i++) {
            buffer = strings[i].split(" ");
            directions[i] = buffer[0];
            steps[i] = Integer.parseInt(buffer[1]);
        }

        for (int i = 0; i < strings.length; i++) {
            switch (directions[i]) {
                case "North":
                    y += steps[i];
                    break;
                case "South":
                    y -= steps[i];
                    break;
                case "East":
                    x += steps[i];
                    break;
                case "West":
                    x -= steps[i];
                    break;
                default:
                    System.out.println("wrong format");
                    break;
            }
        }
        System.out.printf("x = %d, y = %d", x, y);
    }

    //11
    public static boolean inPalindromeNoSpaces(String s) {
        String str = s.replaceAll(" ", "");
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }

}

