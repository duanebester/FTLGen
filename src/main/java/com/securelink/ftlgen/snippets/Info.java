package com.securelink.ftlgen.snippets;

import com.securelink.ftlgen.Domain;

/**
 * 
 * @author <a href="mailto:duane@securelink.com">Duane Bester</a>
 *
 */

public class Info extends Base {
    
    public Info ( Domain domain )
    {
        super(domain);
    }
    
    // TODO: class.getFields -> gen info
    public String get()
    {
        return "<@_widgets.labelGroup headerText=\"viewlicense.info\">\n" +
"  <@_widgets.displayLabel label=\"viewlicense.key\" value=license.key />\n" +
"  <@_widgets.displayLabel label=\"viewlicense.status\" value=license.status />\n" +
"  <@_widgets.displayLabel label=\"viewlicense.created\" value=license.created />\n" +
"  <@_widgets.displayLabel label=\"viewlicense.licenseType\" value=license.licenseType />\n" +
"  <@_widgets.displayLabel label=\"viewlicense.version\" value=license.version />\n" +
"</@>";
    }

}
