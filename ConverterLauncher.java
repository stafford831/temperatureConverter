import java.util.Scanner;

public class ConverterLauncher {
    public static TemperatureConverter temperatureConverter;

    public static int preConditions () {
        Scanner scanner = new Scanner((System.in));
        int index;
        do {
            System.out.println("Введите индекс конвертера температуры: ");
            System.out.println("1 - из Цельсия в Фаренгейт");
            System.out.println("2 - из Фаренгейт в Цельсий");
            System.out.println("3 - из Цельсия в Кельвин");
            System.out.println("4 - из Кельвина в Цельсий");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число. Пожалуйста введите число: ");
                scanner.next();
            }
            return scanner.nextInt();
        } while ((index < 1) || (index > 4));
    }

    public static float choseTemperature () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру для конвертации:");
        while (!scanner.hasNextFloat()) {
            System.out.println("Вы ввели не число. Пожалуйста введите число: ");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    public static void main(String[] args) {
        int preConditionsResult = preConditions();
        float temperature = choseTemperature();
        ConvertType convertType = ConvertType.getConvertTypeByCode(preConditionsResult);
        switch (convertType){
            case CELSIUM_TO_FAHRENHEIT:
                temperatureConverter = new CelciusToFarenheitConverter();
                System.out.println("Температура равна " + temperatureConverter.convert(temperature) + " Фаренгейт");
                break;
            case FAHRENHEIT_TO_CELSIUM:
                temperatureConverter = new FarenheitToCelciusConverter();
                System.out.println("Температура равна " + temperatureConverter.convert(temperature) + " Цельсий");
                break;
            case CELSIUM_TO_KELVIN:
                temperatureConverter = new CelciusToKelvinConverter();
                System.out.println("Температура равна " + temperatureConverter.convert(temperature) + " Кельвин");
                break;
            case KELVIN_TO_CELSIUM:
                temperatureConverter = new KelvinToCelciusConverter();
                System.out.println("Температура равна " + temperatureConverter.convert(temperature) + " Цельсий");
        }
    }
}
