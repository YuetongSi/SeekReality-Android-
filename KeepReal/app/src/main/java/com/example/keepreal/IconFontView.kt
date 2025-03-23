package com.example.keepreal

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView


class IconFontView : AppCompatTextView {
    constructor(context: Context) : super(context) {
        Init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        Init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        Init(context)
    }

    fun Init(context: Context) {
        val icon = Typeface.createFromAsset(context.assets, "iconfont.ttf")
        this.typeface = icon
    }
}