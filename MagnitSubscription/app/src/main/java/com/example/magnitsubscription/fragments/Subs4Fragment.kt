package com.example.magnitsubscription.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.magnitsubscription.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class Subs4Fragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_subs4, container, false)
        val imVClsSub4: ImageView = view.findViewById(R.id.imVClsSub4)

        imVClsSub4.setOnClickListener {
            findNavController().navigate(R.id.action_subs4Fragment_to_subsFragment)
        }

        return view
    }
}