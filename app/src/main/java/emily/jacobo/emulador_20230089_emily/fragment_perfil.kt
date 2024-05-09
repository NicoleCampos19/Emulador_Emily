package emily.jacobo.emulador_20230089_emily

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class fragment_perfil : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_perfil, container, false)

        val nombre = root.findViewById<TextView>(R.id.lblNombre)
        val boton = root.findViewById<Button>(R.id.btnperfil)
        boton.setOnClickListener {
            val nuevoNombre = "Holaa, mi nombre Emily Nicole Jacobo Campos"
             nombre.text = nuevoNombre
        }
        return root;
    }
}