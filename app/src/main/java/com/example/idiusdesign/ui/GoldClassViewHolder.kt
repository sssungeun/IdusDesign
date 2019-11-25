package com.example.idiusdesign.ui

import android.view.View
import android.widget.CheckedTextView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.GoldClassItemData

class GoldClassViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val ivThumbnail : ImageView = itemView.findViewById(R.id.iv_item_goldclass_thumbnail)
    val ivProfile : ImageView = itemView.findViewById(R.id.iv_item_goldclass_profile)
    val tvTitle : TextView = itemView.findViewById(R.id.tv_item_goldclass_title)
    val tvStore : TextView = itemView.findViewById(R.id.tv_item_goldclass_store)
    val checkedStar: CheckedTextView = itemView.findViewById(R.id.ck_goldclass_star)

    fun bind(data : GoldClassItemData){
        ivThumbnail.setImageResource(data.ivThumbnail!!)
        ivProfile.setImageResource(data.ivProfile!!)
        tvTitle.text = data.tvTitle
        tvStore.text = data.tvStore
        checkedStar.isChecked = data.isCheckedStar

        checkedStar.setOnClickListener {
            if(checkedStar.isChecked == true){
                checkedStar.isChecked = false
            }else{
                checkedStar.isChecked = true
            }
        }


    }
}