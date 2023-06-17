package ma.ismo.crjj.efm.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ismo.crjj.efm.beans.Etablissement;
import ma.ismo.crjj.efm.idao.IDAO;
import ma.ismo.crjj.efm.impldao.DAOEtablissement;

public class EtablissementServlet extends HttpServlet {
    private IDAO<Etablissement> etablissementDAO;

    public void init() {
        // Instancier votre implémentation DAO ici
        etablissementDAO = new DAOEtablissement();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        List<Etablissement> etablissements = etablissementDAO.getAll();

        request.setAttribute("etablissements", etablissements);


        request.getRequestDispatcher("etablissements.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String nomEtab = request.getParameter("nomEtab");
        String adresseEtab = request.getParameter("adresseEtab");
        String telEtab = request.getParameter("telEtab");

      
        Etablissement etablissement = new Etablissement();
        etablissement.setNomEtab(nomEtab);
        etablissement.setAdresseEtab(adresseEtab);
        etablissement.setTelEtab(telEtab);

   
        etablissementDAO.create(etablissement);

  
        response.sendRedirect(request.getContextPath() + "/etablissements");
    }
}
