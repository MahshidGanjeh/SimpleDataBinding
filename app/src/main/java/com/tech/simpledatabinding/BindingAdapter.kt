package com.tech.simpledatabinding

import android.databinding.BindingAdapter
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar

@BindingAdapter("app:hideIfZero")
fun hideIfZero(view: View, numberOfLikes: Int) {

    if (numberOfLikes == 0) {
        view.visibility = View.GONE
    } else view.visibility = View.VISIBLE

}

@BindingAdapter(value = ["app:progressScaled", "android:max"], requireAll = true)
fun setProgress(pBar: ProgressBar, numberOfLikes: Int, max: Int) {
    pBar.progress = (numberOfLikes * max / 5).coerceAtMost(max)

}

@BindingAdapter("app:setDrawable")
fun setDrawable(imgView: ImageView, num: Int) {
    if (num > 0 && num < 10) {
        imgView.setImageDrawable(
            ContextCompat.getDrawable(imgView.context, R.drawable.ic_person_black_96dp)
        )
    }
}