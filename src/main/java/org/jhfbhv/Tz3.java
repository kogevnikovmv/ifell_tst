import java.util.Scanner;

public class Tz3 {

    public static void main(String[] args) {
        BaseConverter baseConverter = new BaseConverter();
        double convertedTemp;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите температуру в С: ");
        int tempC = in.nextInt();
        System.out.println("В какие градусы Вы хотите конвертировать?");
        System.out.println("""

                        1 - градусы Фаренгейта
                        2 - градусы Кельвина
                """);
        System.out.print("Выберете номер: ");
        int choice = in.nextInt();

        convertedTemp = baseConverter.convert(tempC, choice);
        System.out.println(convertedTemp);
    }

    static class BaseConverter {
        private double result;
        public double convert(int tempC,int choice) {
            switch (choice) {
                case (1): // градусы Фаренгейта
                    result = tempC*1.8+32;
                    break;
                case (2): // градусы Кельвина
                    result = tempC+273.15;
                    break;
            }
            return result;
        }
    }
}
