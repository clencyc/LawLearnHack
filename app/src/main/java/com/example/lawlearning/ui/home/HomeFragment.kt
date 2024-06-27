package com.example.lawlearning.ui.home

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.lawlearning.intents.Intent_one
import com.example.lawlearning.R
import com.example.lawlearning.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var img_btn: ImageView

    private var _binding: FragmentHomeBinding? = null

     // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @SuppressLint("MissingInflatedId")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Assuming you have an ImageView with the ID 'tobtn1' in your layout
        val imgBtn = view.findViewById<ImageView>(R.id.tobtn1)
        imgBtn.setOnClickListener {
            val intent = Intent(requireContext(), Intent_one::class.java)
            startActivity(intent)
        }}


}