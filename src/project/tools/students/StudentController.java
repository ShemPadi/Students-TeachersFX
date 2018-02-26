/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.tools.students;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import database.DatabaseHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;
import project.tools.main.MainController;





import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Clarissa
 */
public class StudentController implements Initializable {
    
        

    @FXML
    private JFXButton addBtn;
    @FXML
    private JFXButton deleteBtn;
    @FXML
    private JFXButton editBtn;
    @FXML
    private JFXTextField studentField;
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
    @FXML
    private JFXTextField searchField;
    @FXML
    private JFXButton searchBtn;
    @FXML
    private JFXButton backBtn;
    @FXML
    private JFXComboBox<String> yearField;
    @FXML
    private JFXComboBox<String> degreeField;
    @FXML
    private JFXComboBox<String> genderField;
    @FXML
    private JFXTextField numSub;
    @FXML
    private JFXTextField numRepsub;

    /**
     * Initializes the controller class.
     */
    
     
    @FXML
    public TableView<StudentTable> tableView;
    @FXML
    public TableColumn<StudentTable, Integer> studentTableStudentID;
    @FXML
    public TableColumn<StudentTable, String> studentTableStudentFname;
    @FXML
    public TableColumn<StudentTable, String> studentTableStudentMname;
    @FXML
    public TableColumn<StudentTable, String> studentTableStudentLname;
    @FXML
    public TableColumn<StudentTable, String> studentTableStudentLevel;
    @FXML
    public TableColumn<StudentTable, String> studentTableStudentCourse;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentDateofBirth;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentAge;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentGender;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentLandPhone;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentMobileNo;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentStreet;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentCity;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentPostal;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentEmail;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentSubject;
    @FXML
    public TableColumn<StudentTable, String> studentTableDataStudentRepeatedSubjects;
    @FXML
    private TableColumn<StudentTable, String> studentTableDataStudentTuition;
    @FXML
    private TableColumn<StudentTable, String> studentTableDataStudentTuitionRep;
    @FXML
    private TableColumn<StudentTable, String> studentTableDataStudentAmountPaid;
    @FXML
    private TableColumn<StudentTable, String> studentTableDataStudentRemainingBalance;
    @FXML
    private TableColumn<StudentTable, Integer> studentTableDataStudentTotalFee;
    
    
    
    private DatabaseHandler database = DatabaseHandler.getInstance();
    private Connection cn;
    private Statement st;
    private ResultSet rs;

    @FXML
    private JFXButton saveUpdate;
    @FXML
    private JFXTextField amountDepo;
    @FXML
    private JFXTextField tuitionFeeRep;
    @FXML
    private JFXTextField tuitionFee;
    @FXML
    private JFXTextField remainingBalance;
    @FXML
    private JFXButton refresh;
    @FXML
    private JFXTextField totalFee;
   ObservableList<String> prog = FXCollections.observableArrayList(
            "BSCSSE", "BSCSBA", "BSITDA", "BSITSMBA", "BSITWMA", "BSITAGD", "BSCpE", "BSCE", "BSME", "BSEE", "BSEEE"
    );
   ObservableList<String> year = FXCollections.observableArrayList(
            "1st", "2nd", "3rd", "4th", "5th"
    );
   ObservableList<String> gender = FXCollections.observableArrayList(
            "Male", "Female"
    );
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     degreeField.setItems(prog);
     yearField.setItems(year);
     genderField.setItems(gender);
     
