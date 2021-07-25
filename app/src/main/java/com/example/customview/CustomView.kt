package com.example.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View

class CustomView(context: Context, attrs: AttributeSet): View(context,attrs) {
    private val layoutHeight: Int

    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.CustomView)
        val multiply = 0.156
        layoutHeight = (a.getLayoutDimension(R.styleable.CustomView_layout_height,1500) * multiply).toInt()
        a.recycle()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(widthMeasureSpec,layoutHeight)
    }
}