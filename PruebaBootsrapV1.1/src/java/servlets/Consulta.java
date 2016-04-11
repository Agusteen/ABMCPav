/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entidades.*;
import java.util.ArrayList;

/**
 *
 * @author agust
 */
public class Consulta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String con = request.getParameter("lblConsulta");
            
            Resultado r = new Resultado();
            r.obtenerDatos("G:\\DocPrueba\\1.txt");
            ListaResultados.getInstance().getLista().add(r);
            
            Resultado r1 = new Resultado();
            r1.obtenerDatos("G:\\DocPrueba\\2.txt");
            ListaResultados.getInstance().getLista().add(r1);
            
            Resultado r2 = new Resultado();
            r2.obtenerDatos("G:\\DocPrueba\\3.txt");
            ListaResultados.getInstance().getLista().add(r2);
            
            Resultado r3 = new Resultado();
            r3.obtenerDatos("G:\\DocPrueba\\4.txt");
            ListaResultados.getInstance().getLista().add(r3);
            response.sendRedirect("ResultadoBusqueda.jsp?consulta=" + con);
            

            //out.println("<html><body><h1>"+con+"</h1><br><a href='index.html'>Volver</a></body></html>");
        }
    }
    
    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        ArrayList l = ListaResultados.getInstance().getLista();
        getServletContext().setAttribute("listaResultados", l);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
