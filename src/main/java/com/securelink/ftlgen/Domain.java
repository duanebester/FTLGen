package com.securelink.ftlgen;

import com.securelink.ftlgen.types.Type;

/**
 * 
 * @author <a href="mailto:duane@securelink.com">Duane Bester</a>
 *
 */

public class Domain {
    
    public Class domainClass;
    public String module;
    public Type type;
    
    public Domain( Class domainClass, String module, Type type )
    {
        this.domainClass = domainClass;
        this.module = module;
        this.type = type;
    }

}
