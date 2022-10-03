package servlets;

import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author jerma
 */
public class NoteServlet extends HttpServlet {
    
    Note note;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        


        String filename = "/WEB-INF/note.txt";
        ServletContext context = getServletContext();
        InputStream is = context.getResourceAsStream(filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pr = response.getWriter();


        String title = br.readLine();
        String content = br.readLine();
        note = new Note(title, content);
        
        pr.append(title);
        pr.append(content);
        
        request.setAttribute("title", note.getTitle());
        request.setAttribute("content", note.getContent());

        String req = request.getRequestURI();
        switch (request.getRequestURI()) {
        case "/Week4Lab_SimpleNoteKeeper/":
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                 .forward(request, response); break;
        case "/Week4Lab_SimpleNoteKeeper/note":
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                 .forward(request, response); break;
        default:
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                 .forward(request, response); break;
         }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 



        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        note.setTitle(title);
        note.setContent(content);
        
        pw.append(title);
        pw.append(content);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
    }

}
