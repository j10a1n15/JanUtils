package com.github.j10a1n15.janutils.features

import com.github.j10a1n15.janutils.ExampleMod
import com.github.j10a1n15.janutils.utils.ChatUtils
import net.minecraftforge.client.event.ClientChatReceivedEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class ChatFeatures {

    @SubscribeEvent(receiveCanceled = true)
    fun onChatReceive(event: ClientChatReceivedEvent) {
        if (event.type.toInt() == 2) return

        val message = event.message.formattedText
        if (ExampleMod.config.secondCategory.chat.duplicateChatMessage) {
            ChatUtils.messageToChat(message)
        }
    }
}
