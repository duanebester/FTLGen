package com.securelink.ftlgen.snippets;

import com.securelink.ftlgen.Domain;

/**
 * 
 * @author <a href="mailto:duane@securelink.com">Duane Bester</a>
 *
 */

public class Header extends Base {
    
    public Header( Domain d )
    {
        super(d);
    }
    
    public String get()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("<head>\n");
        sb.append("<title><@s.text name=\"title\" /></title>\n");
        sb.append("<meta name=\"decorator\" content=\"").append( getModule() ).append( "\" />\n");
        sb.append("<#include \"*/widgets/templatehead.ftl\"/>\n");
        sb.append("</head>\n");
        
        return sb.toString();
    }
}
