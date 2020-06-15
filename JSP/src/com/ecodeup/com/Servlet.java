package com.ecodeup.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JavaBeans.Datos;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //public static int contador = 7;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Datos dato = new Datos();
		RequestDispatcher rd= request.getRequestDispatcher("/jsp/bean.jsp");
		request.setAttribute("dato", dato);
		rd.forward(request, response);
		
		/*//Comentarios: Esto es un comentario en JSP
		//Esto es un scriptlet JSP
		out.println();
		out.print("Hola mundo desde JSP");	
		out.println("<br>");
		//Esto es una expresión en JSP
		out.print("Esto es una expresión");
		//Se declara una directiva para utilizar la clase Date
		out.println("<br>");
		Datos dato = new Datos();
		RequestDispatcher rd= request.getRequestDispatcher("/jsp/bean.jsp");
		request.setAttribute("dato", dato);
		rd.forward(request, response);*/
		//@ page import="java.util.Date"
		/*Datos dato = new Datos();
		out.println("Fecha Actual: "+d);
		out.println("<br>");
		//Declaraciones en JSP
		out.println("Valor de la variable contador: "+contador);
		out.println("<br>");
		//Navegador y Versión del Sistema Operativo
		out.print(request.getHeader("USER-AGENT"));*/
		
		//getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);

		//System.out.println("Ingresamos el metodo GET");
		//System.out.println(request.getParameter("var1"));
		//System.out.println(request.getParameter("var2"));
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter writer = response.getWriter();
		//writer.println("E");
		doGet(request, response);
		//System.out.println("Ingresamos el metodo POST");
		//System.out.println(request.getParameter("CUI"));
	}

}
