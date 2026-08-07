package in.loanpaybima.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import in.loanpaybima.app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emiBtn.setOnClickListener {
            openWeb("Insurance on EMI", "https://loanpaybima.in/commercial-vehicle-insurance-on-emi/")
        }
        binding.carBtn.setOnClickListener {
            openWeb("Car Insurance", "https://loanpaybima.in/car-insurance/")
        }
        binding.bikeBtn.setOnClickListener {
            openWeb("Bike Insurance", "https://loanpaybima.in/bike-insurance/")
        }
        binding.cvBtn.setOnClickListener {
            openWeb("Commercial Vehicle Insurance", "https://loanpaybima.in/commercial-vehicle-insurance-on-emi/")
        }
        binding.healthBtn.setOnClickListener {
            openWeb("Health Insurance", "https://loanpaybima.in/health-insurance/")
        }
        binding.termBtn.setOnClickListener {
            openWeb("Term Insurance", "https://loanpaybima.in/term-insurance/")
        }
        binding.loanBtn.setOnClickListener {
            openWeb("Personal Loan", "https://loanpaybima.in/personal-loan/")
        }
        binding.cardBtn.setOnClickListener {
            openWeb("Credit Card", "https://loanpaybima.in/credit-card/")
        }
        binding.bankBtn.setOnClickListener {
            openWeb("Online Bank Account", "https://loanpaybima.in/online-bank-account/")
        }
        binding.websiteBtn.setOnClickListener {
            openWeb("LoanPayBima", "https://loanpaybima.in/")
        }
        binding.whatsappBtn.setOnClickListener {
            val uri = Uri.parse(
                "https://wa.me/919325280889?text=Hello%20LoanPayBima%2C%20mujhe%20insurance%20assistance%20chahiye."
            )
            startActivity(Intent(Intent.ACTION_VIEW, uri))
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
