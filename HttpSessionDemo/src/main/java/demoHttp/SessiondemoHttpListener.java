package demoHttp;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class SessiondemoHttpListener implements HttpSessionListener{
static int totalcount =0,usercount=0;
	
	public void sessionCreated(HttpSessionEvent e) {
		totalcount++;
		usercount++;
	}
	
	public void sessionDestroyed() {
		usercount--;
	}
}
