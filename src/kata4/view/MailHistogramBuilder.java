/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.view;

import java.util.ArrayList;
import kata4.model.Histogram;
import kata4.model.Mail;

/**
 *
 * @author ALE
 */
public class MailHistogramBuilder {
    
    public static  Histogram<String> build(ArrayList<String> mail){
        Histogram<String> histo = new Histogram <>();
        for (String mail1 : mail) {
                        histo.increment(new Mail(mail1).getDomain());
        }
        return histo;
        
    } 
    
}
