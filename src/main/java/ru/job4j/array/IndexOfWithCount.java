package ru.job4j.array;

public class IndexOfWithCount {
        public static int indexOf(char[] string, char c, int number) {
            String str = new String(string);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c && number == 1) {
                    int index1 = str.indexOf(c);
                    return index1;
                } else
                if (str.charAt(i) == c && number != 1) {
                    int index2 = str.indexOf(c, str.indexOf(c) + 1);
                    return index2;
                }
            }
            return -1;
        }
}