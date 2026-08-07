package in.loanpaybima.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import in.loanpaybima.app.databinding.ActivityRoleBinding

class RoleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRoleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.customerBtn.setOnClickListener {
            startActivity(Intent(this, CustomerLoginActivity::class.java))
        }

        binding.partnerBtn.setOnClickListener {
            openWeb("Partner Login", "https://loanpaybima.in/login/")
        }

        binding.adminBtn.setOnClickListener {
            openWeb("Admin Login", "https://loanpaybima.in/wp-admin/")
        }
    }

    private fun openWeb(title: String, url: String) {
        startActivity(
            Intent(this, WebActivity::class.java)
                .putExtra(WebActivity.EXTRA_TITLE, title)
                .putExtra(WebActivity.EXTRA_URL, url)
        )
    }
}
