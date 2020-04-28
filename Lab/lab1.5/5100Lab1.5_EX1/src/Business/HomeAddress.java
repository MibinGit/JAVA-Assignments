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
public class HomeAddress
{
    private String hstreetLine1;
    private String hstreetLine2;
    private String hcity;
    private String hstate;
    private String hzipCode;
    private String hcountry;
    
    public HomeAddress()
    {
        this.hstreetLine1 = null;
        this.hstreetLine2 = null;
        this.hcity = null;
        this.hstate = null;
        this.hzipCode = null;
        this.hcountry = null;
    }

    public HomeAddress(String hstreetLine1, String hstreetLine2, String hcity, String hstate, String hzipCode, String hcountry) {
        this.hstreetLine1 = hstreetLine1;
        this.hstreetLine2 = hstreetLine2;
        this.hcity = hcity;
        this.hstate = hstate;
        this.hzipCode = hzipCode;
        this.hcountry = hcountry;
    }

    public String getHstreetLine1() {
        return hstreetLine1;
    }

    public void setHstreetLine1(String hstreetLine1) {
        this.hstreetLine1 = hstreetLine1;
    }

    public String getHstreetLine2() {
        return hstreetLine2;
    }

    public void setHstreetLine2(String hstreetLine2) {
        this.hstreetLine2 = hstreetLine2;
    }

    public String getHcity() {
        return hcity;
    }

    public void setHcity(String hcity) {
        this.hcity = hcity;
    }

    public String getHstate() {
        return hstate;
    }

    public void setHstate(String hstate) {
        this.hstate = hstate;
    }

    public String getHzipCode() {
        return hzipCode;
    }

    public void setHzipCode(String hzipCode) {
        this.hzipCode = hzipCode;
    }

    public String getHcountry() {
        return hcountry;
    }

    public void setHcountry(String hcountry) {
        this.hcountry = hcountry;
    }
    
    
}
