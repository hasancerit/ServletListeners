package listeners;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebListener
public class SessionBindingListener implements HttpSessionBindingListener{
	//SessionBindingListener web.xml veya anotasyon'a ihtiyaci yoktur. Ýstenirse eklenebilir.
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("Session Atrribute'e, bir Session Binding Listener nesnesi eklendi.");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Session Atrribute'e eklenen Session Binding Listener nesnesi kaldýrýldý.");		
	}
	
}
