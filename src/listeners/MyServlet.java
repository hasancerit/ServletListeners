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
		//ContextListener Cal�sacak
				
		//ContextAttrListenerlar calisacak.
		ServletContext servletContext = req.getServletContext();
		servletContext.setAttribute("contextAttr","mContextAttr");
		servletContext.setAttribute("contextAttr","mContextAttr2");
		servletContext.removeAttribute("contextAttr");
		
		/* E�er bir ServletRequestAttributeListener yazm�� olsayd�k, bu kodar i�in onlar da �al��acakt�.
		req.setAttribute("xxx", "yyy");
		req.setAttribute("xxx", "yyy");
		req.removeAttribute("xxx");
		*/
		
		//SessionListenerlar calisacaktir.
		HttpSession session = req.getSession();
		/* E�er bir SessionAttributeListener yazm�� olsayd�k, bu kodar i�in onlar da �al��acakt�.
		session.setAttribute("xxx", "yyy");
		session.setAttribute("xxx", "yyy");
		session.removeAttribute("xxx");
		*/
		
		SessionBindingListener sessionBindingListener = new SessionBindingListener();
		session.setAttribute("Binding Attribute",sessionBindingListener);//Session attr'a bir BindingListener eklenirse,eklenen Listener i�indeki bound metodu calisir
		session.removeAttribute("Binding Attribute");//ekledi�imiz BindingListener� kald�rd�g�m�zda,eklenen Listener i�indeki unbound metodu calisir.
		
		//ContextListener Cal�sacak(Destroy)
	}
}
