/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author dell
 */
public class ProDemographic
{
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String DateOfBirth;
    private String Age;
    private String Height;
    private String Weight;
    private String SSN;

    public ProDemographic()
    {
        this.FirstName = null;
        this.LastName = null;
        this.PhoneNumber = null;
        this.DateOfBirth = null;
        this.Age = null;
        this.Height = null;
        this.Weight = null;
        this.SSN = null;
    }
    
    public ProDemographic(String FirstName, String LastName, String PhoneNumber, String DateOfBirth, String Age, String Height, String Weight, String SSN) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.DateOfBirth = DateOfBirth;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    
    
}
