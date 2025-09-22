//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        String url="jdbc:postgresql://localhost:5432/postgres";
        String username="postgres";
        String pass="0000";
        String query="select * from student";

        Connection db=DriverManager.getConnection(url,username,pass);
        Statement st=db.createStatement();
        ResultSet rs=st.executeQuery(query);
        System.out.println("Connection Established!");

        while(rs.next()){

            System.out.print(rs.getInt("sid")+" ");
            System.out.print(rs.getString("sname")+" ");
            System.out.println(rs.getInt("age")+" ");

        }


        db.close();
        System.out.println("Connection Closed!!");
    }

}