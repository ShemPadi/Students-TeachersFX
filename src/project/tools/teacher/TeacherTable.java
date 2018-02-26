/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.tools.teacher;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Clarissa
 */
public class TeacherTable {
    
    
    private final SimpleIntegerProperty TeacherTableTeacherID;
    private final SimpleStringProperty TeacherTableTeacherFname;
    private final SimpleStringProperty TeacherTableTeacherMname;
    private final SimpleStringProperty TeacherTableTeacherLname;
    private final SimpleStringProperty TeacherTableTeacherDepartment;
    private final SimpleStringProperty TeacherTableTeacherDesignation;
    private final SimpleStringProperty TeacherTableDataTeacherDateofBirth;
    private final SimpleStringProperty TeacherTableDataTeacherAge;
    private final SimpleStringProperty TeacherTableDataTeacherGender;
    private final SimpleStringProperty TeacherTableDataTeacherLandPhone;
    private final SimpleStringProperty TeacherTableDataTeacherMobileNo;
    private final SimpleStringProperty TeacherTableDataTeacherStreet;
    private final SimpleStringProperty TeacherTableDataTeacherCity;
    private final SimpleStringProperty TeacherTableDataTeacherPostal;
    private final SimpleStringProperty TeacherTableDataTeacherEmail;
    private final SimpleIntegerProperty TeacherTableDataTeacherTeachingHours;
    private final SimpleIntegerProperty TeacherTableDataTeacherHousingAllowance;
    private final SimpleIntegerProperty TeacherTableDataTeacherMedicalAllowance;
    private final SimpleIntegerProperty TeacherTableDataTeacherTravellingAllowance;
    private final SimpleIntegerProperty TeacherTableDataTeacherOT;
    private final SimpleIntegerProperty TeacherTableDataTeacherNETSalary;
    
    
    public TeacherTable(int TeacherTableTeacherID, String TeacherTableTeacherFname, String TeacherTableTeacherMname, String TeacherTableTeacherLname,String TeacherTableTeacherDepartment, String TeacherTableTeacherDesignation, String TeacherTableDataTeacherDateofBirth, String TeacherTableDataTeacherAge, String TeacherTableDataTeacherGender, String TeacherTableDataTeacherLandPhone, String TeacherTableDataTeacherMobileNo, String TeacherTableDataTeacherStreet, String TeacherTableDataTeacherCity, String TeacherTableDataTeacherPostal, String TeacherTableDataTeacherEmail, int TeacherTableDataTeacherTeachingHours,int TeacherTableDataTeacherHousingAllowance, int TeacherTableDataTeacherMedicalAllowance, int TeacherTableDataTeacherTravellingAllowance, int TeacherTableDataTeacherOT, int TeacherTableDataTeacherNETSalary) 



{
        this.TeacherTableTeacherID = new SimpleIntegerProperty(TeacherTableTeacherID);
        this.TeacherTableTeacherFname = new SimpleStringProperty(TeacherTableTeacherFname);
        this.TeacherTableTeacherMname = new SimpleStringProperty(TeacherTableTeacherMname);
        this.TeacherTableTeacherLname = new SimpleStringProperty(TeacherTableTeacherLname);
        this.TeacherTableTeacherDepartment = new SimpleStringProperty(TeacherTableTeacherDepartment);
        this.TeacherTableTeacherDesignation = new SimpleStringProperty(TeacherTableTeacherDesignation);
        this.TeacherTableDataTeacherDateofBirth = new SimpleStringProperty(TeacherTableDataTeacherDateofBirth);
        this.TeacherTableDataTeacherAge = new SimpleStringProperty(TeacherTableDataTeacherAge);
        this.TeacherTableDataTeacherGender = new SimpleStringProperty(TeacherTableDataTeacherGender);
        this.TeacherTableDataTeacherLandPhone = new SimpleStringProperty(TeacherTableDataTeacherLandPhone);
        this.TeacherTableDataTeacherMobileNo = new SimpleStringProperty(TeacherTableDataTeacherMobileNo);
        this.TeacherTableDataTeacherStreet = new SimpleStringProperty(TeacherTableDataTeacherStreet);
        this.TeacherTableDataTeacherCity = new SimpleStringProperty(TeacherTableDataTeacherCity);
        this.TeacherTableDataTeacherPostal = new SimpleStringProperty(TeacherTableDataTeacherPostal);
        this.TeacherTableDataTeacherEmail = new SimpleStringProperty(TeacherTableDataTeacherEmail);
        this.TeacherTableDataTeacherTeachingHours = new SimpleIntegerProperty(TeacherTableDataTeacherTeachingHours);
        this.TeacherTableDataTeacherHousingAllowance = new SimpleIntegerProperty(TeacherTableDataTeacherHousingAllowance);
        this.TeacherTableDataTeacherMedicalAllowance = new SimpleIntegerProperty(TeacherTableDataTeacherMedicalAllowance);
        this.TeacherTableDataTeacherTravellingAllowance = new SimpleIntegerProperty(TeacherTableDataTeacherTravellingAllowance);
        this.TeacherTableDataTeacherOT = new SimpleIntegerProperty(TeacherTableDataTeacherOT);
        this.TeacherTableDataTeacherNETSalary = new SimpleIntegerProperty(TeacherTableDataTeacherNETSalary);

        }
    
