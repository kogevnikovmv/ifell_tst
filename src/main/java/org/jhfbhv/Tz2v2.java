package org.jhfbhv;

import java.util.*;

public class Tz2v2 {

    private static final String LUcaseABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static String baseStr = "HelLo";


    public static void main(String[] args) {

        duplicateSymbol(baseStr);

        System.out.println("Хотите попробовать рандомную строку?: ");
        System.out.print("""
                Y/N
        """);
        System.out.print("--> ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            Random rnd = new Random();
            String rndString = "";
            for (int i = 1; i <= 10; ++i) {
                rndString += LUcaseABC.charAt(rnd.nextInt(LUcaseABC.length()));
            }
            duplicateSymbol(rndString);
        } else if (answer.equalsIgnoreCase("N")) {System.exit(0);}


    }

    private static void duplicateSymbol(String str) {
        HashMap<Character, Integer> mapa = new HashMap<>();
        System.out.print("Строка для поиска задублированных символов: ");
        System.out.println(str);
        str = str.toLowerCase();
        for (int i = 0; i <= str.length()-1; ++i) {
            if (!mapa.containsKey(str.charAt(i))) {
                mapa.put(str.charAt(i), 1);
            } else {mapa.put(str.charAt(i), mapa.get(str.charAt(i))+1);}
        }
        System.out.println("Задублированные символы: ");
        for (Map.Entry<Character, Integer> chr : mapa.entrySet() ) {
            if (chr.getValue() > 1) {
                System.out.println(chr.getKey());
            }
        }
    }
}
