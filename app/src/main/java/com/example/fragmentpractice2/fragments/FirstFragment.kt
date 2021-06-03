package com.example.fragmentpractice2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentpractice2.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        changeTextBnt.setOnClickListener {

//            임시로 텍스트뷰 문구를 "안녕하세요"로 변경
            contentTxt.text = "안녕하세요"

        }
        
        toastBnt.setOnClickListener {

            Toast.makeText(context, "프래그먼트의 토스트", Toast.LENGTH_SHORT).show()
        }

    }
}