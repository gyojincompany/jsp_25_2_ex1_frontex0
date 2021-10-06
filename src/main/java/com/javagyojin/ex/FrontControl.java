package com.javagyojin.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControl
 */
@WebServlet("*.do")//Ȯ���� �������� ����->��� Ŭ���̾�Ʈ ��û�� FrontControl�� ���ߵ�
public class FrontControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 //System.out.println("����Ʈ ��Ʈ�ѷ��� �����");
		
		String uri = request.getRequestURI();
		//System.out.println(uri);
		String conPath = request.getContextPath();
		//System.out.println(conPath);
		String command = uri.substring(conPath.length());
		
		if(command.equals("/insert.do")) {
			System.out.println("insert command ȣ��");
		} else if(command.equals("/delete.do")) {
			System.out.println("delete command ȣ��");
		} else if(command.equals("/update.do")) {
			System.out.println("update command ȣ��");
		}
	}
}