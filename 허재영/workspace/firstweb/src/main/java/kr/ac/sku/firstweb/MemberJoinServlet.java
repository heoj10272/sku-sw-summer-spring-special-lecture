package kr.ac.sku.firstweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sku.dto.MemberDTO;
import kr.ac.sku.service.MemberService;

/**
 * Servlet implementation class MemberJoinServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/memberJoin" })
public class MemberJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberJoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		MemberDTO member = new MemberDTO();
		member.setName(request.getParameter("name"));
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		member.setEmail(request.getParameter("email"));
		//System.out.println(request.getParameter("name"));
		//System.out.println(request.getParameter("id"));
		//System.out.println(request.getParameter("password"));
		//System.out.println(request.getParameter("email"));
		
		MemberService service = new MemberService();
		service.joinMember(member);
	}

}
