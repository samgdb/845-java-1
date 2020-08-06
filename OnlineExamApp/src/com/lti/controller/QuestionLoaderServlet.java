package com.lti.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.model.Question;
import com.lti.model.QuestionBankLoader;

/**
 * Servlet implementation class QuestionLoaderServlet
 */
@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	//int qNo = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		QuestionBankLoader qbLoader = new QuestionBankLoader();
		List<Question> ListOfQuestions = qbLoader.loadQuestionsOnJava();
		
		HttpSession session = request.getSession();
		
		Integer qNo = (Integer) session.getAttribute("gNo");
		if(qNo == null)
			qNo = 0;
		
		if(qNo == ListOfQuestions.size())
			response.sendRedirect("viewScore.jsp");
		else {
			Question nextQuestion = ListOfQuestions.get(qNo++);
			
			session.setAttribute("gNo", qNo);
			session.setAttribute("nextQs", nextQuestion);
			
			response.sendRedirect("viewQuestion.jsp");
		}
	}			
}