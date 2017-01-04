package me.leslie.toast;

import android.graphics.drawable.Drawable;

/**
 * 介绍：
 * 作者：xjzhao
 * 邮箱：mr.feeling.heart@gmail.com
 * 时间: 2017-01-04  17:13
 */
interface IToast extends IEnv{

    /**
     * 设置显示位置
     * @param gravity
     * @param xOffset
     * @param yOffset
     */
    void setGravity(int gravity, int xOffset, int yOffset);

    /**
     * 显示时间
     * @param duration
     */
    void setDuration(int duration);

    /**
     * 当前已经有Toast显示时，那么只对其中的内容进行替换
     *
     * @param type
     * @param imgRes
     * @param toastTextStr
     * @param toastBelowImgStr
     */
    void setContent(final int type, final int imgRes, final String toastTextStr, final String toastBelowImgStr);

    /**
     * 当前已经有Toast显示时，那么只对其中的内容进行替换
     *
     * @param type
     * @param drawable
     * @param toastTextStr
     * @param toastBelowImgStr
     */
    void setContent(final int type, final Drawable drawable, final String toastTextStr, final String toastBelowImgStr);

    /**
     * 两排显示：第一排图片加文字 ，第二排文字
     *
     * @param imgRes
     * @param toastTextStr
     * @param toastBelowImgStr
     */
    void setHorizontalContent(final int imgRes, final String toastTextStr, final String toastBelowImgStr);

    /**
     * 两排显示：第一排图片加文字 ，第二排文字
     *
     * @param drawable
     * @param toastTextStr
     * @param toastBelowImgStr
     */
    void setHorizontalContent(final Drawable drawable, final String toastTextStr, final String toastBelowImgStr);

    /**
     * 一排显示图片和文字
     *
     * @param imgRes
     * @param toastTextStr
     */
    void setHorizontalContent(final int imgRes, final String toastTextStr);

    /**
     * 一排显示图片和文字
     *
     * @param drawable
     * @param toastTextStr
     */
    void setHorizontalContent(final Drawable drawable, final String toastTextStr);

    /**
     * 只显示一排文字
     *
     * @param toastTextStr
     */
    void setHorizontalContent(final String toastTextStr);

    /**
     * 只显示图片
     *
     * @param imgRes
     */
    void setHorizontalContent(final int imgRes);

    /**
     * 只显示图片
     *
     * @param drawable
     */
    void setHorizontalContent(final Drawable drawable);

    /**
     * 竖排显示：上面图片，下面文字
     *
     * @param imgRes
     * @param toastBelowImgStr
     */
    void setVerticalContent(final int imgRes, final String toastBelowImgStr);

    /**
     * 竖排显示：上面图片，下面文字
     *
     * @param drawable
     * @param toastBelowImgStr
     */
    void setVerticalContent(final Drawable drawable, final String toastBelowImgStr);
}
