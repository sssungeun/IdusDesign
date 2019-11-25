package com.example.idiusdesign.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.idiusdesign.R
import com.example.idiusdesign.api.GetSellingObjects
import com.example.idiusdesign.api.ServiceImpl.serviceImpl
import com.google.android.material.bottomnavigation.BottomNavigationView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    var fragment1: MainFragment? = null
    var fragment2: GoldClassFragment? = null
    var fragment3: SearchFragment? = null
    var fragment4: MypageFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragment1 = MainFragment()
        fragment2 = GoldClassFragment()
        fragment3 = SearchFragment()
        fragment4 = MypageFragment()



        supportFragmentManager.beginTransaction().replace(R.id.container, fragment1!!).commit()

        val bottomNavigation =
            findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnNavigationItemSelectedListener(
            BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.tab1 -> {
//                        Toast.makeText(
//                            applicationContext,
//                            "첫 번째 탭 선택됨.",
//                            Toast.LENGTH_LONG
//                        ).show()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container, fragment1!!).commit()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.tab2 -> {
//                        Toast.makeText(
//                            applicationContext,
//                            "두 번째 탭 선택됨.",
//                            Toast.LENGTH_LONG
//                        ).show()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container, fragment2!!).commit()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.tab3 -> {
//                        Toast.makeText(
//                            applicationContext,
//                            "세 번째 탭 선택됨.",
//                            Toast.LENGTH_LONG
//                        ).show()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container, fragment3!!).commit()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.tab4 -> {
//                        Toast.makeText(
//                            applicationContext,
//                            "세 번째 탭 선택됨.",
//                            Toast.LENGTH_LONG
//                        ).show()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container, fragment4!!).commit()
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            }
        )
    }
}




