package org.wtm;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by dovbysh on 01.09.14.
 */
public class Utils {

    public static void dowloadFile(String url,String folder,String fileName) throws IOException{
        File file = new File(folder+"\\"+fileName);
        FileUtils.copyURLToFile(new URL(url),file);
    }


}
