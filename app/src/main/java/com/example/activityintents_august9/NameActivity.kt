package com.example.activityintents_august9

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityintents_august9.databinding.ActivityNameBinding
import com.example.activityintents_august9.utils.FIRST_NAME_EXTRA
import com.example.activityintents_august9.utils.LAST_NAME_EXTRA

class NameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            nextBtn.setOnClickListener {
                // Data from edit text
                val firstName = nameEt.editText?.text.toString()
                val lastName = lastNameEt.editText?.text.toString()

                val intent = Intent(
                    this@NameActivity,
                                PasswordActivity::class.java)
                    .also {
                            it.putExtra(FIRST_NAME_EXTRA, firstName)
                            it.putExtra(LAST_NAME_EXTRA, lastName)
                }

                startActivity(intent)
            }
        }

//        companion object {
//            private val TAG = NameActivity::class.java.name
//        }
    }
}