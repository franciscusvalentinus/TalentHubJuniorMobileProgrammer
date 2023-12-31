package com.codingstuff.loginandsignup

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codingstuff.loginandsignup.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    fun isEmailValid(email: CharSequence?): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.button.setOnClickListener {
            val name = binding.nameEt.text.toString()
            val email = binding.emailEt.text.toString()
            val programStudy = binding.programStudyEt.text.toString()
            val semester = binding.semesterEt.text.toString()

            if (name.equals("") || email.equals("") || programStudy.equals("") || semester.equals("")) {
                Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()
            } else if (!isEmailValid(email)){
                Toast.makeText(this, "Your email is invalid !!", Toast.LENGTH_SHORT).show()
            } else{
                firebaseAuth.createUserWithEmailAndPassword(name, email).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, SignUpActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Succeed !!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}