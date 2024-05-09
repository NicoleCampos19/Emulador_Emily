package emily.jacobo.emulador_20230089_emily

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class fragment_contactanos : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_contactanos, container, false)

        val correo = root.findViewById<TextView>(R.id.lblCorreo)
        val boton = root.findViewById<Button>(R.id.btnabout)
        boton.setOnClickListener {
            val nuevoCorreo = "Mi correo es: 20230089@ricaldone.edu.sv"
            correo.text = nuevoCorreo
        }
        return root;
    }
}