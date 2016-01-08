/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khach_hang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pham huu dat
 */
public class Connect_Sqlserver_airport {

    public static Connection connectAirport() throws SQLException {
        String hostName = "localhost";
        String sqlInstanceName = "SQLEXPRESS";
        String database = "Ve_May_Bay";
        String userName = "sa";
        String password = "1";
        return connect_Sqlserver_airport(hostName, sqlInstanceName, database, userName, password);
    }

    private static Connection connect_Sqlserver_airport(String hostName, String sqlInstanceName, String database, String userName, String password) throws SQLException {
        String connectUrl = "jdbc:sqlserver://" + hostName + ":1433" + ";instance=" + sqlInstanceName + ";database=" + database;
        Connection cnn = DriverManager.getConnection(connectUrl, userName, password);
        return cnn;
    }

}
