package com.example.activityintents_august9

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityintents_august9.databinding.ActivityPasswordBinding
import com.example.activityintents_august9.utils.FIRST_NAME_EXTRA
import com.example.activityintents_august9.utils.LAST_NAME_EXTRA
import com.example.activityintents_august9.utils.PASSWORD_EXTRA

class PasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            nextBtn.setOnClickListener{
                val intent = Intent(
                    this@PasswordActivity,
                    EmailActivity::class.java
                ).also {
                    val firstName = intent.getStringExtra(FIRST_NAME_EXTRA)
                    val lastName = intent.getStringExtra(LAST_NAME_EXTRA)
                    val password = binding.passwordEt.editText?.text

                    it.putExtra(FIRST_NAME_EXTRA, firstName)
                    it.putExtra(LAST_NAME_EXTRA, lastName)
                    it.putExtra(PASSWORD_EXTRA, password)
                }

                startActivity(intent)
            }
        }
    }
}