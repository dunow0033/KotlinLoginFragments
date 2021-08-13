package com.example.activityintents_august9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityintents_august9.databinding.ActivitySignUpCompleteBinding
import com.example.activityintents_august9.utils.FIRST_NAME_EXTRA
import com.example.activityintents_august9.utils.LAST_NAME_EXTRA
import com.example.activityintents_august9.utils.EMAIL_EXTRA
import com.example.activityintents_august9.utils.PASSWORD_EXTRA

class SignUpCompleteActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignUpCompleteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpCompleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val firstName = intent.getStringExtra(FIRST_NAME_EXTRA)
            val lastName = intent.getStringExtra(LAST_NAME_EXTRA)
            val email = intent.getStringExtra(EMAIL_EXTRA)
            //val password = intent.getStringExtra(PASSWORD_EXTRA)

            nameTv.text = firstName
            lastNameTv.text = lastName
            emailTv.text = email
            //passwordTv.text = password
        }
    }
}