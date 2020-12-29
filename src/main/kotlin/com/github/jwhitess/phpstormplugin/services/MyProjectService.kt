package com.github.jwhitess.phpstormplugin.services

import com.intellij.openapi.project.Project
import com.github.jwhitess.phpstormplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
