package com.example.snakeofmyanmar.model

class MandalayHospitalData {
    private val mandalayHospitalData = ArrayList<HospitalChildData>()
    
    init {
        mandalayHospitalData.add(HospitalChildData("ရန်ကုန်ပြည်သူ့ဆေးရုံ" , "01 256 112" , "Yangon General Hospital"))
        mandalayHospitalData.add(HospitalChildData("သုခကမ္ဘာဆေးရုံ" , "091233123" , "R4MJ+577 San Yeik Nyein, 6th Street, ရန်ကုန်"))
        mandalayHospitalData.add(HospitalChildData("ပါရမီအထွေထွေရောဂါကုဆေးရုံ" , "091233123" , "No-60, G-1, New Parami Road, Township, ရန်ကုန်"))
        mandalayHospitalData.add(HospitalChildData("ဝိတိုရိယဆေးရုံ" , "091233123" , "68 တော်ဝင်လမ်း, ရန်ကုန်"))
        mandalayHospitalData.add(HospitalChildData("အာရှတော်ဝင်ဆေးရုံ" , "091233123" , "No. 14 ဗဟိုလမ်း, ရန်ကုန်"))
        mandalayHospitalData.add(HospitalChildData("ရွှေဗဟိုဆေးရုံကြီး" , "091233123" , "No. 14 ဗဟိုလမ်း, ရန်ကုန်"))
        mandalayHospitalData.add(HospitalChildData("အာရှတော်ဝင်ဆေးရုံ" , "091233123" , "26 သမိန်ဗရမ်းလမ်း, ရန်ကုန်"))
        mandalayHospitalData.add(HospitalChildData("ခုတင်(၅၀၀)ဆံ့အထူးကုဆေးရုံကြီး" , "091233123" , "Q4MV+62H, ရန်ကုန်"))
        mandalayHospitalData.add(HospitalChildData("ပန်းလှိုင်ဆေးရုံ" , "091233123" , "Pun Hlaing Ave, ရန်ကုန်"))
        mandalayHospitalData.add(HospitalChildData("ဗဟိုရ်စည်ဆေးရုံ" , "091233123" , "Q4HQ+RX6, ရန်ကုန် 11131"))
    }
    
    fun getHospitalChildDataList() = mandalayHospitalData
}