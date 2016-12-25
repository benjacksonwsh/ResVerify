package com.yy.bilin.gradle.SO;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.util.LinkedHashMap;

/**
 * Created by ben.jackson.wsh@gmail.com on 2016/12/25.
 */
public class MD5GenTask extends DefaultTask{
    private final static String TAG = "MD5GenTask";

    @TaskAction
    def genMD5(){
        String flavor = getFlavor();
        println(flavor + " md5 generating---");

        genMd5Impl(flavor);
    }

    def getFlavor(){
        String bSign = "merge";
        int pos = name.indexOf(bSign) + bSign.length();
        String eSign = "JniLibFolders";
        int end = name.indexOf(eSign);

        String flavor = "md5_default";
        if ( end > pos ){
            flavor = name.subSequence(pos,end);
        }
        return flavor;
    }

    def genMd5Impl(flavor){
        //generate and save md5 to file
    }
}
