package in.loanpaybima.app
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import in.loanpaybima.app.databinding.ActivityDashboardBinding
class DashboardActivity: AppCompatActivity() {
    private lateinit var b: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState); b=ActivityDashboardBinding.inflate(layoutInflater); setContentView(b.root)
        b.emiBtn.setOnClickListener { openWeb("Insurance on EMI","https://loanpaybima.in/commercial-vehicle-insurance-on-emi/") }
        b.carBtn.setOnClickListener { openWeb("Car Insurance","https://loanpaybima.in/car-insurance/") }
        b.bikeBtn.setOnClickListener { openWeb("Bike Insurance","https://loanpaybima.in/bike-insurance/") }
        b.cvBtn.setOnClickListener { openWeb("Commercial Vehicle Insurance","https://loanpaybima.in/commercial-vehicle-insurance-on-emi/") }
        b.websiteBtn.setOnClickListener { openWeb("LoanPayBima","https://loanpaybima.in/") }
        b.whatsappBtn.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,Uri.parse("https://wa.me/919325280889?text=Hello%20LoanPayBima%2C%20mujhe%20insurance%20assistance%20chahiye.")))
        }
    }
    private fun openWeb(title:String,url:String){
        startActivity(Intent(this,WebActivity::class.java).putExtra("title",title).putExtra("url",url))
    }
}
