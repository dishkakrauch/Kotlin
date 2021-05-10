package com.example.magnitsubscription.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.magnitsubscription.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar

class Subs1Fragment : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_subs1, container, false)
        val imVClsSub1: ImageView = view.findViewById(R.id.imVClsSub1)
        val btnSub1Gt: Button = view.findViewById(R.id.btnSub1Gt)

        imVClsSub1.setOnClickListener {
            findNavController().navigate(R.id.action_subs1Fragment_to_subsFragment)
        }

        return view
    }
}