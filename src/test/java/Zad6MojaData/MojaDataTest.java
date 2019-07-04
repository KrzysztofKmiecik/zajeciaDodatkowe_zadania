package Zad6MojaData;

import junitparams.Parameters;
import myUtils.MyTerminal;
import org.junit.Assert;
import org.junit.Test;

public class MojaDataTest {

    @Test
    public void wyswietlDate_a1b11c2011da_1d11d2011() {
        MojaData mojaData = new MojaData(1, 11, 2011);
        String expected = new String("1.11.2011");
        String actual = mojaData.wyswietlDate('a');
        Assert.assertEquals(expected, actual);
    }

  /*  @Test
    @Parameters({"1,11,2011,1.11.2011", "1,1,2011,1.1.2011"})
    public void wyswietlDate_parametrized(int day, int month, int year, String expected) {
        MojaData mojaData = new MojaData(day, month, year);
        String actual = mojaData.wyswietlDate('a');
        Assert.assertEquals(expected, actual);
    }*/

  @Test
    public void wyswietlDate_a1b1c2011db_01d01d2011(){
      MojaData mojaData=new MojaData(1,1,2011);
      String expected =new String("01.01.2011");
      String actual =mojaData.wyswietlDate('b');
      Assert.assertEquals(expected,actual);

  }
@Test
    public void wyswietlDate_a1b1c2011dc_1sty2011(){
      MojaData mojaData=new MojaData(1,1,2011);
      String expected=new String("1 sty 2011");
      String actual = mojaData.wyswietlDate('c');
      Assert.assertEquals(expected,actual);
}
    @Test
    public void wyswietlDate_a1b1c2011dd_1sty2011(){
        MojaData mojaData=new MojaData(1,1,2011);
        String expected=new String("");
        String actual = mojaData.wyswietlDate('d');
        Assert.assertEquals(expected,actual);
    }
}