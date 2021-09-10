

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//rota para esta Servlet ex. www.site.com.br/listar
@WebServlet(asyncSupported = true, urlPatterns = { "/listar" })
public class ListarDocumentos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListarDocumentos() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/** 
		 * A pasta "Teste" pode ser colocada em qualquer local, só fique atento ao caminho
		 * 
		 * request.getParameter("nome"); -> resgata o parâmetro da url ($_GET["nome"] -> em PHP)
		 * 
		 * response.getWriter().append(""); -> mostrar na página do navegador as informações (echo -> em PHP)
		 *
		 * 
		 **/
		
		try {
			/*request.getParameter("grupo");
			request.getParameter("cliente");
			response.getWriter().append("");*/
			
			/*** Manipular aqui ****/
			// 
			
		} catch (Exception e) {
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
