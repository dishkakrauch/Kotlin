package com.example.magnitsubscription.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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
        val btnSprt: Button = view.findViewById(R.id.btnSprt)
        val btnNtf: Button = view.findViewById(R.id.btnNtf)
        val btnInf: Button = view.findViewById(R.id.btnInf)
        val btnExt: Button = view.findViewById(R.id.btnExt)
        val imvEdt: View = view.findViewById(R.id.imvEdt)
        val tvUsr: View = view.findViewById(R.id.tvUsr)
        val tvPhone: View = view.findViewById(R.id.tvPhone)

        btnSprt.setOnClickListener {
            findNavController().navigate(R.id.action_usrFragment_to_supportFragment)
        }

        btnNtf.setOnClickListener {
            findNavController().navigate(R.id.action_usrFragment_to_notificationFragment)
        }

        btnInf.setOnClickListener {
            findNavController().navigate(R.id.action_usrFragment_to_infoFragment)
        }

        btnExt.setOnClickListener { view ->
            Snackbar.make(view, R.string.dev, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        imvEdt.setOnClickListener { view ->
            Snackbar.make(view, R.string.dev, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        tvUsr.setOnClickListener { view ->
            Snackbar.make(view, R.string.dev, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        tvPhone.setOnClickListener { view ->
            Snackbar.make(view, R.string.dev, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        return view
    }
}