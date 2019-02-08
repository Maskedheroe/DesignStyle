package com.example.hou.builder

import android.graphics.Bitmap
import android.widget.ImageView
import com.example.hou.designstyle.R

class ImageLoader private constructor() {

    //图片加载配置对象
    private var mCongfig: ImageLoaderConfig? = null

    //单例模式
    private var mSingleTon: ImageLoader? = null

    private object mHolder {
        val INSTANCE = ImageLoader()
    }

    companion object {
        fun getInstance() = mHolder.INSTANCE
    }

    public fun init(config: ImageLoaderConfig) {
        mCongfig = config
        //检查配置合法性 内部会根据配置做一些初始化操作
        checkConfig()
    }

    private fun checkConfig() {

    }

    //加载图片的方法
    public fun displayImage(imageUrl: String, imageView: ImageView) {
        val bitmap: Bitmap? = mImageCache.get(imageUrl)
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap)
            return
        }
        //添加加载请求
        submitLoadRequest(imageUrl, imageView)
    }

    private fun submitLoadRequest(imageUrl: String, imageView: ImageView) {
        //省略
    }

    public fun downLoadImage(imageUrl: String): Bitmap? {
        var bitmap: Bitmap? = null
        return bitmap
    }

}

class ImageLoaderConfig {

    //图片缓存配置对象
    var bitmapCaChe: BitMapCache = MemoryCache()

    //加载图片时的loading和加载失败时的图片配置对象
    var dispalyConfig = DisPlayConfig()

    //加载策略
    var loadPlicy = SerialPolicy()

    //线程数量,默认为CPU数量+1
    var threadCount = Runtime.getRuntime().availableProcessors() + 1 //这个方法是什么?


    class Builder {
        /*
        * 图片缓存对象
        * */
        val bitmapCache = MemoryCache()

        /**
         * 加载图片时的loading和加载失败时的图片配置对象
         * */
        val disPlayConfig = DisPlayCongfig()

        /**
         * 加载策略
         * */
        var loadPolicy = SerialPolicy()

        //线程数量
        var threadCount = Runtime.getRuntime().availableProcessors() + 1 //这个方法是什么?

        //设置线程数量
        fun setThreadCount(count: Int): Builder {
            threadCount = Math.max(1, count)
            return this
        }

        //设置缓存
        fun setCache(cache: BitmapCache): Builder {
            bitmapCache = cache
            return this
        }

        //设置图片加载中显示的图片
        fun setLoadingPlaceholder(resId: Int): Builder {
            disPlayConfig.loadingResId = resId
            return this
        }

        //设置图片加载失败时显示的图片
        fun setNotFoundPlaceholder(resId: Int): Builder {
            disPlayConfig.faileResId = resId
            return this
        }

        fun setLoadPolicy(policy: LoadPolicy): Builder {
            if (policy != null) {
                loadPolicy = policy
            }
            return this
        }

        fun applyConfig(config: ImageLoaderConfig) {
            config.bitmapCaChe = this.bitmapCache
            config.dispalyConfig = this.disPlayConfig
            config.loadPlicy = this.loadPolicy
            config.threadCount = this.threadCount
        }

        //根据已设置好的属性创建配置对象

        fun create(): ImageLoaderConfig {
            val config = ImageLoaderConfig()
            applyConfig(config)
            return config
        }

    }
}

class Test {
    /**
     *
     * 这就是Android中大多数Builder的使用场景
     * 没有出现 Director
     * XXX.Builder同时扮演了builder、ConcreteBuilder、Director角色 简化其设计
     *
     *
     * */
    fun test() {
        val config = ImageLoaderConfig.Builder()
                .setLoadingPlaceholder(R.drawable.ic_launcher_background)
                .setNotFoundPlaceholder(R.drawable.ic_launcher_background)
                .setCache(DoubldeCache(this))
                .setThreadCount(4)
                .setLoadPolicy(ReversePolicy())
                .create()

        //将配置初始化到imageLoader中
        ImageLoader.getInstance().init(config)
    }
}