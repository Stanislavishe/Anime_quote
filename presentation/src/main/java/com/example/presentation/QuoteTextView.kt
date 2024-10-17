package com.example.presentation

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.textview.MaterialTextView

class QuoteTextView: MaterialTextView, ShowQuote {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    override fun show(text: String) {
        setText(text)
    }

    override fun showColor(color: Int) {
        setTextColor(color)
    }
}