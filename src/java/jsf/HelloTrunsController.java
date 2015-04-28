/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author macuser
 */
@ManagedBean(name = "helloTrunsController1")
@ViewScoped
public class HelloTrunsController {

    /**
     * Creates a new instance of HelloTrunsController
     */
    public HelloTrunsController() {
    }
    
    private String strMessage1;

    /**
     * @return the strMessage1
     */
    public String getStrMessage1() {
        return strMessage1;
    }

    /**
     * @param strMessage1 the strMessage1 to set
     */
    public void setStrMessage1(String strMessage1) {
        this.strMessage1 = strMessage1;
    }
    
    
}
