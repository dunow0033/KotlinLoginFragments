package com.example.activityintents_august9

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityintents_august9.databinding.ActivityEmailBinding
import com.example.activityintents_august9.utils.EMAIL_EXTRA
import com.example.activityintents_august9.utils.FIRST_NAME_EXTRA
import com.example.activityintents_august9.utils.LAST_NAME_EXTRA
import com.example.activityintents_august9.utils.PASSWORD_EXTRA

class EmailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            nextBtn.setOnClickListener {
                // Data from edit text

                val intent = Intent(
                    this@EmailActivity,
                    SignUpCompleteActivity::class.java
                ).also {
                    val firstName = intent.getStringExtra(FIRST_NAME_EXTRA)
                    val lastName = intent.getStringExtra(LAST_NAME_EXTRA)
                    val password = intent.getStringExtra(PASSWORD_EXTRA)
                    val email = binding.emailEt.editText?.text

                    it.putExtra(FIRST_NAME_EXTRA, firstName)
                    it.putExtra(LAST_NAME_EXTRA, lastName)
                    it.putExtra(PASSWORD_EXTRA, password)
                    it.putExtra(EMAIL_EXTRA, email)
                }

                startActivity(intent)
            }
        }
    }
}