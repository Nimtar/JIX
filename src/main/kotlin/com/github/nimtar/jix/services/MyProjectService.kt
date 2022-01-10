package com.github.nimtar.jix.services

import com.intellij.openapi.project.Project
import com.github.nimtar.jix.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
