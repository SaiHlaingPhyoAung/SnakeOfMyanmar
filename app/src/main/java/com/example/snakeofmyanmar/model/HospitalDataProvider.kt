package com.example.snakeofmyanmar.model

class HospitalDataProvider {
    private val hospitalDataList = ArrayList<HospitalData>()
    
    init {
        hospitalDataList.add(HospitalData("Yangon" , YangonHospitalData().getHospitalChildDataList()))
        hospitalDataList.add(HospitalData("Mandalay" , MandalayHospitalData().getHospitalChildDataList()))
    }
    
    fun getHospitalData() = hospitalDataList
}