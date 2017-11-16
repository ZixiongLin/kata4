/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.model;

/**
 *
 * @author ALE
 */
public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        if(!mail.contains("@")){
            return null;
        }

        String [] domain = mail.split("@");
        System.out.println(domain[1]);
        return domain[1];
    }
}
