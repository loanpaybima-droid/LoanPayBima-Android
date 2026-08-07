package in.loanpaybima.app
import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import in.loanpaybima.app.databinding.ActivityWebBinding
class WebActivity: AppCompatActivity() {
    private lateinit var b: ActivityWebBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState); b=ActivityWebBinding.inflate(layoutInflater); setContentView(b.root)
        val title=intent.getStringExtra("title")?:"LoanPayBima"
        val url=intent.getStringExtra("url")?:"https://loanpaybima.in/"
        b.webTitle.text=title
        b.webView.settings.javaScriptEnabled=true
        b.webView.settings.domStorageEnabled=true
        b.webView.webViewClient=WebViewClient()
        b.webView.webChromeClient=WebChromeClient()
        b.webView.loadUrl(url)
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if(b.webView.canGoBack()) b.webView.goBack() else super.onBackPressed()
    }
}
