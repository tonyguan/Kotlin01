/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

package a51work6.com.edittextsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout.VERTICAL
import org.jetbrains.anko.button
import org.jetbrains.anko.editText
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.sdk25.coroutines.onClick


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        linearLayout {
            orientation = VERTICAL
            val username = editText {
                hint = "请输入用户名"
            }
            val pwd = editText {
                hint = "请输入密码"
                inputType = TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD
            }
            button("登录") {
                onClick { username.setText("你好我是EditText!") }
            }
        }
    }
}
