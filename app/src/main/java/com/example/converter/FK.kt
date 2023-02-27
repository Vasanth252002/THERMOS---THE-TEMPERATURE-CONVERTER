package com.example.converter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class FK : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fk, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fun Solution(input : String){
            var res = view.findViewById<TextView>(R.id.F2K_result)
            try {
                var inp = ((input.toDouble() - 32) * 0.559) + 273.15

                res.setText(inp.toString())
            }catch(e:Exception){
                res.setHint("Enter Numbers only")
            }
        }
        val conv_btn = view.findViewById<Button>(R.id.conv_btn_fk)
        val input_area= view.findViewById<EditText>(R.id.FKinput)
        conv_btn.setOnClickListener { Solution(input_area.getText().toString())}
    }
}