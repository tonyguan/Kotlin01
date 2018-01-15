/*
* Created by ÖÇ½İ¿ÎÌÃ
* ±¾ÊéÍøÕ¾£ºwww.51work6.com 
* ÖÇ½İ¿ÎÌÃÔÚÏßÊÓÆµ£ºwww.zhijieketang.com
* ÖÇ½İ¿ÎÌÃÎ¢ĞÅ¹«¹²ºÅ£ºzhijieketang
* ÓÊÏä£ºeorient@sina.com
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
