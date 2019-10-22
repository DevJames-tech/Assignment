import com.google.gson.annotations.SerializedName


data class Json4Kotlin_Base (

	@SerializedName("count") val count : Int,
	@SerializedName("results") val results : List<Results>
)