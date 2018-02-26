/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.tools.main;

import com.jfoenix.controls.JFXButton;
import database.DatabaseHandler;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Clarissa
 */
public class MainController implements Initializable {

    @FXML
    private JFXButton teachersbtn;
    
     @FXML
    private JFXButton studentsbtn;
     
     DatabaseHandler database;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       database =  DatabaseHandler.getInstance();
    }    

    @FXML
    private void teachers(ActionEvent event) {
        
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/project/tools/teacher/Teacher.fxml"));
             Scene scene = new Scene(parent);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.hide();
                            stage.setScene(scene);
                            stage.setTitle("Teacher Panel");
                            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
                           
    }
        
    @FXML
    private void students(ActionEvent event) {
          try {
            Parent parent = FXMLLoader.load(getClass().getResource("/project/tools/students/Student.fxml"));
             Scene scene = new Scene(parent);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.hide();
                           
                            stage.setScene(scene);
                            stage.setTitle("Student Panel");
                            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       
    }

    @FXML
    private void about(ActionEvent event){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/project/tools/about/about.fxml"));
             Scene scene = new Scene(parent);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.hide();
                            stage.setScene(scene);
                            stage.setTitle("Teacher Panel");
                            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    

    }
    

