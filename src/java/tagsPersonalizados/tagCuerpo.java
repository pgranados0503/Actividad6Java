/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagsPersonalizados;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;


/**
 *
 * @author Paul_Granados
 */
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class tagCuerpo extends SimpleTagSupport{
    StringWriter sw = new StringWriter();
    
    @Override
    public void doTag() throws JspException, IOException{
        getJspBody().invoke(sw);
        getJspContext().getOut().println("Hola, este es el Body" +sw.toString());
    }
    
}
