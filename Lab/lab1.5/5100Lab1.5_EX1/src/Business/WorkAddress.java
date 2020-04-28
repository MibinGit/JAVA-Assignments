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
public class WorkAddress
{
    private String wstreetLine1;
    private String wstreetLine2;
    private String wcity;
    private String wstate;
    private String wzipCode;
    private String wcountry;
    
    public WorkAddress()
    {
        this.wstreetLine1 = null;
        this.wstreetLine2 = null;
        this.wcity = null;
        this.wstate = null;
        this.wzipCode = null;
        this.wcountry = null;
    }

    public WorkAddress(String wstreetLine1, String wstreetLine2, String wcity, String wstate, String wzipCode, String wcountry) {
        this.wstreetLine1 = wstreetLine1;
        this.wstreetLine2 = wstreetLine2;
        this.wcity = wcity;
        this.wstate = wstate;
        this.wzipCode = wzipCode;
        this.wcountry = wcountry;
    }

    public String getWstreetLine1() {
        return wstreetLine1;
    }

    public void setWstreetLine1(String wstreetLine1) {
        this.wstreetLine1 = wstreetLine1;
    }

    public String getWstreetLine2() {
        return wstreetLine2;
    }

    public void setWstreetLine2(String wstreetLine2) {
        this.wstreetLine2 = wstreetLine2;
    }

    public String getWcity() {
        return wcity;
    }

    public void setWcity(String wcity) {
        this.wcity = wcity;
    }

    public String getWstate() {
        return wstate;
    }

    public void setWstate(String wstate) {
        this.wstate = wstate;
    }

    public String getWzipCode() {
        return wzipCode;
    }

    public void setWzipCode(String wzipCode) {
        this.wzipCode = wzipCode;
    }

    public String getWcountry() {
        return wcountry;
    }

    public void setWcountry(String wcountry) {
        this.wcountry = wcountry;
    }
    
    
}
