package me.leslie.toast;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * 介绍：
 * 作者：xjzhao
 * 邮箱：mr.feeling.heart@gmail.com
 * 时间: 2017-01-04  17:10
 */

public class Toast implements IEnv{
    private static IToast mToast;

    /**
     * 必须初始化
     * @param context
     */
    public static void init(Context context) {
        if (null == mToast){
            if (null == context){
                throw new RuntimeException("Toast.init() param is null(context = null).");
            }
            mToast = new CstToast(context);
        }
    }

    /**
     * 设置显示位置。注意，是全局的位置
     * @see android.view.Gravity
     * @param xOffset
     * @param yOffset
     */
    public static void setGravity(int gravity, int xOffset, int yOffset){
        if (isNoNull()){
            mToast.setGravity(gravity, xOffset, yOffset);
        }
    }

    /**
     * 设置显示时间。注意，是全局的
     * @see #LENGTH_SHORT
     * @see #LENGTH_LONG
     */
    private static void setDuration(int duration){
        if (isNoNull()){
            mToast.setDuration(duration);
        }
    }

    /**
     * 初始化CstToast
     */
    static boolean isNoNull() {
        if (null != mToast){
            return true;
        }else {
            throw new RuntimeException("Toast is null, please invoke Toast.init() before useing Toast.");
        }
    }

    /**
     * 这个方法任何5中类型的提示都可以调用，但是调用时需要传递type字段
     *
     * @param type             详见CstToast中的TYPE定义
     * @param imgRes           没有图片资源时请传递CstToast.NO_IMG(-1)
     * @param toastTextStr     第一排文字，没有则传递null
     * @param toastBelowImgStr 第二排文字，没有则传递null
     */
    public synchronized static void show(final int type,
                                         final int imgRes,
                                         final String toastTextStr,
                                         final String toastBelowImgStr) {
        if (isNoNull()) {
            setDuration(LENGTH_SHORT);
            mToast.setContent(type, imgRes, toastTextStr, toastBelowImgStr);
        }
    }


    /***************** 下面5个show()方法分别为不同样式时的调用(短时显示) ****************************/

    /**
     * 两排显示：第一排图片加文字 ，第二排文字，这个方法中所有内容都不能传递为null
     *
     * @param imgRes
     * @param toastTextStr
     * @param toastTextStr
     */
    public synchronized static void show(final int imgRes,
                                         @NonNull final String toastTextStr,
                                         @NonNull final String toastBelowImgStr) {
        if (isNoNull()) {
            setDuration(LENGTH_SHORT);
            mToast.setHorizontalContent(imgRes, toastTextStr, toastBelowImgStr);
        }
    }

    /**
     * 一排显示图片和文字，这个方法中所有内容都不能传递为null
     *
     * @param imgRes
     * @param toastTextStr
     */
    public synchronized static void show(final int imgRes, @NonNull final String toastTextStr) {
        if (isNoNull()) {
            setDuration(LENGTH_SHORT);
            mToast.setHorizontalContent(imgRes, toastTextStr);
        }
    }

    /**
     * 只显示一排文字
     *
     * @param toastTextStr
     */
    public synchronized static void show(@NonNull final String toastTextStr) {
        if (isNoNull()) {
            setDuration(LENGTH_SHORT);
            mToast.setHorizontalContent(toastTextStr);
        }
    }

    /**
     * 只显示图片
     *
     * @param imgRes
     */
    public synchronized static void show(final int imgRes) {
        if (isNoNull()) {
            setDuration(LENGTH_SHORT);
            mToast.setHorizontalContent(imgRes);
        }
    }

    /**
     * 竖排显示：上面图片，下面文字
     *
     * @param imgRes
     * @param toastBelowImgStr
     */
    public synchronized static void showUpImgDownText(final Integer imgRes, @NonNull final String toastBelowImgStr) {
        if (isNoNull()) {
            setDuration(LENGTH_SHORT);
            mToast.setVerticalContent(imgRes, toastBelowImgStr);
        }
    }





    /**
     * 这个方法任何5中类型的提示都可以调用，但是调用时需要传递type字段
     *
     * @param type             详见CstToast中的TYPE定义
     * @param imgRes           没有图片资源时请传递CstToast.NO_IMG(-1)
     * @param toastTextStr     第一排文字，没有则传递null
     * @param toastBelowImgStr 第二排文字，没有则传递null
     */
    public synchronized static void showLong(final int type,
                                             final int imgRes,
                                             final String toastTextStr,
                                             final String toastBelowImgStr) {
        if (isNoNull()) {
            setDuration(LENGTH_LONG);
            mToast.setContent(type, imgRes, toastTextStr, toastBelowImgStr);
        }
    }

    /***************** 下面5个show()方法分别为不同样式时的调用(长时显示) ****************************/

    /**
     * 两排显示：第一排图片加文字 ，第二排文字，这个方法中所有内容都不能传递为null
     *
     * @param imgRes
     * @param toastTextStr
     * @param toastTextStr
     */
    public synchronized static void showLong(final int imgRes,
                                         @NonNull final String toastTextStr,
                                         @NonNull final String toastBelowImgStr) {
        if (isNoNull()) {
            setDuration(LENGTH_LONG);
            mToast.setHorizontalContent(imgRes, toastTextStr, toastBelowImgStr);
        }
    }

    /**
     * 一排显示图片和文字，这个方法中所有内容都不能传递为null
     *
     * @param imgRes
     * @param toastTextStr
     */
    public synchronized static void showLong(final int imgRes, @NonNull final String toastTextStr) {
        if (isNoNull()) {
            setDuration(LENGTH_LONG);
            mToast.setHorizontalContent(imgRes, toastTextStr);
        }
    }

    /**
     * 只显示一排文字
     *
     * @param toastTextStr
     */
    public synchronized static void showLong(@NonNull final String toastTextStr) {
        if (isNoNull()) {
            setDuration(LENGTH_LONG);
            mToast.setHorizontalContent(toastTextStr);
        }
    }

    /**
     * 只显示图片
     *
     * @param imgRes
     */
    public synchronized static void showLong(final int imgRes) {
        if (isNoNull()) {
            setDuration(LENGTH_LONG);
            mToast.setHorizontalContent(imgRes);
        }
    }

    /**
     * 竖排显示：上面图片，下面文字
     *
     * @param imgRes
     * @param toastBelowImgStr
     */
    public synchronized static void showUpImgDownTextLong(final Integer imgRes, @NonNull final String toastBelowImgStr) {
        if (isNoNull()) {
            setDuration(LENGTH_LONG);
            mToast.setVerticalContent(imgRes, toastBelowImgStr);
        }
    }


}
