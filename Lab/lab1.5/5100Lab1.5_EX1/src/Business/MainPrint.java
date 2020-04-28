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
public class MainPrint {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        Person zmb = new Person();
        Show show = new Show();
        show.DisplayInfo(zmb, zmb.getWorkAddress(), zmb.getLocalAddress(), zmb.getHomeAddress());
    }
    
}