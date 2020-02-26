package com.pp.base.ui

import androidx.recyclerview.widget.DiffUtil.ItemCallback
import com.pp.base.data.Server

class ServerDiffCallback : ItemCallback<Server>() {

    override fun areItemsTheSame(oldServer: Server, newServer: Server): Boolean {
        return oldServer == newServer
    }

    override fun areContentsTheSame(oldItem: Server, newItem: Server) = true
}