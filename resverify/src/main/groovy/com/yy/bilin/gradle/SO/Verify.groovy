package com.yy.bilin.gradle.SO
import org.gradle.api.Plugin
import org.gradle.api.Project

public class Verify implements Plugin<Project> {
    void apply(Project project) {
        project.getTasks().whenTaskAdded{ task ->
            if (task.name.startsWith("merge") && task.name.endsWith("JniLibFolders")) {
                project.getTasks().create("genMD5"+task.name,MD5GenTask.class);

                task.finalizedBy "genMD5"+task.name
            }
        };
    }
}