package Ex6MyDate;

import org.junit.Assert;
import org.junit.Test;

public class MojaDataTest {

    @Test
    public void showDate_a1b11c2011da_1d11d2011() {
        MyDate myDate = new MyDate(1, 11, 2011);
        String expected = new String("1.11.2011");
        String actual = myDate.showDate('a');
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
    public void showDate_a1b1c2011db_01d01d2011(){
      MyDate myDate=new MyDate(1,1,2011);
      String expected =new String("01.01.2011");
      String actual =myDate.showDate('b');
      Assert.assertEquals(expected,actual);

  }
@Test
    public void showDate_a1b1c2011dc_1sty2011(){
      MyDate mojaData=new MyDate(1,1,2011);
      String expected=new String("1 sty 2011");
      String actual = mojaData.showDate('c');
      Assert.assertEquals(expected,actual);
}
    @Test
    public void showDate_a1b1c2011dd_1sty2011(){
        MyDate mojaData=new MyDate(1,1,2011);
        String expected=new String("");
        String actual = mojaData.showDate('d');
        Assert.assertEquals(expected,actual);
    }
}