package org.jhfbhv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tz2 {
    public static void main(String[] args) {
        String string = "HelLo";
        int count=0;

        string=string.toLowerCase();
        outer:
        for (int i=0; i<string.length(); ++i) {
            for (int j=0; j<string.length(); ++j) {
                if (i!=j && string.charAt(i) == string.charAt(j)) {
                    System.out.println(string.charAt(i));
                    break outer;
                }
            }
        }
        /*
        String text="HelLo";
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);*/
    }
}
