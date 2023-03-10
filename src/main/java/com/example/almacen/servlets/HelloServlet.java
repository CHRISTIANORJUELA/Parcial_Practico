package com.example.almacen.servlets;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import com.example.almacen.controllers.ModelFactoryController;
import com.example.almacen.models.Jewel;
import com.example.almacen.models.ReceiptJewel;
import com.example.almacen.services.ModelFactoryService;
import com.example.almacen.utils.AddValidations;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    ModelFactoryController modelFactoryService = ModelFactoryController.getInstance();
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        String nameUser = request.getParameter("name");
        String quilates = request.getParameter("quilates");
        String nameJewel = request.getParameter("jewel");
        String ounces = request.getParameter("ounces");
        ReceiptJewel receiptJewel = null;
        Map<String,String> wrongs = new HashMap<>();
        wrongs.clear();
        AddValidations.addValidations(wrongs,nameUser,quilates,nameJewel,ounces);
        if (wrongs.size()==0){
            try {
                Jewel jewel1 = new Jewel(nameUser, quilates, nameJewel, Float.parseFloat(ounces));
                receiptJewel = modelFactoryService.calculatePriceJewel(jewel1);
                HttpSession session = request.getSession();
                session.setAttribute("receiptJewel", receiptJewel);
                response.sendRedirect("obtenerDatos.jsp");
            } catch (NumberFormatException e) {
                System.out.println("Error en calcular las onzas");
            }
        }else {
            request.setAttribute("wrongs",wrongs);
            getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
        }


    }

    public void destroy() {
    }
}