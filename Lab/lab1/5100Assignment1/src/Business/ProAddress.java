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
public class ProAddress
{
    private String StreetAddress;
    private String City;
    private String State;
    private String ZipCode;
    
    public ProAddress()
    {
        this.StreetAddress = null;
        this.City = null;
        this.State = null;
        this.ZipCode = null; 
    }
    
    public ProAddress(String StreetAddress, String City, String State, String ZipCode) {
        this.StreetAddress = StreetAddress;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }
    
    
}
