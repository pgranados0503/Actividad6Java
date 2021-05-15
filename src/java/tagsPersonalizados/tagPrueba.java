/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagsPersonalizados;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Paul_Granados
 */
public class tagPrueba extends SimpleTagSupport{
    
    @Override
    public void doTag() throws JspException, IOException{
     JspWriter out = getJspContext().getOut();   
     out.println("Hello Word, este es mi tag, mi nombre es Paul Granados");
    } 
}

