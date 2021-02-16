package controller;

import domain.model.GuessGame;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    private GuessGame game = new GuessGame();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String guessFromParameter = request.getParameter("guess");
        int guessedNumber = Integer.parseInt(guessFromParameter);
        String resultMessage = game.guess(guessedNumber);

        //Wij kunnen zelf géén extra parameters toevoegen aan onze request!
        //We kunnen wel extra attributen meegeven met de methode setAttribute().
        request.setAttribute("result", resultMessage);

        //RequestDispatcher is een interface waarvan de implementatie een object
        //definieert dat verzoeken/requests naar
        //alle bronnen (zoals HTML, Image, JSP, Servlet) op de server kan verzenden.

        //Vanuit deze servlet zullen we onze request en response forwarden naar de opgegeven
        //JSP (in dit geval guess.jsp).
        RequestDispatcher view = request.getRequestDispatcher("guess.jsp");
        view.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
