package com.github.wedadfcis.plugingtemplate.services

import com.github.wedadfcis.plugingtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
