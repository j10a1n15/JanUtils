package com.github.j10a1n15.janutils.utils

import net.minecraft.client.Minecraft
import net.minecraft.util.ChatComponentText

object ChatUtils {

    fun messageToChat(message: String) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(ChatComponentText(message))
    }
}