     //STUDENT_ID
    public Integer getTeacherTableTeacherID() {
        return TeacherTableTeacherID.get();   
                }
    
    public SimpleIntegerProperty TeacherTableTeacherIDProperty() {
        return TeacherTableTeacherID;
    }
  
    
    public void setTeacherTableTeacherID(Integer TeacherTableTeacherID) {
        this.TeacherTableTeacherID.set(TeacherTableTeacherID);
    }
    
   

   
//FNAME
    
    public String getTeacherTableTeacherFname(){
        return TeacherTableTeacherFname.get();
    }
    
    public SimpleStringProperty TeacherTableTeacherFnameProperty() {
        return TeacherTableTeacherFname;
    }
    
    public void setTeacherTableTeacherFname(String TeacherTableTeacherFname) {
        this.TeacherTableTeacherFname.set(TeacherTableTeacherFname);
    }

    
//MNAME
    
    
    public String getTeacherTableTeacherMname() {
        return TeacherTableTeacherMname.get();
    }

    
    public SimpleStringProperty TeacherTableTeacherMnameProperty() {
        return TeacherTableTeacherMname;
    }

        
    public void setTeacherTableTeacherMname(String TeacherTableTeacherMname) {
         this.TeacherTableTeacherMname.set(TeacherTableTeacherMname);
    }
//Lname
    
    
    public String getTeacherTableTeacherLname() {
        return TeacherTableTeacherLname.get();
    }
    
    public SimpleStringProperty TeacherTableTeacherLnameProperty() {
        return TeacherTableTeacherLname;
    }

    public void setTeacherTableTeacherLname(String TeacherTableTeacherLname) {
        this.TeacherTableTeacherLname.set(TeacherTableTeacherLname);
    }

    
//LEVEL
    
    
     public String getTeacherTableTeacherDepartment() {
        return TeacherTableTeacherDepartment.get();
    }
     
    public SimpleStringProperty TeacherTableTeacherDepartmentProperty() {
        return TeacherTableTeacherDepartment;
    }

    public void setTeacherTableTeacherDepartment(String TeacherTableTeacherDepartment) {
        this.TeacherTableTeacherDepartment.set(TeacherTableTeacherDepartment);
    }

   
//Course
    
    
    public String getTeacherTableTeacherDesignation() {
        return TeacherTableTeacherDesignation.get();
    }
    
    public SimpleStringProperty TeacherTableTeacherDesignationProperty() {
        return TeacherTableTeacherDesignation;
    }

