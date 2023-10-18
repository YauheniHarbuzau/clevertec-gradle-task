package ru.clevertec.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class TitlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "CLEVERTEC GRADLE TASK"
    }
}
