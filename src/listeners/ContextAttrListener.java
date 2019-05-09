package listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextAttrListener implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("Context'e Attr Eklendi("+event.getName()+":"+event.getValue()+")");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("Context'den Attr Silindi("+event.getName()+":"+event.getValue()+")");		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("Context'de Attr Deðiþtirildi("+event.getName()+":"+event.getValue()+")");		
	}

}
