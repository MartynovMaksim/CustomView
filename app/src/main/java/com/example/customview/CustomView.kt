package com.example.customview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View

class CustomView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val multiply: Float

    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.CustomView)
        multiply = a.getFloat(R.styleable.CustomView_multiply, 1.0F)
        a.recycle()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)

//        val height = (heightSize * multiply).toInt()
//        val height: Int
//
//        if (heightMode == MeasureSpec.EXACTLY) {
//            height = heightSize
//        } else height = (heightSize * multiply).toInt()

        val resolvedHeight = resolveSize((heightSize * multiply).toInt(),heightMeasureSpec)
        setMeasuredDimension(widthSize, resolvedHeight)
    }
}