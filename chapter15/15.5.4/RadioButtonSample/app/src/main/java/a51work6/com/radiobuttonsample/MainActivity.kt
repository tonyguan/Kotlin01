/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

package a51work6.com.radiobuttonsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.TextView01)
        //注册RadioGroup1监听器
        val radioGroup1 = findViewById<RadioGroup>(R.id.RadioGroup1)
        radioGroup1.setOnCheckedChangeListener { radioGroup, checkedId ->
            val radioButton = this.findViewById<RadioButton>(checkedId)
            textView.text = radioButton.text
        }
        //注册RadioGroup2监听器
        val radioGroup2 = findViewById<RadioGroup>(R.id.RadioGroup2)
        radioGroup2.setOnCheckedChangeListener { radioGroup, checkedId ->
            val radioButton = this.findViewById<RadioButton>(checkedId)
            textView.text = radioButton.text
        }
    }
}
