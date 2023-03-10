package com.example.almacen.servlets;

import com.example.almacen.controllers.ModelFactoryController;
import com.example.almacen.models.ReceiptJewel;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "obtenerDatosServlet" , value = "/obtenerDatos-Servlet")
public class obtenerDatosServlet extends HttpServlet {

    ModelFactoryController mfc = ModelFactoryController.getInstance();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<ReceiptJewel> listReceiptJewels = mfc.getListReceiptJewels();
        int stockSell = listReceiptJewels.size();

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("stockSell",stockSell);
        response.sendRedirect("finalPage.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }
}
