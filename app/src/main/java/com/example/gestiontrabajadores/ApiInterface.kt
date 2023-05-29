package com.example.gestiontrabajadores

import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {

    @GET("api/Trabajadores")
  fun getData():Call<ArrayList<MyData>>
}