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
public class Person
{
    private String lastName;
    private String firstName;
    private String streetAddress;
    private String DateOfBirth;
    private WorkAddress workAddress;
    private HomeAddress homeAddress;
    private LocalAddress localAddress;
    
    public Person()
    {
        this.lastName = null;
        this.firstName = null;
        this.streetAddress = null;
        this.DateOfBirth = null;
        
        this.workAddress = new WorkAddress();
        this.localAddress = new LocalAddress();
        this.homeAddress = new HomeAddress();
    }

    public Person(String lastName, String firstName, String streetAddress, String DateOfBirth, WorkAddress workAddress, HomeAddress homeAddress, LocalAddress localAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.DateOfBirth = DateOfBirth;
        this.workAddress = workAddress;
        this.homeAddress = homeAddress;
        this.localAddress = localAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public WorkAddress getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(WorkAddress workAddress) {
        this.workAddress = workAddress;
    }

    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }

    public LocalAddress getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(LocalAddress localAddress) {
        this.localAddress = localAddress;
    }
    
    
}


