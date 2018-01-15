/*
* Created by �ǽݿ���
* ������վ��www.51work6.com 
* �ǽݿ���������Ƶ��www.zhijieketang.com
* �ǽݿ���΢�Ź����ţ�zhijieketang
* ���䣺eorient@sina.com
* 
*/

package a51work6.com.helloanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            val textView = textView {
                textSize = 30f
            }
            button("OK") {
                textSize = 30f
                onClick { textView.text = "Hello Anko!" }
            }
        }
    }
}
