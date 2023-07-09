package com.example.snakeofmyanmar.model

import com.example.snakeofmyanmar.R

class FirstAidDataProvider {
    private val firstAidDataList = ArrayList<FirstAidData>()

    init {
        firstAidDataList.add(FirstAidData("မြွေကိုက်ခံရရင်လျှင်ဘာလက္ခဏာတွေပြမလဲ?" , R.string.`မြွေကိုက်ခံရရင်လျှင်ဘာလက္ခဏာတွေပြမလဲ`))
    }

    fun getFirstAidData() = firstAidDataList
}