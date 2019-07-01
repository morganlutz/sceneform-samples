package com.morgan.samples.sceneformsample

import com.google.ar.sceneform.ux.BaseTransformableNode
import com.google.ar.sceneform.ux.SelectionVisualizer

class NoopSelectionVisualizer : SelectionVisualizer {
    override fun applySelectionVisual(node: BaseTransformableNode?) = Unit
    override fun removeSelectionVisual(node: BaseTransformableNode?) = Unit
}