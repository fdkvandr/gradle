package com.corp.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class ReleaseTask extends DefaultTask{

    @Input
    boolean release

    @OutputFile
    File releaseFile

    @TaskAction
    void performRelease() {
        // project.gradle.taskGraph
        println "release in progress..."
    }
}
