package com.hyd.mallofkotlin.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hyd.base.ui.fragment.BaseFragment
import com.hyd.base.widgets.BannerImageLoader
import com.hyd.mallofkotlin.R
import com.hyd.mallofkotlin.common.HOME_BANNER_FOUR
import com.hyd.mallofkotlin.common.HOME_BANNER_ONE
import com.hyd.mallofkotlin.common.HOME_BANNER_THREE
import com.hyd.mallofkotlin.common.HOME_BANNER_TWO
import com.youth.banner.BannerConfig
import com.youth.banner.Transformer
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by hydCoder on 2019/7/26.
 * 以梦为马，明日天涯。
 */
class HomeFragment: BaseFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBanner()
        initNews()
    }


    private fun initBanner() {
        mHomeBanner.setImageLoader(BannerImageLoader())
            .isAutoPlay(true)
            .setDelayTime(2000)
            .setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
            .setIndicatorGravity(BannerConfig.RIGHT)
            .setBannerAnimation(Transformer.Tablet)
            .setImages(listOf(HOME_BANNER_ONE, HOME_BANNER_TWO, HOME_BANNER_THREE, HOME_BANNER_FOUR))
            .start()
    }

    private fun initNews() {
        mNewsFlipperView.setData(arrayOf("夏日炎炎，第一波福利还有30秒到达战场", "新用户立领1000元优惠券", "大牌上新，诚意满满"))
    }
}