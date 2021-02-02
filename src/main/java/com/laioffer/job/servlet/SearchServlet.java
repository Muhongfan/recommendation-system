package com.laioffer.job.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laioffer.job.entity.Item;
import com.laioffer.job.external.GitHubClient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchServlet", urlPatterns = {"/search"})
public class SearchServlet extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double lat = Double.parseDouble(request.getParameter("lat"));
        double lon = Double.parseDouble(request.getParameter("lon"));

        GitHubClient client = new GitHubClient();
        response.setContentType("application/json");

        List<Item> items = client.search(lat, lon, null);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(), items);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}

