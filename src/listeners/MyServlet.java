package listeners;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/listeners")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ContextListener Calýsacak
				
		//ContextAttrListenerlar calisacak.
		ServletContext servletContext = req.getServletContext();
		servletContext.setAttribute("contextAttr","mContextAttr");
		servletContext.setAttribute("contextAttr","mContextAttr2");
		servletContext.removeAttribute("contextAttr");
		
		/* Eðer bir ServletRequestAttributeListener yazmýþ olsaydýk, bu kodar için onlar da çalýþacaktý.
		req.setAttribute("xxx", "yyy");
		req.setAttribute("xxx", "yyy");
		req.removeAttribute("xxx");
		*/
		
		//SessionListenerlar calisacaktir.
		HttpSession session = req.getSession();
		/* Eðer bir SessionAttributeListener yazmýþ olsaydýk, bu kodar için onlar da çalýþacaktý.
		session.setAttribute("xxx", "yyy");
		session.setAttribute("xxx", "yyy");
		session.removeAttribute("xxx");
		*/
		
		SessionBindingListener sessionBindingListener = new SessionBindingListener();
		session.setAttribute("Binding Attribute",sessionBindingListener);//Session attr'a bir BindingListener eklenirse,eklenen Listener içindeki bound metodu calisir
		session.removeAttribute("Binding Attribute");//eklediðimiz BindingListenerý kaldýrdýgýmýzda,eklenen Listener içindeki unbound metodu calisir.
		
		//ContextListener Calýsacak(Destroy)
	}
}
