package edu.iest.horadellorar

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var horarios = findViewById<Spinner>(R.id.dolordecabeza)

        fun onItemSelected(adapterView: AdapterView<*>, view: View?, i: Int, l: Long) {
            val hora = adapterView.getItemAtPosition(i).toString()
            if (i == 0) {
                Snackbar.make(adapterView, "Lo sentimos se han agotado las entradas", Snackbar.LENGTH_LONG).show()
            } else if (i == 1) {

            } else if (i == 2) {
                Snackbar.make(adapterView, "Lo sentimos se han agotado las entradas", Snackbar.LENGTH_LONG).show()
            } else if (i == 3) {

            }
            else if (i == 4) {
                Snackbar.make(adapterView, "Lo sentimos se han agotado las entradas", Snackbar.LENGTH_LONG).show()
            }else{

            }
        }



    }
}