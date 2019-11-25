package com.example.idiusdesign.ui
import android.view.View
import android.widget.CheckedTextView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.MdRecommend

class MdRecoViewHolder (view: View): RecyclerView.ViewHolder(view){
    val imgRightCommend: ImageView = view.findViewById(R.id.imgRightCommand)
    val imgRightCommendStore: ImageView = view.findViewById(R.id.imgRightCommandStore)
    val txtRightCommendTitle: TextView = view.findViewById(R.id.txtRightCommandTitle)
    val txtRightCommendDesc: TextView = view.findViewById(R.id.txtRightCommandDesc)
    val ckRightCommendStar: CheckedTextView = view.findViewById(R.id.ckRightCommandStar)


    fun onBind(mdRecommend: MdRecommend){


        // 오른쪽 아이템 데이터 bind
        mdRecommend.imgRightMdRecoInt?.let{
            imgRightCommend.setImageResource(it)
        }
        mdRecommend.imgRightMdRecoStoreInt?.let{
            imgRightCommendStore.setImageResource(it)
        }
        txtRightCommendTitle.text = mdRecommend.txtRightMdRecoTitle
        txtRightCommendDesc.text = mdRecommend.txtRightMdRecoDesc

        ckRightCommendStar.setOnClickListener {
            ckRightCommendStar.toggle()
        }



    }

}