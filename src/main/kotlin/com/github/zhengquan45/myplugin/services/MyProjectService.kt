package com.github.zhengquan45.myplugin.services

import com.intellij.openapi.project.Project
import com.github.zhengquan45.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
