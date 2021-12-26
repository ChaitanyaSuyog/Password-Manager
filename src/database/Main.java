package database;

import java.sql.*;

public class Main {

    static String dbUrl = "jdbc:mysql://localhost:3306/passworddb";
    static String dbUser = "root";
    static String dbPass = "Arunachala108";

    static String website;

    public static void main(String[] args) {
        createTable("test");
        insertValues("test", "xyz", "sus");
        printValues("test");
    }

    public static void createTable(String tableName) {
        website = tableName;
        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            Statement statement = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS " + tableName +
                    " (username varchar(255) NOT NULL, " +
                    "password varchar(255) NOT NULL);";
            statement.executeUpdate(sql);
            System.out.println("Table created.");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertValues(String tableName, String username, String password) {
        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            Statement statement = conn.createStatement()) {
            String sql = "INSERT INTO " + tableName + " VALUES ('" + username + "', '" + password + "')";
            statement.executeUpdate(sql);
            System.out.println("Values inserted.");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void printValues(String tableName) {
        String query = "SELECT username, password FROM " + tableName;
        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Password: " + rs.getString("password"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int getTableList() {
        int count = 0;
        try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass)) {
            ResultSet rs = null;
            DatabaseMetaData meta = conn.getMetaData();
            rs = meta.getTables(conn.getCatalog(), null, null, new String[] {
                    "TABLE"
            });
            while (rs.next()) {
                String tblName = rs.getString("TABLE_NAME");
                System.out.println(tblName);
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
