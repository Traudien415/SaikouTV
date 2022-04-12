package ani.saikou.tv

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.leanback.app.BackgroundManager
import ani.saikou.R

class TVSearchActivity: FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val backgroundManager = BackgroundManager.getInstance(this)
        backgroundManager.attach(this.window)

        backgroundManager.color = ContextCompat.getColor(this, R.color.bg_black)

        setContentView(R.layout.tv_search_activity)
    }
}