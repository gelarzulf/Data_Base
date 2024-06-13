package mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connecDB{
    private String url, usr, pwd, db;
    connecDB(){
        db = "akademik";
        url = "jdbc:mysql://localhost/" + db;
        usr = "root";
        pwd = "";
    }

    Connection getConnect(){
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(url, usr, pwd);
            System.err.println("Koneksi Berhasil");
        } catch (ClassNotFoundException er) {
            System.out.println("Error #1: " + er.getMessage());
            System.exit(0);
        } catch (SQLException er){
            System.out.println("Error #2: " + er.getMessage());
        }
        return  cn;
        }
        public static void main(String[]args){
            new ConnectDB().getConnect();
    }
}