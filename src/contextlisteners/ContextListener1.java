package contextlisteners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener1 implements ServletContextListener{
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {		
		//Proje Deploy Edildi�inde �al���r.
		System.out.println("context contextDestroyed1...");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//Proje Destroy Edildi�inde �al���r.
		System.out.println("context initialized 1...");		
	}
	
}
