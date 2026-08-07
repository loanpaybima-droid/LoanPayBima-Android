package in.loanpaybima.app
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import in.loanpaybima.app.databinding.ActivityLoginBinding
class LoginActivity: AppCompatActivity() {
    private lateinit var b: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState); b=ActivityLoginBinding.inflate(layoutInflater); setContentView(b.root)
        b.loginBtn.setOnClickListener {
            val id=b.identity.text?.toString()?.trim().orEmpty()
            val pw=b.password.text?.toString().orEmpty()
            if(id.isBlank()||pw.isBlank()) Toast.makeText(this,"Mobile/Email aur Password enter karein.",Toast.LENGTH_SHORT).show()
            else startActivity(Intent(this,DashboardActivity::class.java))
        }
        b.registerBtn.setOnClickListener {
            startActivity(Intent(this,WebActivity::class.java).putExtra("title","Customer Registration").putExtra("url","https://loanpaybima.in/register/"))
        }
    }
}
