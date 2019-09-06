package com.java.personproject.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 *  @author MANCHENIKE
 *  @date 2019/8/29
 *
 **/
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getViewContentId())
        initView()
    }

    open fun initView() {}
    /**
     * 获取布局
     */
    abstract fun getViewContentId(): Int
}