package com.example.frontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.lzy.okgo.OkGo
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import org.json.JSONObject
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        OkGo.getInstance().init(this.application)
//        var builder : OkHttpClient.Builder = OkHttpClient.Builder()
//        //全局的读取超时时间
//        builder.readTimeout(OkGo.DEFAULT_MILLISECONDS,TimeUnit.MILLISECONDS)
//        //全局的写入超时时间
//        builder.writeTimeout(OkGo.DEFAULT_MILLISECONDS, TimeUnit.MILLISECONDS);
//        //全局的连接超时时间
//        builder.connectTimeout(OkGo.DEFAULT_MILLISECONDS, TimeUnit.MILLISECONDS);





        gotologin.setOnClickListener(View.OnClickListener {
            var intent:Intent = Intent()
            intent.setClass(this,login().javaClass)
            startActivity(intent)
        })
    }


}
