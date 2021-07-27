package com.example.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View

class CustomView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val multiply: Float

    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.CustomView)
        multiply = a.getFloat(R.styleable.CustomView_multiply, 1.0F)
        a.recycle()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)

        val height = (heightSize * multiply).toInt()
        setMeasuredDimension(widthSize, height)
    }
}