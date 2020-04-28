/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.File;

/**
 *
 * @author dell
 */
public class ProLicense
{
    private String LicenseNumber;
    private String IssuedDate;
    private String ExpirationDate;
    private String BloodType;
    private File picture;

    public ProLicense()
    {
        this.LicenseNumber = null;
        this.IssuedDate = null;
        this.ExpirationDate = null;
        this.BloodType = null;
        this.picture = new File("C:\\Users\\dell\\Documents\\NetBeansProjects\\5100Assignment1\\src\\picture\\Default.jpg");
    }
    
    public ProLicense(String LicenseNumber, String IssuedDate, String ExpirationDate, String BloodType, File picture) {
        this.LicenseNumber = LicenseNumber;
        this.IssuedDate = IssuedDate;
        this.ExpirationDate = ExpirationDate;
        this.BloodType = BloodType;
        this.picture = picture;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    public String getIssuedDate() {
        return IssuedDate;
    }

    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }
    
    
}
