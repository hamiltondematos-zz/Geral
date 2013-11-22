/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import java.util.Random;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author hamilton.matos
 */
@ManagedBean
public class LoginManagedBean {

    /**
     * Creates a new instance of LoginManagedBean
     */
    public LoginManagedBean() {
    }

    public String getNome() {
        return new String[]{"Arnold", "Charlotte", "Jordan", "Clegg", "Emily"}[(new Random()).nextInt(5)];
    }

}
