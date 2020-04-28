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
public class Show
{
    public Show()
    {
        
    }
    
    private Person person;
    private WorkAddress workAddress;
    private LocalAddress localAddress;
    private HomeAddress homeAddress;
    
    public void DisplayInfo(Person person, WorkAddress workAddress, LocalAddress localAddress, HomeAddress homeAddress)
    {
        person.setFirstName("Mibin");
        person.setLastName("Zhu");
        person.setStreetAddress("75 Saint");
        person.setDateOfBirth("23/03/1996");
        
        workAddress.setWstreetLine1("360 Huntington Ave");
        person.setWorkAddress(workAddress);
        
        workAddress.setWstreetLine2("Rm 901");
        person.setWorkAddress(workAddress);
        
        workAddress.setWcity("Boston");
        person.setWorkAddress(workAddress);
        
        workAddress.setWstate("MA");
        person.setWorkAddress(workAddress);
        
        workAddress.setWzipCode("02120");
        person.setWorkAddress(workAddress);
        
        workAddress.setWcountry("USA");
        person.setWorkAddress(workAddress);
        
        localAddress.setLstreetLine1("365 Huntington Ave");
        person.setLocalAddress(localAddress);
        
        localAddress.setLstreetLine2("Rm 101");
        person.setLocalAddress(localAddress);
        
        homeAddress.setHstreetLine1("370 Huntington Ave");
        person.setHomeAddress(homeAddress);
        
        homeAddress.setHstreetLine2("Rm 2000");
        person.setHomeAddress(homeAddress);
        
        System.out.println("1.First Name : " + person.getFirstName() + "\n"
                          +"2.Last Name :" + person.getLastName() + "\n"
                          +"3.Street Address :" + person.getStreetAddress() + "\n"
                          +"4.Date of Birth :" + person.getDateOfBirth() + "\n\n"
                          +"Work Address" + "\n"
                          +"1.Work Address Line 1 :" + person.getWorkAddress().getWstreetLine1() + "\n"
                          +"2.Work Address Line 2 :" + person.getWorkAddress().getWstreetLine2() + "\n"
                          +"3.Work City :" + person.getWorkAddress().getWcity() + "\n"
                          +"4.Work State :" + person.getWorkAddress().getWstate() + "\n"
                          +"5.Work Zip Code :" + person.getWorkAddress().getWzipCode() + "\n"
                          +"6.Work Country :" + person.getWorkAddress().getWcountry() + "\n\n"
                          +"Local Address" + "\n"
                          +"1.Local Address Line 1 :" + person.getLocalAddress().getLstreetLine1() + "\n"
                          +"2.Local Address Line 2 :" + person.getLocalAddress().getLstreetLine2() + "\n\n"
                          +"Home Address" + "\n"
                          +"1.Home Address Line 1 :" + person.getHomeAddress().getHstreetLine1() + "\n"
                          +"2.Home Address Line 2 :" + person.getHomeAddress().getHstreetLine2() + "\n");
    }
}
