/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.tools.students;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Clarissa
 */
public class StudentTable {
    
    private final SimpleIntegerProperty studentTableStudentID;
    private final SimpleStringProperty studentTableStudentFname;
    private final SimpleStringProperty studentTableStudentMname;
    private final SimpleStringProperty studentTableStudentLname;
    private final SimpleStringProperty studentTableStudentLevel;
    private final SimpleStringProperty studentTableStudentCourse;
    private final SimpleStringProperty studentTableDataStudentDateofBirth;
    private final SimpleStringProperty studentTableDataStudentAge;
    private final SimpleStringProperty studentTableDataStudentGender;
    private final SimpleStringProperty studentTableDataStudentLandPhone;
    private final SimpleStringProperty studentTableDataStudentMobileNo;
    private final SimpleStringProperty studentTableDataStudentStreet;
    private final SimpleStringProperty studentTableDataStudentCity;
    private final SimpleStringProperty studentTableDataStudentPostal;
    private final SimpleStringProperty studentTableDataStudentEmail;
    private final SimpleIntegerProperty studentTableDataStudentSubject;
    private final SimpleIntegerProperty studentTableDataStudentRepeatedSubjects;
    private final SimpleIntegerProperty studentTableDataStudentTuition;
    private final SimpleIntegerProperty studentTableDataStudentTuitionRep;
     private final SimpleIntegerProperty studentTableDataStudentAmountPaid;
     private final SimpleIntegerProperty studentTableDataStudentTotalFee;
     private final SimpleIntegerProperty studentTableDataStudentRemainingBalance;
     
    

    public StudentTable(int studentTableStudentID, String studentTableStudentFname, String studentTableStudentMname, String studentTableStudentLname,String studentTableStudentLevel, String studentTableStudentCourse, String studentTableDataStudentDateofBirth, String studentTableDataStudentAge, String studentTableDataStudentGender, String studentTableDataStudentLandPhone, String studentTableDataStudentMobileNo, String studentTableDataStudentStreet, String studentTableDataStudentCity, String studentTableDataStudentPostal, String studentTableDataStudentEmail, int studentTableDataStudentSubject,int studentTableDataStudentRepeatedSubjects, int studentTableDataStudentTuition, int studentTableDataStudentTuitionRep, int studentTableDataStudentAmountPaid,int studentTableDataStudentTotalFee, int studentTableDataStudentRemainingBalance) {
        this.studentTableStudentID = new SimpleIntegerProperty(studentTableStudentID);
        this.studentTableStudentFname = new SimpleStringProperty(studentTableStudentFname);
        this.studentTableStudentMname = new SimpleStringProperty(studentTableStudentMname);
        this.studentTableStudentLname = new SimpleStringProperty(studentTableStudentLname);
        this.studentTableStudentLevel = new SimpleStringProperty(studentTableStudentLevel);
        this.studentTableStudentCourse = new SimpleStringProperty(studentTableStudentCourse);
        this.studentTableDataStudentDateofBirth = new SimpleStringProperty(studentTableDataStudentDateofBirth);
        this.studentTableDataStudentAge = new SimpleStringProperty(studentTableDataStudentAge);
        this.studentTableDataStudentGender = new SimpleStringProperty(studentTableDataStudentGender);
        this.studentTableDataStudentLandPhone = new SimpleStringProperty(studentTableDataStudentLandPhone);
        this.studentTableDataStudentMobileNo = new SimpleStringProperty(studentTableDataStudentMobileNo);
        this.studentTableDataStudentStreet = new SimpleStringProperty(studentTableDataStudentStreet);
        this.studentTableDataStudentCity = new SimpleStringProperty(studentTableDataStudentCity);
        this.studentTableDataStudentPostal = new SimpleStringProperty(studentTableDataStudentPostal);
        this.studentTableDataStudentEmail = new SimpleStringProperty(studentTableDataStudentEmail);
        this.studentTableDataStudentSubject = new SimpleIntegerProperty(studentTableDataStudentSubject);
        this.studentTableDataStudentRepeatedSubjects = new SimpleIntegerProperty(studentTableDataStudentRepeatedSubjects);
        this.studentTableDataStudentTuition = new SimpleIntegerProperty(studentTableDataStudentTuition);
        this.studentTableDataStudentTuitionRep = new SimpleIntegerProperty(studentTableDataStudentTuitionRep);
        this.studentTableDataStudentAmountPaid = new SimpleIntegerProperty(studentTableDataStudentAmountPaid);
        this.studentTableDataStudentTotalFee = new SimpleIntegerProperty(studentTableDataStudentTotalFee);
        this.studentTableDataStudentRemainingBalance = new SimpleIntegerProperty(studentTableDataStudentRemainingBalance);
        
    }
    //STUDENT_ID
    public Integer getStudentTableStudentID() {
        return studentTableStudentID.get();
    }
    
