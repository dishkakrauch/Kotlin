package com.example.magnitsubscription.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.magnitsubscription.R
import com.google.android.material.snackbar.Snackbar

class SubsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_subs, container, false)
        val btnAdr: Button = view.findViewById(R.id.btnAdr)
        val imVwFml: ImageView = view.findViewById(R.id.imVwFml)
        val tvFml: TextView = view.findViewById(R.id.tvFml)
        val imVwOpt: ImageView = view.findViewById(R.id.imVwOpt)
        val tvOpt: TextView = view.findViewById(R.id.tvOpt)
        val imVwBsc: ImageView = view.findViewById(R.id.imVwBsc)
        val tvBsc: TextView = view.findViewById(R.id.tvBsc)
        val imVwInd: ImageView = view.findViewById(R.id.imVwInd)
        val tvInd: TextView = view.findViewById(R.id.tvInd)

        imVwFml.setOnClickListener {
            findNavController().navigate(R.id.action_subsFragment_to_subs1Fragment)
        }
        tvFml.setOnClickListener {
            findNavController().navigate(R.id.action_subsFragment_to_subs1Fragment)
        }

        imVwOpt.setOnClickListener {
            findNavController().navigate(R.id.action_subsFragment_to_subs2Fragment)
        }
        tvOpt.setOnClickListener {
            findNavController().navigate(R.id.action_subsFragment_to_subs2Fragment)
        }

        imVwBsc.setOnClickListener {
            findNavController().navigate(R.id.action_subsFragment_to_subs3Fragment)
        }
        tvBsc.setOnClickListener {
            findNavController().navigate(R.id.action_subsFragment_to_subs3Fragment)
        }

        imVwInd.setOnClickListener {
            findNavController().navigate(R.id.action_subsFragment_to_subs4Fragment)
        }
        tvInd.setOnClickListener {
            findNavController().navigate(R.id.action_subsFragment_to_subs4Fragment)
        }

        btnAdr.setOnClickListener { view ->
            Snackbar.make(view, R.string.dev, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        return view
    }
}