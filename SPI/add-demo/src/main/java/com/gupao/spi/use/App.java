package com.gupao.spi.use;

import com.gupao.spi.DataBaseDirver;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ServiceLoader<DataBaseDirver> serviceLoader = ServiceLoader.load(DataBaseDirver.class);
        for(DataBaseDirver db:serviceLoader){
            System.out.println(db.buildConnect("mysql"));
        }
    }
}
