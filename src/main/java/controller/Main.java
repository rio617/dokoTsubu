package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Mutter;
import model.User;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//つぶやきリストをアプリケーションスコープから取得
		ServletContext application=this.getServletContext();
		List<Mutter> mutterList=(List<Mutter>)application.getAttribute("mutterList");
		//取得できなかった場合はつぶやきリストを新規作成して
		//アプリケーションスコープに保存
		if(mutterList == null) {
			mutterList=new ArrayList<>();
			application.setAttribute("mutterList",mutterList);
		}
		
		//ログインしているか確認するため
		//セッションスコープからユーザー情報を取得
		HttpSession session=request.getSession();
		User loginUser=(User)session.getAttribute("loginUser");
		
		if(loginUser == null) { //ログインしていない場合
			//リダイレクト
			response.sendRedirect("index.jsp");
		}else { //ログイン済みの場合
			//フォワード
			RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/view/main.jsp");
			rd.forward(request, response);
		}
		
	}



}
