package api.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Place(
    @SerialName("nomCentre") val centreName: String? = null,
    @SerialName("date") val dateString: String? = null,
    val isAccompanied: Boolean? = null,
    val hasDualControlCar: Boolean? = null
)