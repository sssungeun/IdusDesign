package com.example.idiusdesign.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.idiusdesign.R
import com.example.idiusdesign.data.GoldClassData
import kotlinx.android.synthetic.main.fragment_goldclass.*

class GoldClassFragment : Fragment() {

    lateinit var goldClassRecyclerViewAdapter: GoldClassRecyclerViewAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_goldclass, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        추후 서버 통신
        var datalist: ArrayList<GoldClassData> = ArrayList()
        datalist.add(
            GoldClassData(
                "https://lh3.googleusercontent.com/p_sgJfxNPCXGBRCsgd6fn3ZNQeVi7YWXqObrH8Dac4UsJ3BxCa8mfqK2ivo7iwXzb8g",
                "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg",
                "파운드케이크", "시루아네",
                "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg"
            )
        )
        datalist.add(
            GoldClassData(
                "https://lh3.googleusercontent.com/p_sgJfxNPCXGBRCsgd6fn3ZNQeVi7YWXqObrH8Dac4UsJ3BxCa8mfqK2ivo7iwXzb8g",
                "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg",
                "파운드케이크", "시루아네",
                "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg"
            )
        )
        datalist.add(
            GoldClassData(
                "https://lh3.googleusercontent.com/p_sgJfxNPCXGBRCsgd6fn3ZNQeVi7YWXqObrH8Dac4UsJ3BxCa8mfqK2ivo7iwXzb8g",
                "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg",
                "파운드케이크", "시루아네",
                "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg"
            )
        )
        datalist.add(
            GoldClassData(
                "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg",
                "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg",
                "파운드케이크", "시루아네",
                "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg"
            )
        )
        goldClassRecyclerViewAdapter = GoldClassRecyclerViewAdapter(context!!, datalist)
        rv_goldclass_sungeun.adapter = goldClassRecyclerViewAdapter
        rv_goldclass_sungeun.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}