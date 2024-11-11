package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 */
public class Conexion {

    //conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://lb4uoq0rshdc6ogtoeymt-mysql.services.clever-cloud.com", "uuhwblprjqiupwbx", "h0qjyL8ufIoKlvwMJWLJ");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
