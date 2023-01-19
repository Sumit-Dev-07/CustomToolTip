package com.innovative.customtooltip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.TextureView
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvToolTip).setOnClickListener {
            SimpleTooltip.Builder(this)
                .anchorView(it)
                .text("Hello")
                .gravity(Gravity.END)
                .dismissOnOutsideTouch(true)
                .dismissOnInsideTouch(false)
                .modal(true)
                .animated(false)
                .transparentOverlay(false)
                .showArrow(true)
                .arrowColor(getColor(R.color.colorAccent))
                .animationDuration(2000)
                .animationPadding(SimpleTooltipUtils.pxFromDp(50f))
                .focusable(true)
                .build()
                .show()
        }

    }
}