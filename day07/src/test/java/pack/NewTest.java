package pack;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
  @Test(dataProvider = "dp")
  public void add(int n, int s,int ans) {
//  System.err.println(n+s);
 int a=n+s;
 Assert.assertEquals(a, ans);
  }
  @Test(dataProvider = "dp")
  public void sub(int n, int s,int ans) {
//  System.err.println(n+s);
 int a=n-s;
 Assert.assertEquals(a, ans);
  }
  @Test(dataProvider = "dp")
  public void mul(int n, int s,int ans) {
//  System.err.println(n+s);
 int a=n*s;
 Assert.assertEquals(a, ans);
  }
  @Test(dataProvider = "dp")
  public void div(int n, int s,int ans) {
//  System.err.println(n+s);
 int a=n/s;
 Assert.assertEquals(a, ans);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 2,3 },
//      new Object[] { 2, 3,5 },
    };
  }
}
