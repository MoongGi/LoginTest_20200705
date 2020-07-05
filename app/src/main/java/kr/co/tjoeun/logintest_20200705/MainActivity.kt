package kr.co.tjoeun.logintest_20200705

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            var email = emailEdit.text.toString()
            var passwd = passwdEdit.text.toString()

            if (email == "admin@test.com" && passwd == "1234")
            {
                Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
