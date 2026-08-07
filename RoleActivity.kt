package in.loanpaybima.app
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import in.loanpaybima.app.databinding.ActivityRoleBinding
class RoleActivity: AppCompatActivity() {
    private lateinit var b: ActivityRoleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState); b=ActivityRoleBinding.inflate(layoutInflater); setContentView(b.root)
        b.customerBtn.setOnClickListener { startActivity(Intent(this, LoginActivity::class.java)) }
        b.partnerBtn.setOnClickListener { openWeb("Partner Login","https://loanpaybima.in/login/") }
        b.adminBtn.setOnClickListener { openWeb("Admin Login","https://loanpaybima.in/wp-admin/") }
    }
    private fun openWeb(title:String,url:String){
        startActivity(Intent(this,WebActivity::class.java).putExtra("title",title).putExtra("url",url))
    }
}