    public SimpleIntegerProperty studentTableStudentIDProperty() {
        return studentTableStudentID;
    }
  
    
    public void setStudentTableStudentID(Integer studentTableStudentID) {
        this.studentTableStudentID.set(studentTableStudentID);
    }
    
   

   
//FNAME
    
    public String getStudentTableStudentFname(){
        return studentTableStudentFname.get();
    }
    
    public SimpleStringProperty studentTableStudentFnameProperty() {
        return studentTableStudentFname;
    }
    
    public void setStudentTableStudentFname(String studentTableStudentFname) {
        this.studentTableStudentFname.set(studentTableStudentFname);
    }

    
//MNAME
    
    
    public String getStudentTableStudentMname() {
        return studentTableStudentMname.get();
    }

    
    public SimpleStringProperty studentTableStudentMnameProperty() {
        return studentTableStudentMname;
    }

        
    public void setStudentTableStudentMname(String studentTableStudentMname) {
         this.studentTableStudentMname.set(studentTableStudentMname);
    }
//Lname
    
    
    public String getStudentTableStudentLname() {
        return studentTableStudentLname.get();
    }
    
    public SimpleStringProperty studentTableStudentLnameProperty() {
        return studentTableStudentLname;
    }

    public void setStudentTableStudentLname(String studentTableStudentLname) {
        this.studentTableStudentLname.set(studentTableStudentLname);
    }

    
//LEVEL
    
    
     public String getStudentTableStudentLevel() {
        return studentTableStudentLevel.get();
    }
     
    public SimpleStringProperty studentTableStudentLevelProperty() {
        return studentTableStudentLevel;
    }

    public void setStudentTableStudentLevel(String studentTableStudentLevel) {
        this.studentTableStudentLevel.set(studentTableStudentLevel);
    }

   
//Course
    
    
    public String getStudentTableStudentCourse() {
        return studentTableStudentCourse.get();
    }
    
    public SimpleStringProperty studentTableStudentCourseProperty() {
        return studentTableStudentCourse;
    }

    public void setStudentTableStudentCourse(String studentTableStudentCourse) {
        this.studentTableStudentCourse.set(studentTableStudentCourse);
    }

    
//DateofBirth
    
    
     public String getStudentTableDataStudentDateofBirth() {
        return studentTableDataStudentDateofBirth.get();
    }
     
    public SimpleStringProperty studentTableDataStudentDateofBirthProperty() {
        return studentTableDataStudentDateofBirth;
    }

    public void setStudentTableDataStudentDateofBirth(String studentTableDataStudentDateofBirth) {
        this.studentTableDataStudentDateofBirth.set(studentTableDataStudentDateofBirth);
    }

   
//AGE
    
    
     public String getStudentTableDataStudentAge() {
        return studentTableDataStudentAge.get();
    }
     
    public SimpleStringProperty studentTableDataStudentAgeProperty() {
        return studentTableDataStudentAge;
    }

    public void setStudentTableDataStudentAge(String studentTableDataStudentAge) {
        this.studentTableDataStudentAge.set(studentTableDataStudentAge);
    }

   
//GENDER
    
    public String getStudentTableDataStudentGender() {
        return studentTableDataStudentGender.get();
    }
    
    public SimpleStringProperty studentTableDataStudentGenderProperty() {
        return studentTableDataStudentGender;
    }

    public void setStudentTableDataStudentGender(String studentTableDataStudentGender) {
        this.studentTableDataStudentGender.set(studentTableDataStudentGender);
    }

    
//LANDPHONE
    public SimpleStringProperty studentTableDataStudentLandPhoneProperty() {
        return studentTableDataStudentLandPhone;
    }

    public void setStudentTableDataStudentLandPhone(String studentTableDataStudentLandPhone) {
        this.studentTableDataStudentLandPhone.set(studentTableDataStudentLandPhone);
    }

    public String getStudentTableDataStudentLandPhone() {
        return studentTableDataStudentLandPhone.get();
    }
//Mobile
    
    
    public String getStudentTableDataStudentMobileNo() {
        return studentTableDataStudentMobileNo.get();
    }
    
    public SimpleStringProperty studentTableDataStudentMobileNoProperty() {
        return studentTableDataStudentMobileNo;
    }

    public void setStudentTableDataStudentMobileNo(String studentTableDataStudentMobileNo) {
        this.studentTableDataStudentMobileNo.set(studentTableDataStudentMobileNo);
    }

    
//Street
    
    
    public String getStudentTableDataStudentStreet() {
        return studentTableDataStudentStreet.get();
    }
    
    
    public SimpleStringProperty studentTableDataStudentStreetProperty() {
        return studentTableDataStudentStreet;
    }

    public void setStudentTableDataStudentStreet(String studentTableDataStudentStreet) {
        this.studentTableDataStudentStreet.set(studentTableDataStudentStreet);
    }

