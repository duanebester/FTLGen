package com.securelink.ftlgen.snippets;

import com.securelink.ftlgen.Domain;

/**
 * 
 * @author <a href="mailto:duane@securelink.com">Duane Bester</a>
 *
 */

public class Html {
    
    private final Header header;
    
    public Html( Domain domain )
    {    
        header = new Header( domain );   
    }
    
    public String get()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("<html>\n");
        
        sb.append( header.get() );
        
        sb.append("</html>");
        
        return sb.toString();
    }
}
