package cn.lingkou.debug

import com.github.moduth.blockcanary.BlockCanaryContext

class AppBlockCanaryContext: BlockCanaryContext() {

    override fun displayNotification(): Boolean {
        return true
    }
}