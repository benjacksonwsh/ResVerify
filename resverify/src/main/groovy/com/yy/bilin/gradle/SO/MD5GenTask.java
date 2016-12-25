package com.yy.bilin.gradle.SO;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * Created by ben.jackson.wsh@gmail.com on 2016/12/25.
 */
public class MD5GenTask extends DefaultTask{
    private final static String TAG = "MD5GenTask";
    @TaskAction
    public void genMd5(){
        System.out.println("genMd5() " + getProject().getName());
    }
}
