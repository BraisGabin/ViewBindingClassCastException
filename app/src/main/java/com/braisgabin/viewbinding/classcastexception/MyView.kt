package com.braisgabin.viewbinding.classcastexception

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.braisgabin.viewbinding.classcastexception.databinding.MyViewBinding

class MyView : FrameLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private val binding = MyViewBinding.inflate(LayoutInflater.from(context), this)

    fun bind(greeting: String, name: String) {
        binding.hello.text = greeting
        binding.world.text = name
    }
}
