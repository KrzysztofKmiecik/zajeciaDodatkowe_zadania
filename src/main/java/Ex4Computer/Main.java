package Ex4Computer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer(10, "Intel", EProcessor.MULTICORE);
        Computer computer2 = new Computer(20, "AMD", EProcessor.SINGLECORE);
        Laptop laptop1 = new Laptop(30, "Intel", EProcessor.MULTICORE, 15.6, true);
        Laptop laptop2 = new Laptop(40, "AMD", EProcessor.SINGLECORE, 14, false);
        List<Computer> myComputerList = new ArrayList<>();
        myComputerList.add(computer1);
        myComputerList.add(computer2);
        myComputerList.add(laptop1);
        myComputerList.add(laptop2);

        for (Computer comp : myComputerList) {
            System.out.print(comp);
            if (comp instanceof Laptop) {
                System.out.print(String.format("Screen size=%.1f",((Laptop) comp).getScreen()));
            }
            System.out.println();
        }
    }
}
/*OUTPUT
Computer(power=10, manufacturer=Intel, processor=MULTICORE)
Computer(power=20, manufacturer=AMD, processor=SINGLECORE)
Computer(power=30, manufacturer=Intel, processor=MULTICORE)Screen size=15,6
Computer(power=40, manufacturer=AMD, processor=SINGLECORE)Screen size=14,0
 */

