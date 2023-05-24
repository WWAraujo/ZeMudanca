package br.com.zemudanca.schema;

import org.h2.tools.RunScript;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet(loadOnStartup = -1)
public class LoadDatabaseServlet extends HttpServlet {

    public LoadDatabaseServlet(){
        createDatabase();
    }

    protected void createDatabase(){

        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa")){

            RunScript.execute(connection, new FileReader("src/main/resources/schemas.sql"));
            System.out.println("Tabela atualizada");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
