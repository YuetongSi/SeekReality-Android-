package com.example.keepreal.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import com.example.keepreal.R
import com.example.keepreal.MainActivity
import android.widget.EditText
import android.widget.Toast


class LoginActivity : AppCompatActivity() {
    private lateinit var etUseremail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 初始化控件
        etUseremail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)
        btnLogin = findViewById(R.id.btn_login)

        // 设置登录按钮点击事件
        btnLogin.setOnClickListener {
            val email = etUseremail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            // 验证用户名和密码
            if (email == "xx" && password == "123456") {
                // 登录成功，跳转到主界面
                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // 登录失败
                Toast.makeText(this, "邮箱或密码错误", Toast.LENGTH_SHORT).show()
            }
        }
    }
}