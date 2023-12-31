package com.example.protalktime.data.model.profile

import com.example.protalktime.data.model.common.Header
import com.google.gson.annotations.SerializedName

data class ProfileResponse(
    @SerializedName("header")
    val header: Header,
    @SerializedName("body")
    val body: ProfileResponseResult
)
data class MyProfileResponse(
    @SerializedName("header")
    val header: Header,
    @SerializedName("body")
    val body: MyProfileResponseResult
)
data class ProfileResponseResult(
    @SerializedName("id")
    val id: Int,
    @SerializedName("memberProfileUrl")
    val memberProfileUrl: String,
    @SerializedName("nickName")
    val nickName: String,

    @SerializedName("sex")
    val sex: String,

    @SerializedName("studentNum")
    val studentNum: Int,

    @SerializedName("allergy")
    val allergy: List<String>,
    @SerializedName("favor")
    val favor: List<String>,
    @SerializedName("nonFavor")
    val nonFavor: List<String>,

    @SerializedName("rating")
    val rating: List<String>,

)
data class MyProfileResponseResult(
    @SerializedName("id")
    val id: Int,
    @SerializedName("memberProfileUrl")
    val memberProfileUrl: String,
    @SerializedName("nickName")
    val nickName: String,

    @SerializedName("sex")
    val sex: String,

    @SerializedName("studentNum")
    val studentNum: Int,

    @SerializedName("allergy")
    val allergy: List<String>,
    @SerializedName("favor")
    val favor: List<String>,
    @SerializedName("nonFavor")
    val nonFavor: List<String>,

    @SerializedName("rating")
    val rating: List<String>,
    @SerializedName("good")
    val good: Int,
    @SerializedName("bad")
    val bad: Int,
    @SerializedName("goodTime")
    val goodTime: Int,
    @SerializedName("badTime")
    val badTime: Int,
    @SerializedName("goodTaste")
    val goodTaste: Int,
    @SerializedName("badTaste")
    val badTaste: Int,
    @SerializedName("funny")
    val funny: Int,
)


