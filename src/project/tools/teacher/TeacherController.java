/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.tools.teacher;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import database.DatabaseHandler;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import project.tools.main.MainController;
import project.tools.students.StudentController;

/**
 * FXML Controller class
 *
 * @author Clarissa
 */
public class TeacherController implements Initializable {

    @FXML
    private JFXButton addBtn;
    @FXML
    private JFXButton deleteBtn;
    @FXML
    private JFXButton editBtn;
    @FXML
    private JFXTextField teacherField;
    @FXML
    private JFXTextField firstnameField;
    @FXML
    private JFXTextField midnameField;
    @FXML
    private JFXTextField lastnameField;
        @FXML
    private JFXDatePicker dob;
    @FXML
    private JFXTextField age;
    private JFXComboBox dropgender;
    @FXML
    private JFXTextField landphoneField;
    @FXML
    private JFXTextField mobilenumField;
    @FXML
    private JFXTextField address1Field;
    @FXML
    private JFXTextField address2Field;
    @FXML
    private JFXTextField postalField;
    @FXML
    private JFXTextField emailField;
    @FXML
    private JFXButton saveBtn;
    @FXML
    private JFXButton clearBtn;
    private JFXComboBox dropdepartment;
    private JFXComboBox dropdesig;
    @FXML
    private JFXTextField housingField;
    @FXML
    private JFXTextField medField;
    @FXML
    private JFXTextField travelField;
    @FXML
    private JFXTextField netField;
    private JFXComboBox dropHours;
    private JFXComboBox overtime;
    @FXML
    private JFXTextField searchField;
    @FXML
    private JFXButton searchBtn;
    @FXML
    private Menu file;
    @FXML
    private JFXButton backBtn;
    
   
    
    
    
    DatabaseHandler databaseHandler;
    @FXML
    private JFXTextField teachHours;
    @FXML
    private JFXTextField overTime;
    @FXML
    private TableView<TeacherTable> tableView1;
   
    @FXML
    private JFXComboBox<String> department;
    @FXML
    private JFXComboBox<String> designation;
    @FXML
    private JFXComboBox<String> gender;
    @FXML
    private TableColumn<TeacherTable, Integer> TeacherTableTeacherID;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableTeacherFname;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableTeacherMname;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableTeacherLname;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableTeacherDepartment;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableTeacherDesignation;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableDataTeacherDateofBirth;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableDataTeacherAge;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableDataTeacherGender; 
    @FXML
     private TableColumn<TeacherTable, String> TeacherTableDataTeacherLandPhone;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableDataTeacherMobileNo;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableDataTeacherStreet;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableDataTeacherCity;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableDataTeacherPostal;
    @FXML
    private TableColumn<TeacherTable, String> TeacherTableDataTeacherEmail;
    @FXML
    private TableColumn<TeacherTable, Integer> TeacherTableDataTeacherTeachingHours;
    @FXML
    private TableColumn<TeacherTable, Integer> TeacherTableDataTeacherHousingAllowance;
    @FXML
    private TableColumn<TeacherTable, Integer> TeacherTableDataTeacherMedicalAllowance;
    @FXML
    private TableColumn<TeacherTable, Integer> TeacherTableDataTeacherTravellingAllowance;
    @FXML
    private TableColumn<TeacherTable, Integer> TeacherTableDataTeacherOT;
    @FXML
    private TableColumn<TeacherTable, Integer> TeacherTableDataTeacherNETSalary;
     
   ObservableList<String> design = FXCollections.observableArrayList(
            "Head Of Faculty", "Coordinator", "Lecturer"
    );
    ObservableList<String> depart = FXCollections.observableArrayList(
            "Business", "Computing"
    );
     ObservableList<String> gander1 = FXCollections.observableArrayList(
            "Male", "Female"
    );
    
