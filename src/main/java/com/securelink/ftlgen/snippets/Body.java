package com.securelink.ftlgen.snippets;

import com.securelink.ftlgen.Domain;

/**
 * 
 * @author <a href="mailto:duane@securelink.com">Duane Bester</a>
 *
 */

public class Body extends Base {
    
    public Body( Domain domain )
    {
        super(domain);
    }
    
    public String get()
    {
        return "<body>\n" +
"<div class=\"unit\">\n" +
"  <div id=\"right-column\" class=\"fixed column\" style=\"width: <@_css.oneColumnWidth/>;\">\n" +
"    <div id=\"right-column-content\">\n" +
"      <#include \"*/widgets/errors.ftl\" />\n" +
"      <#include \"*/widgets/modules/slr/licenses/viewpageicons.ftl\" />      \n" +
"      <@_widgets.pageHeading title=((license.key)!\"\")?html translate=false previousText=\"${action.getText('licenses.unregistered')}\" previousURL=\"listunreglicenses\" />\n" +
"\n" +
"      <#comment>\n" +
"      License information  --------------------------------------------------------\n" +
"      </#comment>\n" +
"      <#include \"*/widgets/modules/slr/licenses/viewlicenseinfo.ftl\"/>\n" +
"\n" +
"    </div>\n" +
"  </div>\n" +
"</div>\n" +
"</body>";
        
        
    }
}
