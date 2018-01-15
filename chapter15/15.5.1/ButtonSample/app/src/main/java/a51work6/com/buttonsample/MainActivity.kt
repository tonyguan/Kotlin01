/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

package a51work6.com.buttonsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ToggleButton
import android.widget.ImageButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.textView)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            text.text = "单击了Button!"
        }

        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        imageButton.setOnClickListener {
            text.text = "单击了ImageButton!"
        }

        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        toggleButton.setOnClickListener {
            text.text = "单击了ToggleButton,状态：" + toggleButton.isChecked
        }
    }
}
