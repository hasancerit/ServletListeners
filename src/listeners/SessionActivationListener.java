package listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

@WebListener
public class SessionActivationListener implements HttpSessionActivationListener{
	/*  Uygulamamizin dagitik/distributed bir sekilde calistigini dusunelim. Her serverda farkli JVM olacaktir. 
	 *  Her JVM icin bir ServletContext objesi ve yine her JVM deki Servletlere karsilik ServletConfig objesi olacaktir.
	 *  Sadece HttpSession objesi bir tane olacaktir ! Yani ayni session objesinin kopyasi farkli JVM’lerde olamaz! 
	 *  Bununla birlikte bu HttpSession objesi bir JVMden diger JVM yani bir dagitik sistemden diger dagitik sisteme gecebilir.
	 *  HttpSessionActivationListener arabirimindeki metotlar bu HttpSession objesini farkli JVMler arasinda gecisi/tasinmasi 
	 *  sonrasinda calisacaktir.
	 */
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
	}

}
