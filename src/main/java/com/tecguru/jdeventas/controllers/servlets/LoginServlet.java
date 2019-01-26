package com.tecguru.jdeventas.controllers.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.tecguru.jdeventas.models.requests.LoginRequest;
import com.tecguru.jdeventas.models.requests.Request;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		 StringBuilder json = new StringBuilder();
			String str_;
	        while ((str_ = request.getReader().readLine()) != null) {
	            json.append(str_);
	        }
	        str_ = json.toString();
	        final Gson gson = new Gson();
	        final LoginRequest loginRequest = gson.fromJson(str_, LoginRequest.class);
	        
	        response.setContentType("application/json;charset=UTF-8");
	        
	        if(loginRequest.getUser().compareTo("dtvv")==0 && loginRequest.getPassword().compareTo("123456")==0) {
	    		
	    		final Request request_ = new Request();
	    		request_.setResult(true);
	    		
	    		final String json_ = gson.toJson(request_);
	    		
	    		ServletOutputStream out = response.getOutputStream();
	    		out.print(json_);
	        }
	        else {
	        	
	        	final Request request_ = new Request();
	    		request_.setResult(false);
	    		
	    		final String json_ = gson.toJson(request_);
	    		
	    		ServletOutputStream out = response.getOutputStream();
	    		out.print(json_);
	        }
		 
	}

}
