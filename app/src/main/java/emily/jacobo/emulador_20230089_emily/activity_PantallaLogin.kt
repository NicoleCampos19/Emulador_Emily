package emily.jacobo.emulador_20230089_emily

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_PantallaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pantalla_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val boton = findViewById<ImageButton>(R.id.btnIniciar)
        val txtiniciar = findViewById<TextView>(R.id.lblIniciar)

        boton.setOnClickListener {
            val pantallita = Intent(this, MainActivity::class.java)
            startActivity(pantallita)
        }
        txtiniciar.setOnClickListener {
            val pantallita = Intent(this, MainActivity::class.java)
            startActivity(pantallita)
        }
    }
}