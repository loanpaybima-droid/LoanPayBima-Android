package in.loanpaybima.app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import in.loanpaybima.app.databinding.ActivityCustomerLoginBinding

class CustomerLoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCustomerLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomerLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.portalLoginBtn.setOnClickListener {
            val identity = binding.identity.text?.toString()?.trim().orEmpty()
            val password = binding.password.text?.toString().orEmpty()

            if (identity.isBlank() || password.isBlank()) {
                Toast.makeText(
                    this,
                    "Mobile/Email aur Password enter karein.",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            // Do not transmit credentials until a secure first-party auth API is connected.
            Toast.makeText(
                this,
                "Secure API connection pending. Customer portal khola ja raha hai.",
                Toast.LENGTH_LONG
            ).show()
            openWeb("Customer Login", "https://loanpaybima.in/login/")
        }

        binding.registerBtn.setOnClickListener {
            openWeb("Customer Registration", "https://loanpaybima.in/register/")
        }

        binding.guestBtn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
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
