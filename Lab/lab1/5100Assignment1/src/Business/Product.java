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
public class Product
{
    private ProDemographic proDemographic;
    private ProAddress proAddress;
    private ProAccount proAccount;
    private ProLicense proLicense;
    private ProMedical proMedical;
    
    public Product()
    {
        this.proDemographic = new ProDemographic();
        this.proAddress = new ProAddress();
        this.proAccount = new ProAccount();
        this.proLicense = new ProLicense();
        this.proMedical = new ProMedical();
    }

    public ProDemographic getProDemographic() {
        return proDemographic;
    }

    public void setProDemographic(ProDemographic proDemographic) {
        this.proDemographic = proDemographic;
    }

    public ProAddress getProAddress() {
        return proAddress;
    }

    public void setProAddress(ProAddress proAddress) {
        this.proAddress = proAddress;
    }

    public ProAccount getProAccount() {
        return proAccount;
    }

    public void setProAccount(ProAccount proAccount) {
        this.proAccount = proAccount;
    }

    public ProLicense getProLicense() {
        return proLicense;
    }

    public void setProLicense(ProLicense proLicense) {
        this.proLicense = proLicense;
    }

    public ProMedical getProMedical() {
        return proMedical;
    }

    public void setProMedical(ProMedical proMedical) {
        this.proMedical = proMedical;
    }
    
    
}
