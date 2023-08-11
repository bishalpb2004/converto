package com.example.converto3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.converto3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {calculateUnit()}
    }

    private fun calculateUnit() {
        val string1 =binding.inputunit.text.toString()
        val value1=string1.toDoubleOrNull()
        val string2 =binding.textView21.text.toString()
        var value2=string2.toDoubleOrNull()
        if (binding.cm1.isChecked && binding.cm2.isChecked){
            if (value1 != null) {
                value2=value1*1
                binding.textView21.text="${value2} cm"
            }
        }
        if (binding.cm1.isChecked && binding.mm2.isChecked){
            if (value1 != null) {
                value2=value1*10
                binding.textView21.text="${value2} mm"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.cm1.isChecked && binding.metre2.isChecked){
            if (value1 != null) {
                value2=value1*0.01
                binding.textView21.text="${value2} m"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.cm1.isChecked && binding.km2.isChecked){
            if (value1 != null) {
                value2=value1*0.00001
                binding.textView21.text="${value2} km"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.mm1.isChecked && binding.cm2.isChecked){
            if (value1 != null) {
                value2=value1*0.1
                binding.textView21.text="${value2} cm"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.mm1.isChecked && binding.mm2.isChecked){
            if (value1 != null) {
                value2=value1*1
                binding.textView21.text="${value2} mm"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.mm1.isChecked && binding.metre2.isChecked){
            if (value1 != null) {
                value2=value1*0.001
                binding.textView21.text="${value2} m"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.mm1.isChecked && binding.km2.isChecked){
            if (value1 != null) {
                value2=value1*0.000001
                binding.textView21.text="${value2} km"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.km1.isChecked && binding.cm2.isChecked){
            if (value1 != null) {
                value2=value1*100000
                binding.textView21.text="${value2} cm"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.km1.isChecked && binding.mm2.isChecked){
            if (value1 != null) {
                value2=value1*1000000
                binding.textView21.text="${value2} mm"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.km1.isChecked && binding.metre2.isChecked){
            if (value1 != null) {
                value2=value1*1000
                binding.textView21.text="${value2} m"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.km1.isChecked && binding.km2.isChecked){
            if (value1 != null) {
                value2=value1*1
                binding.textView21.text="${value2} km"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.metre1.isChecked && binding.cm2.isChecked){
            if (value1 != null) {
                value2=value1*100
                binding.textView21.text="${value2} cm"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.metre1.isChecked && binding.mm2.isChecked){
            if (value1 != null) {
                value2=value1*1000
                binding.textView21.text="${value2} mm"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.metre1.isChecked && binding.metre2.isChecked){
            if (value1 != null) {
                value2=value1*1
                binding.textView21.text="${value2} m"
            }else{
                binding.textView21.text=" "
            }
        }
        if (binding.metre1.isChecked && binding.km2.isChecked){
            if (value1 != null) {
                value2=value1*0.001
                binding.textView21.text="${value2} km"
            }else{
                binding.textView21.text=" "
            }
        }
    }
}