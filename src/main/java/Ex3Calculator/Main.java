package Ex3Calculator;

import myUtils.MyTerminal;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        FileNIO myFileNIO =
                new FileNIO("E:/JAVA/sda/SZKOLENIE/Projects/7Dodatkowe_MarcinChodkowski/Ex3Calculator.txt");

        MyTerminal.PrintInfo("Your result is: " + (int) calculator.getVariable());
        MyTerminal.PrintInfo("CWhat do you want to do?");
        MyTerminal.PrintInfo("");
        MyTerminal.PrintInfo("Your options:");
        MyTerminal.PrintInfo("- add X");
        MyTerminal.PrintInfo("- sub X");
        MyTerminal.PrintInfo("- multiply X");
        MyTerminal.PrintInfo("- divide X");
        MyTerminal.PrintInfo("- clear");
        MyTerminal.PrintInfo("- quit");
        boolean stop = false;
        do {

            String str = MyTerminal.getString("What do you want to do?");
            List<String> myList = Arrays.asList(str.split(" "));
            // System.out.println(myList);
            String sCommand = myList.get(0);
            String sValue = "";
            if (myList.size()>1) {
                sValue = myList.get(1);
            }


            String strToWrite = String.format("%s %s\r\n", sCommand, sValue);
            switch (sCommand) {
                case "add": {
                    calculator.add(Double.valueOf(sValue));
                    myFileNIO.writeToFile(strToWrite);
                    break;
                }
                case "sub": {
                    calculator.sub(Double.valueOf(sValue));
                    myFileNIO.writeToFile(strToWrite);
                    break;
                }
                case "multiply": {
                    calculator.multiplay(Double.valueOf(sValue));
                    myFileNIO.writeToFile(strToWrite);
                    break;
                }
                case "divide": {
                    try {
                        calculator.divide(Double.valueOf(sValue));
                        myFileNIO.writeToFile(strToWrite);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case "clear": {
                    calculator.clear();
                    myFileNIO.writeToFile(strToWrite);
                    break;
                }
                case "quit":
                    stop = true;
                    myFileNIO.writeToFile("\r\n");
                    break;
                default: {
                    System.out.println("Unknown command");
                }
            }
            ;

            MyTerminal.PrintInfo("Your result is: " + calculator.getVariable());

        } while (!stop);
    }


}

/*OUTPUT
Your result is: 0
CWhat do you want to do?

Your options:
- add X
- sub X
- multiply X
- divide X
- clear
- quit
What do you want to do?
add 5
Your result is: 5.0
What do you want to do?
sub 1
Your result is: 4.0
What do you want to do?
multiply 2
Your result is: 8.0
What do you want to do?
divide 2
Your result is: 4.0
What do you want to do?
clear
Your result is: 0.0
What do you want to do?
quit
Your result is: 0.0

Process finished with exit code 0
 */