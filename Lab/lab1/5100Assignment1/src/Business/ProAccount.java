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
public class ProAccount
{
    private String SBankName;
    private String SRoutingNumber;
    private String SAccountNumber;
    private String SAccountBalance;
    private String SAccountType;
    
    private String CBankName;
    private String CRoutingNumber;
    private String CAccountNumber;
    private String CAccountBalance;
    private String CAccountType;

    public ProAccount()
    {
        this.SBankName = null;
        this.SRoutingNumber = null;
        this.SAccountNumber = null;
        this.SAccountBalance = null;
        this.SAccountType = null;
        this.CBankName = null;
        this.CRoutingNumber = null;
        this.CAccountNumber = null;
        this.CAccountBalance = null;
        this.CAccountType = null;
    }
    
    public ProAccount(String SBankName, String SRoutingNumber, String SAccountNumber, String SAccountBalance, String SAccountType, String CBankName, String CRoutingNumber, String CAccountNumber, String CAccountBalance, String CAccountType) {
        this.SBankName = SBankName;
        this.SRoutingNumber = SRoutingNumber;
        this.SAccountNumber = SAccountNumber;
        this.SAccountBalance = SAccountBalance;
        this.SAccountType = SAccountType;
        this.CBankName = CBankName;
        this.CRoutingNumber = CRoutingNumber;
        this.CAccountNumber = CAccountNumber;
        this.CAccountBalance = CAccountBalance;
        this.CAccountType = CAccountType;
    }

    public String getSBankName() {
        return SBankName;
    }

    public void setSBankName(String SBankName) {
        this.SBankName = SBankName;
    }

    public String getSRoutingNumber() {
        return SRoutingNumber;
    }

    public void setSRoutingNumber(String SRoutingNumber) {
        this.SRoutingNumber = SRoutingNumber;
    }

    public String getSAccountNumber() {
        return SAccountNumber;
    }

    public void setSAccountNumber(String SAccountNumber) {
        this.SAccountNumber = SAccountNumber;
    }

    public String getSAccountBalance() {
        return SAccountBalance;
    }

    public void setSAccountBalance(String SAccountBalance) {
        this.SAccountBalance = SAccountBalance;
    }

    public String getSAccountType() {
        return SAccountType;
    }

    public void setSAccountType(String SAccountType) {
        this.SAccountType = SAccountType;
    }

    public String getCBankName() {
        return CBankName;
    }

    public void setCBankName(String CBankName) {
        this.CBankName = CBankName;
    }

    public String getCRoutingNumber() {
        return CRoutingNumber;
    }

    public void setCRoutingNumber(String CRoutingNumber) {
        this.CRoutingNumber = CRoutingNumber;
    }

    public String getCAccountNumber() {
        return CAccountNumber;
    }

    public void setCAccountNumber(String CAccountNumber) {
        this.CAccountNumber = CAccountNumber;
    }

    public String getCAccountBalance() {
        return CAccountBalance;
    }

    public void setCAccountBalance(String CAccountBalance) {
        this.CAccountBalance = CAccountBalance;
    }

    public String getCAccountType() {
        return CAccountType;
    }

    public void setCAccountType(String CAccountType) {
        this.CAccountType = CAccountType;
    }
    
    
}
