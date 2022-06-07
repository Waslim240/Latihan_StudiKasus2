package waslim.binar.andlima.applikasinote.model

import com.google.gson.annotations.SerializedName

data class PostUserResponseItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("username")
    val username: String
)
