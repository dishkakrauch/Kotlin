package com.example.magnitsubscription.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.magnitsubscription.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class InfoFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_info, container, false)
        val imVClsInf: ImageView = view.findViewById(R.id.imVClsInf)

        imVClsInf.setOnClickListener {
            findNavController().navigate(R.id.action_infoFragment_to_usrFragment)
        }

        return view
    }
}