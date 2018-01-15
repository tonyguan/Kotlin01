/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

package a51work6.com.labelbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //通过id获得OK按钮对象
        val btnOK = findViewById<Button>(R.id.button)

        //注册事件监听器
        btnOK.setOnClickListener(object : View.OnClickListener {
            /*
            * 实现View.OnClickListener接口方法
            */
            override fun onClick(v: View?) {
                val text = findViewById<TextView>(R.id.textView)
                text.text = "HelloWorld"
            }
        })
    }
}
