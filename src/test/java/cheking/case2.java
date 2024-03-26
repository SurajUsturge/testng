package cheking;

import org.testng.annotations.Test;

public class case2 extends Baseclass{
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String username="Admin";
	String password="admin123";
			
  @Test
  public void case1() 
  {
	  launchapp(url);
	  username(username);
	  password(password);
	  loginBtn();
	  
  }
}
