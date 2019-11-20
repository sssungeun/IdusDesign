package com.example.idiusdesign.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.idiusdesign.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureMainTab()

    }
    private fun configureMainTab(){
        vp_class_list.adapter = MainPageAdapter(supportFragmentManager,4)
        vp_class_list.offscreenPageLimit = 4
        tl_bottom_tabbar.setupWithViewPager(vp_class_list)

        val navCategoryMainLayout: View = (this.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                as LayoutInflater)
            .inflate(R.layout.fragment_main_bottom_tabbar, null, false)
        tl_bottom_tabbar.getTabAt(0)!!.customView = navCategoryMainLayout.
            findViewById(R.id.ll_main_home_tab) as LinearLayout
        tl_bottom_tabbar.getTabAt(1)!!.customView = navCategoryMainLayout.
            findViewById(R.id.ll_main_class_tab) as LinearLayout
        tl_bottom_tabbar.getTabAt(2)!!.customView = navCategoryMainLayout.
            findViewById(R.id.ll_main_search_tab) as LinearLayout
        tl_bottom_tabbar.getTabAt(3)!!.customView = navCategoryMainLayout.
            findViewById(R.id.ll_main_mypage_tab) as LinearLayout

    }
}

