package com.example.project4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var text1: TextView
    lateinit var text2:TextView
    lateinit var chkAgree:CheckBox
    lateinit var rGroup1: RadioGroup
    lateinit var rdoDog:RadioButton
    lateinit var rdoCat:RadioButton
    lateinit var rdoRabbit:RadioButton
    lateinit var btnOk:Button
    lateinit var imgPet:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "애완동물 사진 보기"
        text1 = findViewById<TextView>(R.id.text1)
        text2= findViewById<TextView>(R.id.text2)
        chkAgree = findViewById(R.id.ChkAgree)
        rGroup1 = findViewById(R.id.Rgroup1)
        rdoDog = findViewById(R.id.RdoDog)
        rdoCat = findViewById(R.id.RdoCat)
        rdoRabbit = findViewById(R.id.RdoRabbit)
        btnOk = findViewById(R.id.BtnOk)
        imgPet = findViewById(R.id.ImgPet)

        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if(chkAgree.isChecked == true){
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                btnOk.visibility = android.view.View.VISIBLE
                imgPet.visibility = android.view.View.VISIBLE
            }else{
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnOk.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.INVISIBLE
            }
        }
        btnOk.setOnClickListener {
            when(rGroup1.checkedRadioButtonId){
                R.id.RdoDog -> imgPet.setImageResource(R.drawable.dog)
                R.id.RdoCat -> imgPet.setImageResource(R.drawable.cat)
                R.id.RdoRabbit -> imgPet.setImageResource(R.drawable.rabbit)
                else -> Toast.makeText(this,"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show()
            }

        }
    }
}