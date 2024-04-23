import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent
import com.norm.myopenwebbrowserkmp.MyApplication

actual fun openWebBrowser(url: String): Boolean {
    val intent = CustomTabsIntent.Builder().build().apply {
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    }
    val context = getContext()
    return if (context != null) {
        intent.launchUrl(
            context, Uri.parse(
                url
            )
        )
        true
    } else {
        false
    }
}

fun getContext(): Context? {
    return MyApplication.instance
}