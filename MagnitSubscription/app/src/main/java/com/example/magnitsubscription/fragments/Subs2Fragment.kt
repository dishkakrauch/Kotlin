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

class Subs2Fragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_subs2, container, false)
        val imVClsSub2: ImageView = view.findViewById(R.id.imVClsSub2)
        val btnSub2Gt: Button = view.findViewById(R.id.btnSub2Gt)

        imVClsSub2.setOnClickListener {
            findNavController().navigate(R.id.action_subs2Fragment_to_subsFragment)
        }

        return view
    }
}