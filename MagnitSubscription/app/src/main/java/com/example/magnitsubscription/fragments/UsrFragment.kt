package com.example.magnitsubscription.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.magnitsubscription.R
import com.google.android.material.snackbar.Snackbar

class UsrFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_usr, container, false)
        val tvSupport: View = view.findViewById(R.id.tvSupport)
        val tvNotif: View = view.findViewById(R.id.tvNotif)
        val tvInfo: View = view.findViewById(R.id.tvInfo)
        val tvEx: View = view.findViewById(R.id.tvEx)
        val imvEdt: View = view.findViewById(R.id.imvEdt)

        tvSupport.setOnClickListener {
            findNavController().navigate(R.id.action_usrFragment_to_supportFragment)
        }

        tvNotif.setOnClickListener {
            findNavController().navigate(R.id.action_usrFragment_to_notificationFragment)
        }

        tvInfo.setOnClickListener {
            findNavController().navigate(R.id.action_usrFragment_to_infoFragment)
        }

        tvEx.setOnClickListener { view ->
            Snackbar.make(view, R.string.dev, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        imvEdt.setOnClickListener { view ->
            Snackbar.make(view, R.string.dev, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        return view
    }
}