package listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;


@WebListener
public class ServletRequestListener implements javax.servlet.ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("��lem Bitti...");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("�stek Geldi..");
		
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		String path = req.getContextPath();
		System.out.println(path);		
	}
	
}
