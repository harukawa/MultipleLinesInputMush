package com.github.harukawa

import android.app.Activity
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sentMe(view: View) {
        val data:Intent = getIntent()
        val editView = findViewById<EditText>(R.id.editText)
        val result = editView.text.toString()
        data.putExtra("replace_key", result)
        setResult(Activity.RESULT_OK, data)
        finish();
    }
}
