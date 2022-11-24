package com.corp.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        addHelloTask(project)
    }

    void addHelloTask(Project project) {
        def map = [description: "Hello task", group: "Andrey", type: DefaultTask]

        project.task(map,"hello") {
            println "configuration phase. Task hello"

            doLast {
                println "execution phase, Action1"
            }
        }
    }
}
