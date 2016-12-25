package com.yy.bilin.gradle.SO
import org.gradle.api.Plugin
import org.gradle.api.Project

public class Verify implements Plugin<Project> {
    void apply(Project project) {
        project.getTasks().whenTaskAdded{ task ->
            if (task.name.startsWith("merge") && task.name.endsWith("JniLibFolders")) {
                task.finalizedBy MD5GenTask
            }
        };
    }
}