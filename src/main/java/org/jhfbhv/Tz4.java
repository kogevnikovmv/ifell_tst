package org.jhfbhv;

import java.util.Scanner;

public class Tz4 {
    static Double getAngle(int hours, int minutes) throws IllegalArgumentException {
        Double angle=null;
        Double arrowH;
        Double arrowM;

        if (minutes >= 60) { throw new IllegalArgumentException("minutes must be < 60"); }
        else { arrowM = (double) (minutes * 6); }

        if (hours == 12) { arrowH = 0.0; }
        else { arrowH = hours * 30 + 30 * arrowM/360; }

        if (arrowH > arrowM) { angle = 360 - Math.abs(arrowH-arrowM); }
        else if (arrowH < arrowM) { angle = Math.abs(arrowH-arrowM); }
        else if (arrowH.equals(arrowM)) { angle = 0.0; }

        return angle;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите час: ");
        int hours = in.nextInt();
        System.out.print("Введите минуты: ");
        int minutes = in.nextInt();

        System.out.println("Угол между часовой и минутной стрелками составляет: ");
        System.out.print(getAngle(hours, minutes));
    }
}
