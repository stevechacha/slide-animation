package com.steve.slideanimation

import android.view.View
import android.view.animation.AnimationUtils
import androidx.interpolator.view.animation.FastOutSlowInInterpolator

fun View.slideUp(animTime:Long, startOffSet:Long){
    val slideUp= AnimationUtils.loadAnimation(context,R.anim.slide_up).apply { duration=animTime
    interpolator= FastOutSlowInInterpolator()
        this.startOffset=startOffset
    }
    startAnimation(slideUp)
}