    database =  DatabaseHandler.getInstance();
    studentTableStudentID.setCellValueFactory(new PropertyValueFactory<>("studentTableStudentID")); // Point JavaFX adminTableStudentNo column at AdminTable's adminTableDataNo variable Property
        studentTableStudentFname.setCellValueFactory(new PropertyValueFactory<>("studentTableStudentFname"));
        studentTableStudentMname.setCellValueFactory(new PropertyValueFactory<>("studentTableStudentMname"));
        studentTableStudentLname.setCellValueFactory(new PropertyValueFactory<>("studentTableStudentLname"));
        studentTableStudentLevel.setCellValueFactory(new PropertyValueFactory<>("studentTableStudentLevel"));
        studentTableStudentCourse.setCellValueFactory(new PropertyValueFactory<>("studentTableStudentCourse"));
        studentTableDataStudentDateofBirth.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentDateofBirth"));
        studentTableDataStudentAge.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentAge"));
        studentTableDataStudentGender.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentGender"));
        studentTableDataStudentLandPhone.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentLandPhone"));
        studentTableDataStudentMobileNo.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentMobileNo"));
        studentTableDataStudentStreet.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentStreet"));
        studentTableDataStudentCity.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentCity"));
        studentTableDataStudentPostal.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentPostal"));
        studentTableDataStudentEmail.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentEmail"));
        studentTableDataStudentSubject.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentSubject"));
        studentTableDataStudentRepeatedSubjects.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentRepeatedSubjects"));
        studentTableDataStudentTuition.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentTuition"));
        studentTableDataStudentTuitionRep.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentTuitionRep"));
        studentTableDataStudentAmountPaid.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentAmountPaid"));
        studentTableDataStudentRemainingBalance.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentRemainingBalance"));
        studentTableDataStudentTotalFee.setCellValueFactory(new PropertyValueFactory<>("studentTableDataStudentTotalFee"));
         tableView.setItems(loadData("SELECT * FROM students"));
     
        
    }    
   


    @FXML
    private void addnewStu(ActionEvent event) {
        
        
        setAllEnable();
    }
    
    
    

    @FXML
    private void deleteStu(ActionEvent event) throws SQLException {
        
         StudentTable getSelectedRow = tableView.getSelectionModel().getSelectedItem();
         String qu = "delete from students where STUDENT_ID = "+getSelectedRow.getStudentTableStudentID()+"";
        
            try{  
            cn = database.createConnection();
            st = cn.createStatement();
            st.executeUpdate(qu);
            tableView.setItems(loadData("SELECT * FROM students"));
            tableView.refresh();
            }catch(SQLException e)
            {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Failed");
                alert.showAndWait();
            }
            
              
             tableView.refresh();
  
    }
    
    @FXML
    private void numbersOnly(KeyEvent event) {
        
    String c = event.getCharacter();
        if("1234567890".contains(c)) {}
        else {
        event.consume();
        }
    }


    @FXML
    private void editStu(ActionEvent event) throws SQLException {
             
        StudentTable getSelectedRow = tableView.getSelectionModel().getSelectedItem();
         String qu = "select * FROM students where STUDENT_ID = "+getSelectedRow.getStudentTableStudentID()+"";
        
        try
        {
              cn = database.createConnection();
              st = cn.createStatement();
              rs = st.executeQuery(qu);
              setEnableforCompute();
              
              
              while(rs.next())
              {
                  studentField.setText(Integer.toString(rs.getInt("STUDENT_ID")));
                  firstnameField.setText(rs.getString("FNAME"));
                  midnameField.setText(rs.getString("MNAME"));
                  lastnameField.setText(rs.getString("LNAME"));
                  yearField.setValue(rs.getString("LEVEL"));
                  degreeField.setValue(rs.getString("COURSE"));
                  genderField.setValue(rs.getString("GENDER"));
                  dob.setValue(LocalDate.parse(rs.getString("DOB")));
                  age.setText(rs.getString("AGE"));
                  numSub.setText(Integer.toString(rs.getInt("SUB")));
                  numRepsub.setText(Integer.toString(rs.getInt("REPSUB")));
                  landphoneField.setText(rs.getString("LANDPHONE"));
                  mobilenumField.setText(rs.getString("MOBILE"));
                  address1Field.setText(rs.getString("STREET"));
                  address2Field.setText(rs.getString("CITY"));
                  postalField.setText(rs.getString("POSTAL"));
                  emailField.setText(rs.getString("EMAIL"));
                  tuitionFee.setText(rs.getString("TUITION"));
                  tuitionFeeRep.setText(rs.getString("TUITIONREP"));
                  amountDepo.setText(rs.getString("AMOUNTDEP"));
                  totalFee.setText(rs.getString("TOTALFEE"));
                  remainingBalance.setText(rs.getString("REMAINING"));
                  
                   
              }
    
   
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        
    }
 
    @FXML
    private void saveStu(ActionEvent event) {
       String ID = studentField.getText();
        String fname = firstnameField.getText();
        String mname = midnameField.getText();
        String lname = lastnameField.getText();
        String year = yearField.getValue();
        String degree = degreeField.getValue();
        String date = dob.getValue().toString();
        String age1 = age.getText();
        String gender = genderField.getValue();
        String landphone = landphoneField.getText();
        String mobilephone = mobilenumField.getText();
        String address1 = address1Field.getText();
        String address2 = address2Field.getText();
        String postal = postalField.getText();
        String email = emailField.getText();
        String numSubj = numSub.getText();
        String numRepSub = numRepsub.getText();
        String tuitionfee = tuitionFee.getText();
        String tuitionfeeRep = tuitionFeeRep.getText();
        String amountdep = amountDepo.getText();
        String feeTotal = totalFee.getText();
        String remainingbalance = remainingBalance.getText();
  
        System.out.println(ID);
        

        
     if(ID.isEmpty()||fname.isEmpty()||mname.isEmpty()||lname.isEmpty()||date.isEmpty()||age1.isEmpty()
                ||landphone.isEmpty()||mobilephone.isEmpty()||address1.isEmpty()||address2.isEmpty()||postal.isEmpty()||email.isEmpty()
                || degree.isEmpty()  ||year.isEmpty() || gender.isEmpty() || numSubj.isEmpty() ||numRepSub.isEmpty() || tuitionfee.isEmpty()
                || tuitionfeeRep.isEmpty() || amountdep.isEmpty() || feeTotal.isEmpty() || remainingbalance.isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Please Enter in all fields");
            alert.showAndWait();
            return;
            
        }
     
        String qu = "INSERT INTO STUDENTS VALUES ("
                + "" + ID + ","
                + "'" + fname + "',"
                + "'" + mname + "',"
                + "'" + lname + "',"
                + "'" + year + "',"
                + "'" + degree + "',"
                + "'" + date + "',"
                + "'" + age1 + "',"
                + "'" + gender + "',"
                + "'" + landphone + "',"
                + "'" + mobilephone + "',"
                + "'" + address1 + "',"
                + "'" + address2 + "',"
                + "'" + postal + "',"
                + "'" + email + "',"
                + "" + numSubj + ","
                + "" + numRepSub + ","
                + "" + tuitionfee + ","
                + "" + tuitionfeeRep + ","
                + "" + amountdep + ","
                + "" + feeTotal + ","
                + "" + remainingbalance + ""
                + ")";


        System.out.println(qu);
        if (database.execAction(qu)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Success");
            alert.showAndWait();
            tableView.setItems(loadData("SELECT * FROM students"));
            

        } else //Error
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Error");
            alert.showAndWait();
           
        }

        setAllDisable();
        setClear();
        
        
       
    }

    @FXML
    private void clearFields(ActionEvent event) {            
        setClear();

    }

    @FXML
    private void searchStu(ActionEvent event) {
        
        String id = searchField.getText();
        String qu = "SELECT * FROM STUDENTS WHERE STUDENT_ID = " + id + "";
        ResultSet rsa = database.execQuery(qu);
        tableView.setItems(loadData(qu));
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

    private void setClear() {
          studentField.clear();
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
          searchField.clear();
          degreeField.getSelectionModel().clearSelection();
          yearField.getSelectionModel().clearSelection();
          genderField.getSelectionModel().clearSelection();
          numSub.clear();
          numRepsub.clear();
          dob.getEditor().clear();
          dob.setValue(null);
          amountDepo.clear();
          tuitionFeeRep.clear();
          tuitionFee.clear();
          remainingBalance.clear();
          totalFee.clear();
          
          
    }
    private void setAllEnable(){
        
          
      studentField.setDisable(false);
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
      yearField.setDisable(false);
      genderField.setDisable(false);
      degreeField.setDisable(false);
      numSub.setDisable(false);
      saveBtn.setDisable(false);
      clearBtn.setDisable(false);
      landphoneField.setDisable(false);
      mobilenumField.setDisable(false);
      address1Field.setDisable(false);
      address2Field.setDisable(false);
      dob.setDisable(false);
      numRepsub.setDisable(false);
      tuitionFee.setDisable(false);
      remainingBalance.setDisable(false);
      tuitionFeeRep.setDisable(false);
      amountDepo.setDisable(false);
      totalFee.setDisable(false);


     // searchField.setDisable(false);
    

    }


    private void setAllDisable(){
            
     studentField.setDisable(true);
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
      yearField.setDisable(true);
      degreeField.setDisable(true);
      genderField.setDisable(true);
      numSub.setDisable(true);
      saveBtn.setDisable(true);
      clearBtn.setDisable(true);
      landphoneField.setDisable(true);
      mobilenumField.setDisable(true);
      address1Field.setDisable(true);
      address2Field.setDisable(true);
      dob.setDisable(true);
      numRepsub.setDisable(true);
      numRepsub.setDisable(true);
      tuitionFee.setDisable(true);
      remainingBalance.setDisable(true);
      tuitionFeeRep.setDisable(true);
         amountDepo.setDisable(true);
         totalFee.setDisable(true);
    }
    
    
   private void setEnableforCompute()
    {
        studentField.setDisable(true);
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
      yearField.setDisable(true);
      degreeField.setDisable(true);
      genderField.setDisable(true);
      numSub.setDisable(true);
      saveBtn.setDisable(true);
      clearBtn.setDisable(true);
      landphoneField.setDisable(true);
      mobilenumField.setDisable(true);
      address1Field.setDisable(true);
      address2Field.setDisable(true);
      dob.setDisable(true);
      numRepsub.setDisable(false);
      numRepsub.setDisable(false);
      tuitionFee.setDisable(false);
      remainingBalance.setDisable(false);
      tuitionFeeRep.setDisable(false);
      amountDepo.setDisable(false);
      numSub.setDisable(false);
      totalFee.setDisable(false);
        
        
        
    }

   

    private ObservableList loadData(String qu) {
         ObservableList<StudentTable> list = FXCollections.observableArrayList();
        
        
        
        try {
            DatabaseHandler handler =  DatabaseHandler.getInstance();
             
        ResultSet rs = handler.execQuery(qu);
            while(rs.next()){
                list.add(new StudentTable(
                rs.getInt("STUDENT_ID"),
                rs.getString("FNAME"),
                rs.getString("MNAME"),
                rs.getString("LNAME"),
                rs.getString("LEVEL"),
                rs.getString("COURSE"),
                rs.getString("DOB"),
                rs.getString("AGE"),
                rs.getString("GENDER"),
                rs.getString("LANDPHONE"),
                rs.getString("MOBILE"),
                rs.getString("STREET"),
                rs.getString("CITY"),
                rs.getString("POSTAL"),
                rs.getString("EMAIL"),
                rs.getInt("SUB"),
                rs.getInt("REPSUB"),
                rs.getInt("TUITION"),
                rs.getInt("TUITIONREP"),
                rs.getInt("AMOUNTDEP"),
                rs.getInt("TOTALFEE"),
                rs.getInt("REMAINING")
    
                ));
                
                
           
                
               
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
       return list;
        
    }

 

    @FXML
    private void autoAge(MouseEvent event) {
        
            Calendar now = Calendar.getInstance();
            int year = now.get(Calendar.YEAR);
            int birthYear =  (dob.getValue().getYear());
            int ageToday = year - birthYear;
            age.setText(Integer.toString(ageToday));
    }

    @FXML
    private void saveUpdate(ActionEvent event) throws SQLException {
        
        
      int temp = Integer.parseInt(studentField.getText());

String qu  = "update students set SUB= "+ numSub.getText() +" , REPSUB = "+ numRepsub.getText() +" , TUITION = "+ tuitionFee.getText()  +" , TUITIONREP = "+   tuitionFeeRep.getText()+ ", AMOUNTDEP = "+  amountDepo.getText() +", TOTALFEE  =     "+totalFee.getText() +" ,  REMAINING  = "+ remainingBalance.getText()  +"WHERE STUDENT_ID = "+ temp;

database.execAction(qu);
tableView.setItems(loadData("SELECT * FROM students"));
setAllDisable();
setClear();
    }

    @FXML
    private void refreshTable(ActionEvent event) {
        
        tableView.setItems(loadData("SELECT * FROM students"));

    }

    

    @FXML
    private void subjects(MouseEvent event) {
        
         int numb = Integer.parseInt(numSub.getText());
         
         
        if(numb > 6)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("NO MORE THAT 6 SUBJECTS");
            alert.showAndWait();
            
            
            numSub.clear();
            return;
        }
        
        
        if(numb >= 6)
        {
            
            numRepsub.setVisible(false);
            numRepsub.setText("0");
            
        }else
        {
            numRepsub.setVisible(true);
        }
    }

 

    @FXML
    private void solveTuition(MouseEvent event) {
        
        int tuition = Integer.parseInt(numSub.getText());
        
        int tuitionAmount = tuition * 525;
        
        tuitionFee.setText(Integer.toString(tuitionAmount));
        
        
    }

    @FXML
    private void repSolve(MouseEvent event) {
        
        int numb = Integer.parseInt(numSub.getText());
        
        int numbRep = Integer.parseInt(numRepsub.getText());
        
        int total = numb + numbRep;
        
        if(total > 6)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("NO MORE THAN 6 SUBJECTS");
            alert.showAndWait();
            numSub.clear();
            numRepsub.clear();
            return;
        }
        
        if(numbRep >= 2)
        {
            
            numSub.setDisable(true);
        }
        else
        {
            numSub.setDisable(false);
        }
        if(total == 6)
        {
            numSub.setDisable(true);
            numRepsub.setDisable(true);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }

    @FXML
    private void solveTuitionRep(MouseEvent event) {
        
        int tuition = Integer.parseInt(numRepsub.getText());
        
        int tuitionAmount = tuition * 110;
        
        tuitionFeeRep.setText(Integer.toString(tuitionAmount));
        
        
        
    }

    @FXML
    private void remainingMoney(MouseEvent event) {
        
        
        int tuitionfee =  Integer.parseInt(tuitionFee.getText());
        int tuitionfeerep = Integer.parseInt(tuitionFeeRep.getText());
        int amountpaid = Integer.parseInt(amountDepo.getText());
        int totalFee = tuitionfee + tuitionfeerep;
        
        int remaining =    totalFee - amountpaid;
        
        
        remainingBalance.setText(Integer.toString(remaining));
        
  
        if(totalFee < amountpaid)
        {
            
           remainingBalance.setText(Integer.toString(0));
            
        }
            
        
        
        
        
        
        
        
        
    }

      

    @FXML
    private void totalfee(MouseEvent event) {
        
         int tuitionfee =  Integer.parseInt(tuitionFee.getText());
        int tuitionfeerep = Integer.parseInt(tuitionFeeRep.getText());
         int totalFeeInt = tuitionfee + tuitionfeerep;
         
         
         totalFee.setText(Integer.toString(totalFeeInt));
        
    }
    
    
    
    
                 
   
}
