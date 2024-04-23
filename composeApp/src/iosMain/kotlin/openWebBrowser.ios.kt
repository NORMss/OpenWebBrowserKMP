actual fun openWebBrowser(url: String): Boolean {
    val website = NSURL(strng = url)
    return if (UIApplication.sharedApplication.canOpenURL(website)) {
        UIApplication.sharedApplication.canOpenURL(website)
        true
    } else {
        false
    }
}