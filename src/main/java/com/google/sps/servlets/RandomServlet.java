package com.google.sps.servlets;

import java.io.IOException;
import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /random URL. Try running a server and navigating to /random! */
@WebServlet("/random")
public class RandomServlet extends HttpServlet {
    
  private String[] msg = {"He cooks a mean cereal - My Brother", 
  "He is okay, I guess - My Bestfriend", "He can turn on my Netflix, basically a genius - My Mom",
  "He feeds me - My Dog", "He is the apex human - Elon Musk(probably)"};

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    String json = convertToJsonUsingGson(msg);
    response.setContentType("application/json;");
    response.getWriter().println(json);

  }

  private String convertToJsonUsingGson(String[] msg) {
    Gson gson = new Gson();
    String json = gson.toJson(msg);
    return json;
  }
}