package waslim.binar.andlima.applikasinote.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import waslim.binar.andlima.applikasinote.model.GetAllUserResponseItem
import waslim.binar.andlima.applikasinote.model.PostUserResponseItem

interface ApiService {

    @GET("user")
    fun getDataUser(
        @Query("username") username : String,
        @Query ("password") password : String
    ) : Call<List<GetAllUserResponseItem>>


    @POST("user")
    fun postDataUser(
        postRequest : PostUserResponseItem
    ) : Call<GetAllUserResponseItem>
}