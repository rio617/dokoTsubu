package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MuttersDAO;
import dao.UsersDAO;


@WebServlet("/Daotest")
public class Daotest extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//動作確認
		UsersDAO dao=new UsersDAO();
		dao.connectCheck();
		//動作確認
		MuttersDAO mdao =new MuttersDAO();
		mdao.connectCheck();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
