package com.beyzanuraydemir.bootcamp5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    private lateinit var switchMaterial: SwitchMaterial

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchMaterial = findViewById(R.id.myswitch)

        switchMaterial.setOnCheckedChangeListener(this)


    }

    override fun onCheckedChanged(view: CompoundButton?, isChecked: Boolean) {
        if(isChecked){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
}