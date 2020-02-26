package com.pp.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.pp.base.ui.MainActivityViewModel
import com.pp.base.ui.ServersAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val serversAdapter = ServersAdapter()
    private val viewModel by viewModel<MainActivityViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
    }

    //Correct sort order PL#1 DE#2 DE#1 NL#1 UK#1 FR#1 ES#1 US#1
    private fun initializeViews() {
        serversRecycler.adapter = serversAdapter
        synchronizeServersButton.setOnClickListener {
            //TODO
        }
    }
}
