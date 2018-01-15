/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

package a51work6.com.checkboxsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.CheckBox
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.TextView01)

        //注册CheckBox01监听器
        val checkbox1 = findViewById<CheckBox>(R.id.CheckBox01)
        checkbox1.setOnCheckedChangeListener { ckb, isChecked ->
            textView.text = ckb.text
        }

        //注册CheckBox2监听器
        val checkbox2 = findViewById<CheckBox>(R.id.CheckBox02)
        checkbox2.setOnCheckedChangeListener { ckb, isChecked ->
            textView.text = ckb.text
        }

        //注册CheckBox03监听器
        val checkbox3 = findViewById<CheckBox>(R.id.CheckBox03)
        checkbox3.setOnCheckedChangeListener { ckb, isChecked ->
            textView.text = ckb.text
        }

        //注册CheckBox04监听器
        val checkbox4 = findViewById<CheckBox>(R.id.CheckBox04)
        checkbox4.setOnCheckedChangeListener { ckb, isChecked ->
            textView.text = ckb.text
        }
    }

}
