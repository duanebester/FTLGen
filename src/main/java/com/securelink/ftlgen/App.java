package com.securelink.ftlgen;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.LoggerFactory;

public class App
{
    public static final String PROJECT_DIR = "/Volumes/releases/dev/rss4-7dev/";

    public static final String DOMAIN_PKG = "rss.domain.";

    protected static final org.slf4j.Logger LOG = LoggerFactory.getLogger( App.class );

    /*          _      
     _ __  __ _(_)_ _  
    | '  \/ _` | | ' \ 
    |_|_|_\__,_|_|_||_|
                    
    */
    public static void main( String[] args )
    {

        if ( args.length > 2 || args.length == 0 )
        {
            LOG.error( "Usage: <Domain> <Module>" );
            System.exit( 1 );
        }

        String domain = WordUtils.capitalize( args[0] );
        
        String module = WordUtils.uncapitalize( args[1] );

        try
        {
            ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();

            String classNameToBeLoaded = DOMAIN_PKG + domain;

            Class myClass = myClassLoader.loadClass( classNameToBeLoaded );
            
            LOG.info("#### Fields:");

            for ( Field f : myClass.getFields() )
            {
                LOG.info(f.getName() + " " + f.getType() );
            }
            
            LOG.info("#### DeclaredFields:");
            
            for ( Field df : myClass.getDeclaredFields() )
            {
                LOG.info(df.getName() + " " + df.getType() );
            }
            
            LOG.info("#### Methods:");
            
            for ( Method m : myClass.getMethods() )
            {
                LOG.info(m.getName() + " return type:" + m.getReturnType());
            }
            
            LOG.info("#### DeclaredMethods:");
            
            for ( Method dm : myClass.getDeclaredMethods() )
            {
                if ( dm.getName().startsWith("get") )
                    LOG.info(dm.getName() + " return type:" + dm.getReturnType());
            }

        }
        catch ( SecurityException e )
        {
            LOG.error( e.getMessage() );
        }
        catch ( IllegalArgumentException e )
        {
             LOG.error( e.getMessage() );
        }
        catch ( ClassNotFoundException ex )
        {
             LOG.error( ex.getMessage() );
        }
    }
}
