package com.securelink.ftlgen.snippets;

import com.securelink.ftlgen.Domain;

/**
 * 
 * @author <a href="mailto:duane@securelink.com">Duane Bester</a>
 *
 */

public abstract class Base {
    
    public Domain domain;
    
    public Base( Domain domain )
    {
        this.domain = domain;
    }
    
    public String getTitle()
    {   
        return domain.type.toString().toLowerCase() + domain.domainClass.getName().toLowerCase() + ".title";
    }
    
    public String getModule()
    {
        return domain.module;
    }
    
    public String getDomainName()
    {
        return domain.domainClass.getName();
    }
    
    // return */widgets/modules/slr/licenses/
    public String getWidgetModuleSubDir()
    {
        return "*/widgets/modules/" +getModule() + "/" + domain.domainClass.getName().toLowerCase() + "s/";
    }
    
    // return viewlicenseinfo.ftl
    public String getPageInfo()
    {
        return domain.type.toString().toLowerCase() + domain.domainClass.getName().toLowerCase() + "info.ftl";
    }
    
    // return viewpageicons.ftl
    public String getPageIcons()
    {
        return domain.type.toString().toLowerCase() + "pageicons.ftl";
    }


}
