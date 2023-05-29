package com.example.gestiontrabajadores


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.gestiontrabajadores.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var loginButton : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "kevinlindo@hotmail.com" && binding.password.text.toString() == "181292kla") {
                Toast.makeText(this, "Login Successful!",Toast.LENGTH_SHORT).show()
                val Intent = Intent (this, MainActivity2::class.java )
                startActivity(Intent)

            }else{
                Toast.makeText(this,"Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}