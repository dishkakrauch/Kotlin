package com.example.magnitsubscription.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.magnitsubscription.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SupportFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_support, container, false)
        val imVClsSprt: ImageView = view.findViewById(R.id.imVClsSprt)

        imVClsSprt.setOnClickListener {
            findNavController().navigate(R.id.action_supportFragment_to_usrFragment)
        }

        return view
    }
}