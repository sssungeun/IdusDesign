package com.example.idiusdesign.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckedTextView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.idiusdesign.R
import com.example.idiusdesign.data.GoldClassData
import kotlinx.android.synthetic.main.item_goldclass.view.*
import kotlinx.android.synthetic.main.rv_item_sungeun.view.*

class GoldClassRecyclerViewAdapter (val ctx: Context, val dataList: ArrayList<GoldClassData>): RecyclerView.Adapter<GoldClassRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(
            R.layout.rv_item_sungeun, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].titleImg)
            .into(holder.titleImg)
        Glide.with(ctx)
            .load(dataList[position].profileImg)
            .into(holder.profileImg)

        holder.titleName.text = dataList[position].titleName
        holder.profileName.text= dataList[position].profileName
        holder.checkedStar.isChecked = dataList[position].isCheckedStar

    }



    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleImg = itemView.findViewById(R.id.iv_class_title) as ImageView
        var profileImg = itemView.findViewById(R.id.iv_class_profile) as ImageView
        var titleName = itemView.findViewById(R.id.tv_class_profile) as TextView
        var profileName = itemView.findViewById(R.id.tv_class_profile) as TextView
        val checkedStar : CheckedTextView = itemView.findViewById((R.id.ck_goldclass_star))

    }
}

