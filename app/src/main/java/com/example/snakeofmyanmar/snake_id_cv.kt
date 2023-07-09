package com.example.snakeofmyanmar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.ImageView
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import org.w3c.dom.Text
import kotlin.math.log

class snake_id_cv : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snake_id_cv)

        d("SNAKES ID" , "On create")
        val textView = findViewById<TextView>(R.id.tvOne)
        val textView2 = findViewById<TextView>(R.id.tvTwo)
        val cardTv = findViewById<TextView>(R.id.tvCardTwo)
        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val ivBack = findViewById<ImageView>(R.id.ivBack)
        val desc = findViewById<TextView>(R.id.tvDesc)

        //val snakeData = intent.getSerializableExtra("snakeData") as SnakeIDChildData

        textView.text = intent.getStringExtra("snakeId")
        textView2.text = intent.getStringExtra("snakeId2")
        cardTv.text = intent.getStringExtra("poison")
        val image = intent.getIntExtra("image" , 0)
        var color = intent.getIntExtra("color" , 0)
        desc.setText(getString(intent.getIntExtra("desc", 0)))
        cardTv.setTextColor(color)

        val slider1 = intent.getIntExtra("slider1" , 0)
        val slider2 = intent.getIntExtra("slider2" , 0)
        val slider3 = intent.getIntExtra("slider3" , 0)
        val slider4 = intent.getIntExtra("slider4" , 0)
        val slider5 = intent.getIntExtra("slider5" , 0)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(slider1))
        imageList.add(SlideModel(slider2))
        imageList.add(SlideModel(slider3))
        imageList.add(SlideModel(slider4))
        imageList.add(SlideModel(slider5))

        imageSlider.setImageList(imageList , ScaleTypes.FIT)

        ivBack.setOnClickListener {
            finish()
        }
    }
}