package com.example.snakeofmyanmar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Hospitals : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var parentList : List<HospitalData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospitals)

        var ivBack = findViewById<ImageView>(R.id.ivBack)
        recyclerView = findViewById(R.id.recyclerView)

        ivBack.setOnClickListener {
            finish()
        }



        val yangonItem = listOf<HospitalChildData>(
            HospitalChildData("ရန်ကုန်ပြည်သူ့ဆေးရုံ" , "01 256 112" , "Yangon General Hospital, Bo Gyoke Road, Yangon"),
            HospitalChildData("သုခကမ္ဘာဆေးရုံ" , "091233123" , "R4MJ+577 San Yeik Nyein, 6th Street, ရန်ကုန်"),
            HospitalChildData("ပါရမီအထွေထွေရောဂါကုဆေးရုံ" , "091233123" , "No-60, G-1, New Parami Road, Township, ရန်ကုန်"),
            HospitalChildData("ဝိတိုရိယဆေးရုံ" , "091233123" , "68 တော်ဝင်လမ်း, ရန်ကုန်"),
            HospitalChildData("အာရှတော်ဝင်ဆေးရုံ" , "091233123" , "No. 14 ဗဟိုလမ်း, ရန်ကုန်"),
            HospitalChildData("ရွှေဗဟိုဆေးရုံကြီး" , "091233123" , "No. 14 ဗဟိုလမ်း, ရန်ကုန်"),
            HospitalChildData("အာရှတော်ဝင်ဆေးရုံ" , "091233123" , "26 သမိန်ဗရမ်းလမ်း, ရန်ကုန်"),
            HospitalChildData("ခုတင်(၅၀၀)ဆံ့အထူးကုဆေးရုံကြီး" , "091233123" , "Q4MV+62H, ရန်ကုန်"),
            HospitalChildData("ပန်းလှိုင်ဆေးရုံ" , "091233123" , "Pun Hlaing Ave, ရန်ကုန်"),
            HospitalChildData("ဗဟိုရ်စည်ဆေးရုံ" , "091233123" , "Q4HQ+RX6, ရန်ကုန် 11131"),
        )



        val parentList = listOf<HospitalData>(
            HospitalData("Yangon" , R.drawable.arrow_down , yangonItem ),
        )

        recyclerView.setHasFixedSize(true)

        var adapter = Hospital_RecyclerViewAdapter(parentList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
    private fun getPhone() {}

}