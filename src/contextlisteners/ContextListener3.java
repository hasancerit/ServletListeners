package contextlisteners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;

@WebListener
public class ContextListener3 implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {		
		System.out.println("context contextDestroyed3...");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context initialized 3...");		
	}
	
}
