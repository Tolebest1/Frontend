package com.example.frontend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import okhttp3.*
import org.json.JSONObject


class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener({
            var jsonObject: JSONObject = JSONObject()
            jsonObject.accumulate("id", username.text)
            jsonObject.accumulate("password",password.text)
            jsonObject.accumulate("type",type.text)
            var url:String = "http://118.25.153.97/api/auth/login"
            post(url,jsonObject.toString())

        })
    }
    var client: OkHttpClient = OkHttpClient()
    var JSON: MediaType? = MediaType.parse("application/json; charset=utf-8")
    fun post(url: String,string:String):String{
        var body: RequestBody = RequestBody.create(JSON,string)
        var request: Request = Request.Builder()
            .url(url)
            .post(body)
            .build();
        try {
            var response: Response = client.newCall(request).execute()
            return response.body().toString()
        }finally {

        }
    }

}


