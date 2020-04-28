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
public class LocalAddress
{
    private String lstreetLine1;
    private String lstreetLine2;
    private String lcity;
    private String lstate;
    private String lzipCode;
    private String lcountry;
    
    public LocalAddress()
    {
        this.lstreetLine1 = null;
        this.lstreetLine2 = null;
        this.lcity = null;
        this.lstate = null;
        this.lzipCode = null;
        this.lcountry = null;
    }

    public LocalAddress(String lstreetLine1, String lstreetLine2, String lcity, String lstate, String lzipCode, String lcountry) {
        this.lstreetLine1 = lstreetLine1;
        this.lstreetLine2 = lstreetLine2;
        this.lcity = lcity;
        this.lstate = lstate;
        this.lzipCode = lzipCode;
        this.lcountry = lcountry;
    }

    public String getLstreetLine1() {
        return lstreetLine1;
    }

    public void setLstreetLine1(String lstreetLine1) {
        this.lstreetLine1 = lstreetLine1;
    }

    public String getLstreetLine2() {
        return lstreetLine2;
    }

    public void setLstreetLine2(String lstreetLine2) {
        this.lstreetLine2 = lstreetLine2;
    }

    public String getLcity() {
        return lcity;
    }

    public void setLcity(String lcity) {
        this.lcity = lcity;
    }

    public String getLstate() {
        return lstate;
    }

    public void setLstate(String lstate) {
        this.lstate = lstate;
    }

    public String getLzipCode() {
        return lzipCode;
    }

    public void setLzipCode(String lzipCode) {
        this.lzipCode = lzipCode;
    }

    public String getLcountry() {
        return lcountry;
    }

    public void setLcountry(String lcountry) {
        this.lcountry = lcountry;
    }
    
    
}
