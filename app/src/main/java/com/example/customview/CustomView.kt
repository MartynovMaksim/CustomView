package com.example.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View

class CustomView(context: Context, attrs: AttributeSet): View(context,attrs) {
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)
        val height = (heightSize * 0.1111).toInt()
        setMeasuredDimension(widthMeasureSpec,height)
    }
}