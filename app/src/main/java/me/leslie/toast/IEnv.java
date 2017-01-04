package me.leslie.toast;

/**
 * 介绍：
 * 作者：xjzhao
 * 邮箱：mr.feeling.heart@gmail.com
 * 时间: 2017-01-04  17:33
 */

interface IEnv {

    /**
     * Show the view or text notification for a short period of time.  This time
     * could be user-definable.  This is the default.
     */
    int LENGTH_SHORT = 0;

    /**
     * Show the view or text notification for a long period of time.  This time
     * could be user-definable.
     */
    int LENGTH_LONG = 1;

    int TYPE_TOW_ROW_IMG_STR_STR = 1; // 两排显示：第一排图片加文字，第二排文字
    int TYPE_ONE_ROW_IMG_STR = 2;     // 一排显示图片和文字
    int TYPE_ONE_ROW_STR = 3;         // 一排显文字
    int TYPE_ONE_ROW_IMG = 4;         // 一排显示图片
    int TYPE_TWO_ROW_IMG_STR = 5;     // 两排显示：第一排图片 ，第二排文字
}
