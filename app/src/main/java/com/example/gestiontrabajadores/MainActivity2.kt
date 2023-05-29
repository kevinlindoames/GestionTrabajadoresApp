package com.example.gestiontrabajadores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity2 : AppCompatActivity() {

    lateinit var  recyclerView: RecyclerView
    lateinit var list: ArrayList<MyDataItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        recyclerView=findViewById(R.id.recylerView)

        list= ArrayList()

        val layoutManager=LinearLayoutManager(this)

        val retrofit: Retrofit=Retrofit.Builder().baseUrl("https://localhost:7014/")
            .addConverterFactory(GsonConverterFactory.create()).build()

        val api:ApiInterface=retrofit.create(ApiInterface::class.java)

        val call:Call<MyData> = api.getData()

        call.enqueue(object: Callback<MyData?> {
            override fun onResponse(call:Call<MyData?>, response: Response<MyData?>) {
                if (response.isSuccessful){
                    list.clear()
                }
            }

            override fun onFailure(call: Call<MyData?>, t: Throwable) {
                Toast.makeText(this@MainActivity2,"Error",Toast.LENGTH_SHORT).show()
            }

        })

    }


}