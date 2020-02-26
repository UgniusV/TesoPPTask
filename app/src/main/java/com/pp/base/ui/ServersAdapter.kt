package com.pp.base.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.pp.base.R
import com.pp.base.data.Server
import kotlinx.android.synthetic.main.server_cell.view.*

class ServersAdapter : ListAdapter<Server, ServersAdapter.ServerViewHolder>(ServerDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.server_cell, parent, false)
        return ServerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ServerViewHolder, position: Int) = holder.bind(position)

    inner class ServerViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(position: Int) {
            val server = getItem(position)
            view.serverName.text = server.name
            val serverIPTemplate = view.context.getString(R.string.ip_address_template)
            view.serverIP.text = serverIPTemplate.format(server.serverIP)
        }
    }
}