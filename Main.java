import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables
        //Colours
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String RESET = "\u001B[0m";
        String YELLOW = "\u001B[33m";
        //Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println(STR."\{YELLOW}---------------------------------------------------------\n         Welcome to the Temperature Converter!\n       This Program will convert your temperatures\n                   to another unit!");
        System.out.println(STR."\{YELLOW}     What Unit would you like to start with (C/F/K)");

        String TempUnit = sc.nextLine();

        switch (TempUnit) {
            case "c":
            case "C":
                System.out.println(STR."\{YELLOW}        Now that you have chosen Celsius\n   please choose the Amount of the Unit of Temp\n           you would like to transfer");

                double amountOfTemp = sc.nextDouble();
                double amountOfTempF = amountOfTemp * 1.8 + 32;
                double amountOfTempK = amountOfTemp + 273.15;

                System.out.println(STR."\{YELLOW}\{amountOfTemp} Celcius is equal to...");
                System.out.println(STR."\{YELLOW}Fahrenheit: \{amountOfTempF}");
                System.out.println(STR."\{YELLOW}Kelvin: \{amountOfTempK}");
                System.out.println(STR."\{YELLOW}---------------------------------------------------------");

                break;

            case "k":
            case "K":
                System.out.println("""
                                Now that you have chosen Kelvin
                           please choose the Amount of the Unit of Temp
                                   you would like to transfer\
                        """);

                double amountOfTemp1 = sc.nextDouble();
                double amountOfTemp1F = amountOfTemp1 -273.15 * 1.8 + 32;
                double amountOfTemp1C = amountOfTemp1 - 273.15;

                System.out.println(STR."\{YELLOW}       \{amountOfTemp1} Kelvin is equal to...");
                System.out.println(STR."\{YELLOW}       Fahrenheit: \{amountOfTemp1F}");
                System.out.println(STR."\{YELLOW}       Celcius: \{amountOfTemp1C}");
                System.out.println(STR."\{YELLOW}---------------------------------------------------------");

                break;
            case "f":
            case "F":
                System.out.println(STR."\{YELLOW}        Now that you have chosen Fahrenheit\n   please choose the Amount of the Unit of Temp\n           you would like to transfer");

                double amountOfTemp2 = sc.nextDouble();
                double amountOfTemp2C = (amountOfTemp2 - 32) * 5 / 9;
                double amountOfTemp2K = amountOfTemp2 + (double) (32 * 5) / 9 + 273.15;

                System.out.println(STR."\{YELLOW}\{amountOfTemp2} Fahrenheit is equal to...");
                System.out.println(STR."\{YELLOW}Celcius: \{amountOfTemp2C}");
                System.out.println(STR."\{YELLOW}Kelvin: \{amountOfTemp2K}");
                System.out.println(STR."\{YELLOW}---------------------------------------------------------");

                break;
        }
    }
}