   private DatabaseHandler database =  DatabaseHandler.getInstance();
    private Connection cn;
    private Statement st;
    private ResultSet rs;
    private String temp;
    @FXML
    private JFXButton saveUpdate;
    @FXML
    private JFXButton refresh;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    database =  DatabaseHandler.getInstance();
    designation.setItems(design);
    department.setItems(depart);
    gender.setItems(gander1);
    TeacherTableTeacherID.setCellValueFactory(new PropertyValueFactory<>("TeacherTableTeacherID")); 
        TeacherTableTeacherFname.setCellValueFactory(new PropertyValueFactory<>("TeacherTableTeacherFname"));
        TeacherTableTeacherMname.setCellValueFactory(new PropertyValueFactory<>("TeacherTableTeacherMname"));
        TeacherTableTeacherLname.setCellValueFactory(new PropertyValueFactory<>("TeacherTableTeacherLname"));
        TeacherTableTeacherDepartment.setCellValueFactory(new PropertyValueFactory<>("TeacherTableTeacherDepartment"));
        TeacherTableTeacherDesignation.setCellValueFactory(new PropertyValueFactory<>("TeacherTableTeacherDesignation"));
        TeacherTableDataTeacherDateofBirth.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherDateofBirth"));
        TeacherTableDataTeacherAge.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherAge"));
        TeacherTableDataTeacherGender.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherGender"));
        TeacherTableDataTeacherLandPhone.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherLandPhone"));
        TeacherTableDataTeacherMobileNo.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherMobileNo"));
        TeacherTableDataTeacherStreet.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherStreet"));
        TeacherTableDataTeacherCity.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherCity"));
        TeacherTableDataTeacherPostal.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherPostal"));
        TeacherTableDataTeacherEmail.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherEmail"));
        TeacherTableDataTeacherTeachingHours.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherTeachingHours"));
        TeacherTableDataTeacherHousingAllowance.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherHousingAllowance"));
        TeacherTableDataTeacherMedicalAllowance.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherMedicalAllowance"));
        TeacherTableDataTeacherTravellingAllowance.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherTravellingAllowance"));
        TeacherTableDataTeacherOT.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherOT"));
        TeacherTableDataTeacherNETSalary.setCellValueFactory(new PropertyValueFactory<>("TeacherTableDataTeacherNETSalary"));
        
