
package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DatabaseHandler {
    private static DatabaseHandler handler = null;
    private static final String URL = "jdbc:derby:stars;create=true";
    private static Connection cn = null;
    private static Statement st = null;
    
    private DatabaseHandler() {
        createConnection();
        createStudents();
        createTeachers();
    }
  
    public static DatabaseHandler getInstance(){
        if(handler==null){
            handler = new DatabaseHandler();
        }
        return handler;
    }
    
   public Connection createConnection(){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            cn = DriverManager.getConnection(URL);
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        return cn;
    }
    
    void createStudents() {
        String table = "STUDENTS";
        try {
            st = cn.createStatement();

            DatabaseMetaData dbm = cn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, table.toUpperCase(), null);

            if(tables.next()){
                System.out.println("Table " + table + " created!");
            } 
            else{
                st.execute("CREATE TABLE " + table + "("
                        + "STUDENT_ID INTEGER NOT NULL PRIMARY KEY,"
                        + "FNAME VARCHAR(255), MNAME VARCHAR(255), LNAME VARCHAR(255),"
                        + "LEVEL VARCHAR(4), COURSE VARCHAR(50), DOB VARCHAR(50),"
                        + "AGE VARCHAR(3), GENDER VARCHAR(20), LANDPHONE VARCHAR(50),"
                        + "MOBILE VARCHAR(50), STREET VARCHAR(255), CITY VARCHAR(255),"
                        + "POSTAL VARCHAR(10), EMAIL VARCHAR(255), SUB INTEGER,"
                        + "REPSUB INTEGER, TUITION INTEGER, TUITIONREP INTEGER,"
                        + "AMOUNTDEP INTEGER,TOTALFEE INTEGER, REMAINING INTEGER"
                        + ")");
            }  
            
            
            
        } 
        catch (SQLException e){
            System.err.println(e.getMessage() + " --- Students set up.");
        }
    }
    
    void createTeachers() {
        String table = "TEACHERS";
        try {
            st = cn.createStatement();

            DatabaseMetaData dbm = cn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, table.toUpperCase(), null);

            if(tables.next()){
                System.out.println("Table " + table + " created!");
            } 
            else{
                st.execute("CREATE TABLE " + table + "("
                        + "TEACHER_ID INTEGER NOT NULL PRIMARY KEY,"
                        + "FNAME VARCHAR(255), MNAME VARCHAR(255), LNAME VARCHAR(255),"
                        + "DEPT VARCHAR(20), DESIG VARCHAR(50), DOBIRTH VARCHAR(50),"
                        + "AGE VARCHAR(3), GENDER VARCHAR(20), LANDPHONE VARCHAR(50),"
                        + "MOBILE VARCHAR(50), STREET VARCHAR(255), CITY VARCHAR(255),"
                        + "POSTAL VARCHAR(10), EMAIL VARCHAR(255), TEACHING INTEGER,"
                        + "HOUSE INTEGER, MED INTEGER, TRAVEL INTEGER,"
                        + "OTH INTEGER, NETSAL INTEGER"
                        + ")");
            }  
        } 
        catch (SQLException e){
            System.err.println(e.getMessage() + " --- Teachers set up.");
        }
    }
    
   public ResultSet execQuery(String query) {
        ResultSet result;
        try {
            st = cn.createStatement();
            result = st.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
            return null;
        } finally {
        }
        return result;
    }

    
    public boolean execAction(String qu) {
        try {
            st = cn.createStatement();
            st.executeUpdate(qu);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
            System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
            return false;
        } finally {
        }
    }

    
    
}