   //City

    
    public String getStudentTableDataStudentCity() {
        return studentTableDataStudentCity.get();
    }
    
    public SimpleStringProperty studentTableDataStudentCityProperty() {
        return studentTableDataStudentCity;
    }

    public void setStudentTableDataStudentCity(String studentTableDataStudentCity) {
        this.studentTableDataStudentCity.set(studentTableDataStudentCity);
    }

    
//Postal
    
     public String getStudentTableDataStudentPostal() {
        return studentTableDataStudentPostal.get();
    }
    public SimpleStringProperty studentTableDataStudentPostalProperty() {
        return studentTableDataStudentPostal;
    }

    public void setStudentTableDataStudentPostal(String studentTableDataStudentPostal) {
        this.studentTableDataStudentPostal.set(studentTableDataStudentPostal);
    }

   //Email

    
      public String getStudentTableDataStudentEmail() {
        return studentTableDataStudentEmail.get();
    }
      
    public SimpleStringProperty studentTableDataStudentEmailProperty() {
        return studentTableDataStudentEmail;
    }

    public void setStudentTableDataStudentEmail(String studentTableDataStudentEmail) {
        this.studentTableDataStudentEmail.set(studentTableDataStudentEmail);
    }

  

    
    public Integer getStudentTableDataStudentSubject() {
        return studentTableDataStudentSubject.get();
    }
    
    public SimpleIntegerProperty studentTableDataStudentSubjectProperty() {
        return studentTableDataStudentSubject;
    }

    public void setStudentTableDataStudentSubject(Integer studentTableDataStudentSubject) {
        this.studentTableDataStudentSubject.set(studentTableDataStudentSubject);
    }

    

    //REPSUB
    
    
    public Integer getStudentTableDataStudentRepeatedSubjects() {
        return studentTableDataStudentRepeatedSubjects.get();
    }
    public SimpleIntegerProperty studentTableDataStudentRepeatedSubjectsProperty() {
        return studentTableDataStudentRepeatedSubjects;
    }
    public void setStudentTableDataStudentRepeatedSubjects(Integer studentTableDataStudentRepeatedSubjects) {
        this.studentTableDataStudentRepeatedSubjects.set(studentTableDataStudentRepeatedSubjects);
    }

  

    
//TUITION
    
   

   public Integer getStudentTableDataStudentTuition() {
        return studentTableDataStudentTuition.get();
    }
   
    public SimpleIntegerProperty studentTableDataStudentTuitionProperty() {
        return studentTableDataStudentTuition;
}
    public void setStudentTableDataStudentTuition(Integer studentTableDataStudentTuition){
        this.studentTableDataStudentTuition.set(studentTableDataStudentTuition);
    }
    //TUITIONREP
    
   

   public Integer getStudentTableDataStudentTuitionRep() {
        return studentTableDataStudentTuitionRep.get();
    }
   
    public SimpleIntegerProperty studentTableDataStudentTuitionRepProperty() {
        return studentTableDataStudentTuitionRep;
}
    public void setStudentTableDataStudentTuitionRep(Integer studentTableDataStudentTuitionRep){
        this.studentTableDataStudentTuitionRep.set(studentTableDataStudentTuitionRep);
    }
    
//AMOUNTPAID
    
     public Integer getStudentTableDataStudentAmountPaid() {
        return studentTableDataStudentAmountPaid.get();
    }
     
    public SimpleIntegerProperty studentTableDataStudentAmountPaidProperty() {
        return studentTableDataStudentAmountPaid;
}
     
    public void setStudentTableDataStudentAmountPaid(Integer studentTableDataStudentAmountPaid){
        this.studentTableDataStudentAmountPaid.set(studentTableDataStudentAmountPaid);
    }
   
    //TOTAL
    
     public Integer getStudentTableDataStudentTotalFeed() {
        return studentTableDataStudentTotalFee.get();
    }
     
    public SimpleIntegerProperty studentTableDataStudentTotalFeeProperty() {
        return studentTableDataStudentTotalFee;
}
     
    public void setStudentTableDataStudentTotalFee(Integer studentTableDataStudentTotalFee){
        this.studentTableDataStudentTotalFee.set(studentTableDataStudentTotalFee);
    }

  
   
  
    //REMAINING BALANCE
    
    public Integer getStudentTableDataStudentRemainingBalance() {
        return studentTableDataStudentRemainingBalance.get();
    }
   
    
    
     public SimpleIntegerProperty studentTableDataStudentRemainingBalanceProperty() {
        return studentTableDataStudentRemainingBalance;

    
    
}
    public void setStudentTableDataStudentRemainingBalance(Integer studentTableDataStudentRemainingBalance){
        this.studentTableDataStudentRemainingBalance.set(studentTableDataStudentRemainingBalance);
    }
   

   
   

}