    public void setTeacherTableTeacherDesignation(String TeacherTableTeacherDesignation) {
        this.TeacherTableTeacherDesignation.set(TeacherTableTeacherDesignation);
    }

    
//DateofBirth
    
    
     public String getTeacherTableDataTeacherDateofBirth() {
        return TeacherTableDataTeacherDateofBirth.get();
    }
     
    public SimpleStringProperty TeacherTableDataTeacherDateofBirthProperty() {
        return TeacherTableDataTeacherDateofBirth;
    }

    public void setTeacherTableDataTeacherDateofBirth(String TeacherTableDataTeacherDateofBirth) {
        this.TeacherTableDataTeacherDateofBirth.set(TeacherTableDataTeacherDateofBirth);
    }

   
//AGE
    
    
     public String getTeacherTableDataTeacherAge() {
        return TeacherTableDataTeacherAge.get();
    }
     
    public SimpleStringProperty TeacherTableDataTeacherAgeProperty() {
        return TeacherTableDataTeacherAge;
    }

    public void setTeacherTableDataTeacherAge(String TeacherTableDataTeacherAge) {
        this.TeacherTableDataTeacherAge.set(TeacherTableDataTeacherAge);
    }

   
//GENDER
    
    public String getTeacherTableDataTeacherGender() {
        return TeacherTableDataTeacherGender.get();
    }
    
    public SimpleStringProperty TeacherTableDataTeacherGenderProperty() {
        return TeacherTableDataTeacherGender;
    }

    public void setTeacherTableDataTeacherGender(String TeacherTableDataTeacherGender) {
        this.TeacherTableDataTeacherGender.set(TeacherTableDataTeacherGender);
    }

    
//LANDPHONE
    public SimpleStringProperty TeacherTableDataTeacherLandPhoneProperty() {
        return TeacherTableDataTeacherLandPhone;
    }

    public void setTeacherTableDataTeacherLandPhone(String TeacherTableDataTeacherLandPhone) {
        this.TeacherTableDataTeacherLandPhone.set(TeacherTableDataTeacherLandPhone);
    }

    public String getTeacherTableDataTeacherLandPhone() {
        return TeacherTableDataTeacherLandPhone.get();
    }
//Mobile
    
    
    public String getTeacherTableDataTeacherMobileNo() {
        return TeacherTableDataTeacherMobileNo.get();
    }
    
    public SimpleStringProperty TeacherTableDataTeacherMobileNoProperty() {
        return TeacherTableDataTeacherMobileNo;
    }

    public void setTeacherTableDataTeacherMobileNo(String TeacherTableDataTeacherMobileNo) {
        this.TeacherTableDataTeacherMobileNo.set(TeacherTableDataTeacherMobileNo);
    }

    
//Street
    
    
    public String getTeacherTableDataTeacherStreet() {
        return TeacherTableDataTeacherStreet.get();
    }
    
    
    public SimpleStringProperty TeacherTableDataTeacherStreetProperty() {
        return TeacherTableDataTeacherStreet;
    }

    public void setTeacherTableDataTeacherStreet(String TeacherTableDataTeacherStreet) {
        this.TeacherTableDataTeacherStreet.set(TeacherTableDataTeacherStreet);
    }

   //City

    
    public String getTeacherTableDataTeacherCity() {
        return TeacherTableDataTeacherCity.get();
    }
    
    public SimpleStringProperty TeacherTableDataTeacherCityProperty() {
        return TeacherTableDataTeacherCity;
    }

    public void setTeacherTableDataTeacherCity(String TeacherTableDataTeacherCity) {
        this.TeacherTableDataTeacherCity.set(TeacherTableDataTeacherCity);
    }

    
//Postal
    
     public String getTeacherTableDataTeacherPostal() {
        return TeacherTableDataTeacherPostal.get();
    }
    public SimpleStringProperty TeacherTableDataTeacherPostalProperty() {
        return TeacherTableDataTeacherPostal;
    }

    public void setTeacherTableDataTeacherPostal(String TeacherTableDataTeacherPostal) {
        this.TeacherTableDataTeacherPostal.set(TeacherTableDataTeacherPostal);
    }

