package Zad3Kalkulator;

import myUtils.MyTerminal;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        FileNIO myFileNIO =
                new FileNIO("E:/JAVA/sda/SZKOLENIE/Projects/7Dodatkowe_MarcinChodkowski/Zad3Kalkulator.txt");

        MyTerminal.PrintInfo("Twoj wynik to: " + (int) calculator.getVariable());
        MyTerminal.PrintInfo("Co chcesz zrobić?");
        MyTerminal.PrintInfo("");
        MyTerminal.PrintInfo("Nasze opcje to:");
        MyTerminal.PrintInfo("- dodaj X");
        MyTerminal.PrintInfo("- odejmij X");
        MyTerminal.PrintInfo("- mnóż X");
        MyTerminal.PrintInfo("- dziel X");
        MyTerminal.PrintInfo("- czysc");
        MyTerminal.PrintInfo("- koniec");
        boolean stop = false;
        do {

            String str = MyTerminal.getString("Co chcesz zrobić?");
            // String str="dodaj 2";
            List<String> myList = Arrays.asList(str.split(" "));
            // System.out.println(myList);
            String sCommad = myList.get(0);
            String sValue = "";
            if (!sCommad.equals("koniec")) {
                sValue = myList.get(1);
            }


            String strToWrite = String.format("%s %s\r\n", sCommad, sValue);
            switch (sCommad) {
                case "dodaj": {
                    calculator.add(Double.valueOf(sValue));
                    myFileNIO.writeToFile(strToWrite);
                    break;
                }
                case "odejmij": {
                    calculator.sub(Double.valueOf(sValue));
                    myFileNIO.writeToFile(strToWrite);
                    break;
                }
                case "mnóż": {
                    calculator.multiplay(Double.valueOf(sValue));
                    myFileNIO.writeToFile(strToWrite);
                    break;
                }
                case "dziel": {
                    try {
                        calculator.divide(Double.valueOf(sValue));
                        myFileNIO.writeToFile(strToWrite);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case "czyść": {
                    calculator.clear();
                    myFileNIO.writeToFile(strToWrite);
                    break;
                }
                case "koniec":
                    stop = true;
                    myFileNIO.writeToFile("\r\n");
                    break;
                default: {
                    System.out.println("Nieznana komenda");
                }
            }
            ;

            MyTerminal.PrintInfo("Twoj wynik to: " + calculator.getVariable());

        } while (!stop);
    }


}
