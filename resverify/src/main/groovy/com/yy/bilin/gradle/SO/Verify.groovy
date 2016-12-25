package com.yy.bilin.gradle.SO
import org.gradle.api.Plugin
import org.gradle.api.Project

public class Verify implements Plugin<Project> {
    void apply(Project project) {
        project.getTasks().add(MD5GenTask.class);
        project.task('Verify') << {
            println "Hello gradle plugin"
        }
    }
}