package com.example.magnitsubscription.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.magnitsubscription.R
import com.example.magnitsubscription.SliderAdapter
import com.example.magnitsubscription.SliderItem
import com.google.android.material.snackbar.Snackbar
import java.lang.Math.abs

class HomeFragment : Fragment() {

    private lateinit var vp: ViewPager2
    private lateinit var vp2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        val btnChgSub: Button = view.findViewById(R.id.btnChgSub)
        val sliderItems: MutableList<SliderItem> = ArrayList()
        val sliderItems2: MutableList<SliderItem> = ArrayList()
        val cPt = CompositePageTransformer()
        val cPt2 = CompositePageTransformer()

        vp = view.findViewById(R.id.vP)
        sliderItems.add(SliderItem(R.drawable.oreo_clear))
        sliderItems.add(SliderItem(R.drawable.cheese_clear))
        sliderItems.add(SliderItem(R.drawable.sausage_clear))

        vp2 = view.findViewById(R.id.vP2)
        sliderItems2.add(SliderItem(R.drawable.vtb_x_mgnt_clear))
        sliderItems2.add(SliderItem(R.drawable.invite_clear))

        vp.adapter = SliderAdapter(sliderItems, vp)
        vp.clipToPadding = false
        vp.clipChildren = false
        vp.offscreenPageLimit = 3
        vp.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        vp2.adapter = SliderAdapter(sliderItems2, vp2)
        vp2.clipToPadding = false
        vp2.clipChildren = false
        vp2.offscreenPageLimit = 3
        vp2.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        cPt.addTransformer(MarginPageTransformer(30))
        cPt.addTransformer { page, position ->
            val r = 1 - abs(position)
            // page.scaleY = .85f + r * .25f
        }

        vp.setPageTransformer(cPt)

        cPt2.addTransformer(MarginPageTransformer(30))
        cPt2.addTransformer { page, position ->
            val r = 1 - abs(position)
            // page.scaleY = .85f + r * .25f
        }
        vp2.setPageTransformer(cPt)

        btnChgSub.setOnClickListener { view ->
            Snackbar.make(view, R.string.dev, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        return view
    }

}