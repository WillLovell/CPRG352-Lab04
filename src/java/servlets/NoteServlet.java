
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // this will have the servlet call upon a JSP to be loaded by the client's browser
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        
        
        
        
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String Title;
        String Content;
        Title = br.readLine();
        Content= br.readLine();


        Note Note = new Note(Title,Content);
        request.setAttribute("Note", Note);
        
        if(request.getQueryString()!= null){
            String query = request.getQueryString();
            if(request.getQueryString().equals("edit")){
               request.setAttribute("Note", Note);
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
            }
        }
      
            
        
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
       // stop the code call
        return;
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    // to write to a file
    String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        
        
        
        String postTitle = request.getParameter("title");
        String postContent = request.getParameter("content");
     
        
        pw.write(postTitle);
        pw.println();
        pw.write(postContent);
        pw.close();
   
        
        Note Note = new Note(postTitle,postContent);
        request.setAttribute("Note", Note);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
       // stop the code call
        return;
        
    }

}