      tableView1.setItems(loadDataTea("SELECT * FROM teachers"));
      
       
        
    }    
    @FXML
    private void clearFields(ActionEvent event) {
      setClear();

      

     
        
        
    }

    @FXML
    private void addnewTea(ActionEvent event) {
        setAllEnable();
       
    }

    @FXML
    private void deleteTea(ActionEvent event) {
        
        
          TeacherTable getSelectedRow = tableView1.getSelectionModel().getSelectedItem();
         String qu = "delete from teachers where TEACHER_ID = "+getSelectedRow.getTeacherTableTeacherID()+"";
        
            try{  
            cn = database.createConnection();
            st = cn.createStatement();
            st.executeUpdate(qu);
            tableView1.setItems(loadDataTea("SELECT * FROM students"));
            tableView1.refresh();
            }catch(SQLException e)
            {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Failed");
                alert.showAndWait();
            }
            
              
             tableView1.refresh();
//         if (databaseHandler.execAction(qu)) {
//            
//        } 
               
    }
    

    @FXML
    private void editTea(ActionEvent event) {
        
        TeacherTable getSelectedRow = tableView1.getSelectionModel().getSelectedItem();
         String qu = "select * FROM teachers where TEACHER_ID = "+getSelectedRow.getTeacherTableTeacherID()+"";
        
        try
        {
              cn = database.createConnection();
              st = cn.createStatement();
              rs = st.executeQuery(qu);
              setEnableforCompute();
              
              
              while(rs.next())
              {
                  teacherField.setText(Integer.toString(rs.getInt("TEACHER_ID")));
                  firstnameField.setText(rs.getString("FNAME"));
                  midnameField.setText(rs.getString("MNAME"));
                  lastnameField.setText(rs.getString("LNAME"));
                  designation.setValue(rs.getString("DESIG"));
                  department.setValue(rs.getString("DEPT"));
                  gender.setValue(rs.getString("GENDER"));
                  dob.setValue(LocalDate.parse(rs.getString("DOBIRTH")));
                  age.setText(rs.getString("AGE"));
                  landphoneField.setText(rs.getString("LANDPHONE"));
                  mobilenumField.setText(rs.getString("MOBILE"));
                  address1Field.setText(rs.getString("STREET"));
                  address2Field.setText(rs.getString("CITY"));
                  postalField.setText(rs.getString("POSTAL"));
                  emailField.setText(rs.getString("EMAIL"));
                 teachHours.setText(Integer.toString(rs.getInt("TEACHING")));
                  housingField.setText(Integer.toString(rs.getInt("HOUSE")));
                 
                  medField.setText(rs.getString("MED"));
                  travelField.setText(rs.getString("TRAVEL"));
                  overTime.setText(rs.getString("OTH"));
                  netField.setText(rs.getString("NETSAL"));
                 
                  
                   
              }
    
   
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        
    }

    @FXML
    private void saveTea(ActionEvent event) {
       String ID = teacherField.getText();
        String fname = firstnameField.getText();
        String mname = midnameField.getText();
        String lname = lastnameField.getText();
        String desi = designation.getValue();
        String depar = department.getValue();
        String date = dob.getValue().toString();
        String age1 = age.getText();
        String gender1 = gender.getValue();
        String landphone = landphoneField.getText();
        String mobilephone = mobilenumField.getText();
        String address1 = address1Field.getText();
        String address2 = address2Field.getText();
        String postal = postalField.getText();
        String email = emailField.getText();
        String teachingHours = teachHours.getText();
        String housing = housingField.getText();
        String med = medField.getText();
        String travel = travelField.getText();
        String overTime1 = overTime.getText();
        String net = netField.getText();
  
        System.out.println(ID);
        

        
     if(ID.isEmpty()||fname.isEmpty()||mname.isEmpty()||lname.isEmpty()||date.isEmpty()||age1.isEmpty()
                ||landphone.isEmpty()||mobilephone.isEmpty()||address1.isEmpty()||address2.isEmpty()||postal.isEmpty()||email.isEmpty()
                || desi.isEmpty()  ||depar.isEmpty() || gender1.isEmpty() || teachingHours.isEmpty() ||housing.isEmpty() || med.isEmpty()
                || travel.isEmpty() || overTime1.isEmpty() || net.isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Please Enter in all fields");
            alert.showAndWait();
            return;
            
        }
     
        String qu = "INSERT INTO TEACHERS VALUES ("
                + "" + ID + ","
                + "'" + fname + "',"
                + "'" + mname + "',"
                + "'" + lname + "',"
                + "'" + depar + "',"
                + "'" + desi + "',"
                + "'" + date + "',"
                + "'" + age1 + "',"
                + "'" + gender1 + "',"
                + "'" + landphone + "',"
                + "'" + mobilephone + "',"
                + "'" + address1 + "',"
                + "'" + address2 + "',"
                + "'" + postal + "',"
                + "'" + email + "',"
                + "" + teachingHours + ","
                + "" + housing+ ","
                + "" + med + ","
                + "" + travel + ","
                + "" + overTime1 + ","
                + "" + net + ""
                + ")";
//+ "TEACHER_ID INTEGER NOT NULL PRIMARY KEY,"
//                        + "FNAME VARCHAR(255), MNAME VARCHAR(255), LNAME VARCHAR(255),"
//                        + "DEPT VARCHAR(20), DESIG VARCHAR(50), DOBIRTH VARCHAR(50),"
//                        + "AGE VARCHAR(3), GENDER VARCHAR(20), LANDPHONE VARCHAR(50),"
//                        + "MOBILE VARCHAR(50), STREET VARCHAR(255), CITY VARCHAR(255),"
//                        + "POSTAL VARCHAR(10), EMAIL VARCHAR(255), TEACHING INTEGER,"
//                        + "HOUSE INTEGER, MED INTEGER, TRAVEL INTEGER,"
//                        + "OTH INTEGER, NETSAL INTEGER"
//                        + ")");

        System.out.println(qu);
        if (database.execAction(qu)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Success");
            alert.showAndWait();
            tableView1.setItems(loadDataTea("SELECT * FROM TEACHERS"));
            

        } else //Error
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("ERROR");
            alert.showAndWait();
           
        }

        setAllDisable();
        setClear();
        
        
       
    }

    @FXML
    private void searchTea(ActionEvent event) {
        
        String id = searchField.getText();
        String qu = "SELECT * FROM TEACHERS WHERE TEACHER_ID = " + id + "";
        ResultSet rsa = database.execQuery(qu);
        tableView1.setItems(loadDataTea(qu));
        searchField.clear();
        
    }

 
    @FXML
    private void backBtn(ActionEvent event) {
        
        
        
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("/project/tools/main/main.fxml"));
             Scene scene = new Scene(parent);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                          
                            stage.setScene(scene);
                            stage.setTitle("Teacher Panel");
                            stage.show();
                            stage.centerOnScreen();
                            
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private ObservableList loadDataTea(String qu) {
         ObservableList<TeacherTable> listTea = FXCollections.observableArrayList();
        
        
        
        try {
            DatabaseHandler handler =  DatabaseHandler.getInstance();
            
            

             
         rs = handler.execQuery(qu);
            while(rs.next()){
                listTea.add(new TeacherTable(
                rs.getInt("TEACHER_ID"),
                rs.getString("FNAME"),
                rs.getString("MNAME"),
                rs.getString("LNAME"),
                rs.getString("DEPT"),
                rs.getString("DESIG"),
                rs.getString("DOBIRTH"),
                rs.getString("AGE"),
                rs.getString("GENDER"),
                rs.getString("LANDPHONE"),
                rs.getString("MOBILE"),
                rs.getString("STREET"),
                rs.getString("CITY"),
                rs.getString("POSTAL"),
                rs.getString("EMAIL"),
                rs.getInt("TEACHING"),
                rs.getInt("HOUSE"),
                rs.getInt("MED"),
                rs.getInt("TRAVEL"),
                rs.getInt("OTH"),
                rs.getInt("NETSAL")
    
                ));
                
                
           
                
               
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
       return listTea;
        
    }
    
    
    
     private void setAllEnable(){
        
      //fields    
      teacherField.setDisable(false);
      firstnameField.setDisable(false);
      midnameField.setDisable(false);
      lastnameField.setDisable(false);
      age.setDisable(false);
      landphoneField.setDisable(false);
      mobilenumField.setDisable(false);
      address1Field.setDisable(false);
      address2Field.setDisable(false);
      postalField.setDisable(false);
      emailField.setDisable(false);
      housingField.setDisable(false);
      medField.setDisable(false);
      travelField.setDisable(false);
      netField.setDisable(false);
      deleteBtn.setDisable(false);
      editBtn.setDisable(false);
      saveBtn.setDisable(false);
      clearBtn.setDisable(false);
      department.setDisable(false);
      designation.setDisable(false);
      gender.setDisable(false);
      teachHours.setDisable(false);
      dob.setDisable(false);
      overTime.setDisable(false);
      housingField.setDisable(false);
      medField.setDisable(false);
      travelField.setDisable(false);
      netField.setDisable(false);


     // searchField.setDisable(false);
    

    }


    private void setAllDisable(){
            
    teacherField.setDisable(true);
      firstnameField.setDisable(true);
      midnameField.setDisable(true);
      lastnameField.setDisable(true);
      age.setDisable(true);
      landphoneField.setDisable(true);
      mobilenumField.setDisable(true);
      address1Field.setDisable(true);
      address2Field.setDisable(true);
      postalField.setDisable(true);
      emailField.setDisable(true);
      housingField.setDisable(true);
      medField.setDisable(true);
      travelField.setDisable(true);
      netField.setDisable(true);
      
      saveBtn.setDisable(true);
      clearBtn.setDisable(true);
      department.setDisable(true);
      designation.setDisable(true);
      gender.setDisable(true);
      teachHours.setDisable(true);
      dob.setDisable(true);
      overTime.setDisable(true);
      housingField.setDisable(true);
      medField.setDisable(true);
      travelField.setDisable(true);
      netField.setDisable(true);

      //searchField.setDisable(true);

    }
    
    private void setClear(){
        
      teacherField.clear();
      firstnameField.clear();
      midnameField.clear();
      lastnameField.clear();
      age.clear();
      landphoneField.clear();
      mobilenumField.clear();
      address1Field.clear();
      address2Field.clear();
      postalField.clear();
      emailField.clear();
      housingField.clear();
      medField.clear();
      travelField.clear();
      netField.clear();
    
      department.getSelectionModel().clearSelection();
      designation.getSelectionModel().clearSelection();
      gender.getSelectionModel().clearSelection();
      teachHours.clear();
  
      overTime.clear();
      housingField.clear();
      medField.clear();
      travelField.clear();
      netField.clear();

      
      dob.getEditor().clear();
      dob.setValue(null);
    }

    @FXML
    private void numberyOnly(KeyEvent event) {
        
        String c = event.getCharacter();
    if("1234567890".contains(c)) {}
    else {
        event.consume();
    }
    }

    @FXML
    private void saveUpdate(ActionEvent event) {
//         "TEACHER_ID INTEGER NOT NULL PRIMARY KEY,"
//                        + "FNAME VARCHAR(255), MNAME VARCHAR(255), LNAME VARCHAR(255),"
//                        + "DEPT VARCHAR(20), DESIG VARCHAR(50), DOBIRTH VARCHAR(50),"
//                        + "AGE VARCHAR(3), GENDER VARCHAR(20), LANDPHONE VARCHAR(50),"
//                        + "MOBILE VARCHAR(50), STREET VARCHAR(255), CITY VARCHAR(255),"
//                        + "POSTAL VARCHAR(10), EMAIL VARCHAR(255), TEACHING INTEGER,"
//                        + "HOUSE INTEGER, MED INTEGER, TRAVEL INTEGER,"
//                        + "OTH INTEGER, NETSAL INTEGER"
//                        + ")");
            
      int temp = Integer.parseInt(teacherField.getText());

                String qu  = "update teachers set TEACHING= "+ teachHours.getText() +" , HOUSE = "+ housingField.getText() +" , MED = "+ medField.getText()  +" , TRAVEL = "+   travelField.getText()+ ", OTH = "+  overTime.getText() +",  NETSAL  = "+ netField.getText()  +"WHERE TEACHER_ID = "+ temp;

                database.execAction(qu);
                if (database.execAction(qu)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText("Update Success");
                    alert.showAndWait();
                    tableView1.setItems(loadDataTea("SELECT * FROM teachers"));
                    setAllDisable();
                    setClear();
                    }
    }

        

    private void setEnableforCompute() {
        teacherField.setDisable(true);
      firstnameField.setDisable(true);
      midnameField.setDisable(true);
      lastnameField.setDisable(true);
      age.setDisable(true);
      landphoneField.setDisable(true);
      mobilenumField.setDisable(true);
      address1Field.setDisable(true);
      address2Field.setDisable(true);
      postalField.setDisable(true);
      emailField.setDisable(true);
      housingField.setDisable(true);
      medField.setDisable(true);
      travelField.setDisable(true);
      netField.setDisable(true);
      deleteBtn.setDisable(true);
      editBtn.setDisable(true);
      saveBtn.setDisable(true);
      clearBtn.setDisable(true);
      department.setDisable(true);
      designation.setDisable(true);
      gender.setDisable(true);
      teachHours.setDisable(false);
      dob.setDisable(true);
      overTime.setDisable(false);
      housingField.setDisable(false);
      medField.setDisable(false);
      travelField.setDisable(false);
      netField.setDisable(false);
    }

    @FXML
    private void otCompu(MouseEvent event) {
        
       computation();
    }
    
    
    
    private void computation()
    {
         String position = designation.getValue();
        int value;
        int totalSalary;
        int ot;
        int hours;
        int otValue;
         double housingComp;
         double medComp;
          double travelComp;
          double netSalary;
                 
       
        if(position.matches("Head Of Faculty"))
        {
             value = 8;
             hours = Integer.parseInt(teachHours.getText());
            if(hours <= value)
            {
             overTime.setText(Integer.toString(0));
             
             totalSalary = hours* 1200;
             housingComp = totalSalary * 0.1;
             medComp = totalSalary * 0.03;
             travelComp = totalSalary * 0.05;
            
          
             
             housingField.setText(Double.toString(housingComp));
             medField.setText(Double.toString(medComp));
             travelField.setText(Double.toString(travelComp));
             
              netSalary = totalSalary + housingComp + medComp + travelComp;
             
             netField.setText(Double.toString(netSalary));
                 
                
            }
            else{
             ot = hours - value;
             otValue = ot * 325;
            
             totalSalary = hours *  1200 + otValue;
            
            
             housingComp = totalSalary * 0.1;
             medComp = totalSalary * 0.03;
             travelComp = totalSalary * 0.05;
            
             overTime.setText(Integer.toString(ot));
             
             housingField.setText(Double.toString(housingComp));
             medField.setText(Double.toString(medComp));
             travelField.setText(Double.toString(travelComp));
             
              netSalary = totalSalary + housingComp + medComp + travelComp;
             
             netField.setText(Double.toString(netSalary));
            
            }
             
             
             
             
             
             
      
            
        }
        if(position.matches("Coordinator"))
        {
            value = 13;
            hours = Integer.parseInt(teachHours.getText());
            if(hours <= value)
            {
             overTime.setText(Integer.toString(0));
             
             totalSalary = 1200 *hours ;
             housingComp = totalSalary * 0.1;
             medComp = totalSalary * 0.03;
             travelComp = totalSalary * 0.05;
            
          
             
             housingField.setText(Double.toString(housingComp));
             medField.setText(Double.toString(medComp));
             travelField.setText(Double.toString(travelComp));
             
              netSalary = totalSalary + housingComp + medComp + travelComp;
             
             netField.setText(Double.toString(netSalary));
                 
                
            }
            else{
             ot = hours - value;
             otValue = ot * 325;
            
             totalSalary = hours*1200 + otValue;
            
            
             housingComp = totalSalary * 0.1;
             medComp = totalSalary * 0.03;
             travelComp = totalSalary * 0.05;
            
             overTime.setText(Integer.toString(ot));
             
             housingField.setText(Double.toString(housingComp));
             medField.setText(Double.toString(medComp));
             travelField.setText(Double.toString(travelComp));
             
              netSalary = totalSalary + housingComp + medComp + travelComp;
             
             netField.setText(Double.toString(netSalary));
            
            }
        }
        if(position.matches("Lecturer") )
         {
            value = 18;
           hours = Integer.parseInt(teachHours.getText());
            if(hours <= value)
            {
             overTime.setText(Integer.toString(0));
             
             totalSalary = 1200 *hours;
             housingComp = totalSalary * 0.1;
             medComp = totalSalary * 0.03;
             travelComp = totalSalary * 0.05;
            
          
             
             housingField.setText(Double.toString(housingComp));
             medField.setText(Double.toString(medComp));
             travelField.setText(Double.toString(travelComp));
             
              netSalary = totalSalary + housingComp + medComp + travelComp;
             
             netField.setText(Double.toString(netSalary));
                 
                
            }
            else{
             ot = hours - value;
             otValue = ot * 325;
            
             totalSalary = hours*1200 + otValue;
            
            
             housingComp = totalSalary * 0.1;
             medComp = totalSalary * 0.03;
             travelComp = totalSalary * 0.05;
            
             overTime.setText(Integer.toString(ot));
             
             housingField.setText(Double.toString(housingComp));
             medField.setText(Double.toString(medComp));
             travelField.setText(Double.toString(travelComp));
             
              netSalary = totalSalary + housingComp + medComp + travelComp;
             
             netField.setText(Double.toString(netSalary));
            
            }
         }
    }

    @FXML
    private void refresh(ActionEvent event) {
        
         tableView1.setItems(loadDataTea("SELECT * FROM TEACHERS"));
    }


    @FXML
    private void autoAge(MouseEvent event) {
        
        
              Calendar now = Calendar.getInstance();
            int year = now.get(Calendar.YEAR);
            int birthYear =  (dob.getValue().getYear());
            int ageToday = year - birthYear;
            age.setText(Integer.toString(ageToday));
        
        
    }
        
    }
    
    
    
    
    
    
    


