package cn.net.compose.listener

import cn.net.compose.utils.CodeHelper
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

class CodeHelperProjectListener: ProjectManagerListener {
    override fun projectOpened(project: Project) {

    }

    override fun projectClosing(project: Project) {
        CodeHelper.dialogs.remove(project)
    }
}