   //Email

    
      public String getTeacherTableDataTeacherEmail() {
        return TeacherTableDataTeacherEmail.get();
    }
      
    public SimpleStringProperty TeacherTableDataTeacherEmailProperty() {
        return TeacherTableDataTeacherEmail;
    }

    public void setTeacherTableDataTeacherEmail(String TeacherTableDataTeacherEmail) {
        this.TeacherTableDataTeacherEmail.set(TeacherTableDataTeacherEmail);
    }

  
//TEACH
    
    public Integer getTeacherTableDataTeacherTeachingHours() {
        return TeacherTableDataTeacherTeachingHours.get();
    }
    
    public SimpleIntegerProperty TeacherTableDataTeacherTeachingHoursProperty() {
        return TeacherTableDataTeacherTeachingHours;
    }

    public void setTeacherTableDataTeacherTeachingHours(Integer TeacherTableDataTeacherTeachingHours) {
        this.TeacherTableDataTeacherTeachingHours.set(TeacherTableDataTeacherTeachingHours);
    }

    

    //REPSUB
    
    
    public Integer getTeacherTableDataTeacherHousingAllowance() {
        return TeacherTableDataTeacherHousingAllowance.get();
    }
    public SimpleIntegerProperty TeacherTableDataTeacherHousingAllowanceProperty() {
        return TeacherTableDataTeacherHousingAllowance;
    }
    public void setTeacherTableDataTeacherHousingAllowance(Integer TeacherTableDataTeacherHousingAllowance) {
        this.TeacherTableDataTeacherHousingAllowance.set(TeacherTableDataTeacherHousingAllowance);
    }

  

    
//TUITION
    
   

   public Integer getTeacherTableDataTeacherMedicalAllowance() {
        return TeacherTableDataTeacherMedicalAllowance.get();
    }
   
    public SimpleIntegerProperty TeacherTableDataTeacherMedicalAllowanceProperty() {
        return TeacherTableDataTeacherMedicalAllowance;
}
    public void setTeacherTableDataTeacherMedicalAllowance(Integer TeacherTableDataTeacherMedicalAllowance){
        this.TeacherTableDataTeacherMedicalAllowance.set(TeacherTableDataTeacherMedicalAllowance);
    }
    //TUITIONREP
    
   

   public Integer getTeacherTableDataTeacherTravellingAllowance() {
        return TeacherTableDataTeacherTravellingAllowance.get();
    }
   
    public SimpleIntegerProperty TeacherTableDataTeacherTravellingAllowanceProperty() {
        return TeacherTableDataTeacherTravellingAllowance;
}
    public void setTeacherTableDataTeacherTravellingAllowance(Integer TeacherTableDataTeacherTravellingAllowance){
        this.TeacherTableDataTeacherTravellingAllowance.set(TeacherTableDataTeacherTravellingAllowance);
    }
    
//AMOUNTPAID
    
     public Integer getTeacherTableDataTeacherOT() {
        return TeacherTableDataTeacherOT.get();
    }
     
    public SimpleIntegerProperty TeacherTableDataTeacherOTProperty() {
        return TeacherTableDataTeacherOT;
}
     
    public void setTeacherTableDataTeacherOT(Integer TeacherTableDataTeacherOT){
        this.TeacherTableDataTeacherOT.set(TeacherTableDataTeacherOT);
    }
   

  
   
  
    //REMAINING BALANCE
    
    public Integer getTeacherTableDataTeacherNETSalary() {
        return TeacherTableDataTeacherNETSalary.get();
    }
   
    
    
     public SimpleIntegerProperty TeacherTableDataTeacherNETSalaryProperty() {
        return TeacherTableDataTeacherNETSalary;

    
    
}
    public void setTeacherTableDataTeacherNETSalary(Integer TeacherTableDataTeacherNETSalary){
        this.TeacherTableDataTeacherNETSalary.set(TeacherTableDataTeacherNETSalary);
    }
    
    
}
