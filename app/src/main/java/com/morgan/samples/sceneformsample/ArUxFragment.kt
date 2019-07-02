package com.morgan.samples.sceneformsample

import android.os.Bundle
import com.google.ar.sceneform.AnchorNode
import com.google.ar.sceneform.rendering.ModelRenderable
import com.google.ar.sceneform.ux.ArFragment
import com.google.ar.sceneform.ux.TransformableNode

class ArUxFragment : ArFragment() {

    var modelRenderable: ModelRenderable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ModelRenderable.builder()
            .setSource(context, R.raw.boombox)
            .build()
            .thenApply { model ->
                modelRenderable = model
            }

        setOnTapArPlaneListener { hitResult, plane, motionEvent ->
            val renderable = modelRenderable ?: return@setOnTapArPlaneListener

            val anchor = hitResult.createAnchor()
            val node = AnchorNode(anchor).apply {
                setParent(arSceneView.scene)
            }
            TransformableNode(transformationSystem).apply {
                setParent(node)
                setRenderable(renderable)
                select()
            }
        }
    }
}