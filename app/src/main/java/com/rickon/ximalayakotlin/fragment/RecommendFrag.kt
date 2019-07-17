package com.rickon.ximalayakotlin.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rickon.ximalayakotlin.R

/**
 * @Description:
 * @Author:      高烁
 * @CreateDate:  2019-07-17 15:45
 * @Email:       gaoshuo521@foxmail.com
 */
class RecommendFrag : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.recommend_frag_layout, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    companion object {

        private const val TAG = "RecommendFrag"

        fun newInstance(): RecommendFrag {
            return RecommendFrag()
        }
    }
}