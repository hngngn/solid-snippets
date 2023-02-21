package com.hngngn.solid.snippets

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class SolidContext private constructor() : TemplateContextType("Solid") {
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        val name = templateActionContext.file.name
        return name.endsWith(".ts") || name.endsWith(".tsx") || name.endsWith(".js") || name.endsWith(".jsx")
    }
}