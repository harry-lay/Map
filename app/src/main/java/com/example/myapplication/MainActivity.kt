package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amap.api.maps.MapView

import android.app.Activity
import android.view.View
import androidx.lifecycle.Transformations.map



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class MainActivity : Activity() {
            var mMapView: MapView? = null

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                //获取地图控件引用
                mMapView = findViewById<View>(R.id.map) as MapView
                //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
                mMapView!!.onCreate(savedInstanceState)
            }

            override fun onDestroy() {
                super.onDestroy()
                //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
                mMapView!!.onDestroy()
            }

            override fun onResume() {
                super.onResume()
                //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
                mMapView!!.onResume()
            }

            override fun onPause() {
                super.onPause()
                //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
                mMapView!!.onPause()
            }

            override fun onSaveInstanceState(outState: Bundle) {
                super.onSaveInstanceState(outState)
                //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
                mMapView!!.onSaveInstanceState(outState)
            }
        }
    }

}