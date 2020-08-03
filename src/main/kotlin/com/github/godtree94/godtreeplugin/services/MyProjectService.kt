package com.github.godtree94.godtreeplugin.services

import com.intellij.openapi.project.Project
import com.github.godtree94.godtreeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
