package com.utsman.hiyahiyahiya.model

import com.google.gson.annotations.SerializedName

data class MessageStatusBody(
    @SerializedName("chat_id")
    var chatId: String = "",
    @SerializedName("local_status")
    var localStatus: LocalChatStatus = LocalChatStatus.SEND
)