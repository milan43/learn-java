package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionHandling {

    public static void main(String[] args) throws SQLException{
        Connection con = null;
        try{
             con = DriverManager.getConnection("");

        }
        catch (SQLException | SecurityException  ex){
            System.out.println(ex.getMessage());
        }

            finally{
            con.close();
        }

        //try with resource
        try {
            try (Connection conn = DriverManager.getConnection("url")) {

            }
        }catch (SQLException se){
            System.err.println(se.getMessage());
        }


    }

}
