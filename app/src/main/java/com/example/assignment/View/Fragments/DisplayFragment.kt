package com.example.assignment.View.Fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import com.example.assignment.Model.Adapters.RecyclerViewAdapter
import com.example.assignment.Model.Network.Response

import com.example.assignment.R
import com.example.assignment.ViewModel.DisplayViewModel

class DisplayFragment : Fragment() {


    private lateinit var viewModel: DisplayViewModel
    private lateinit var recycerviewAdapter: RecyclerViewAdapter;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.display_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(DisplayViewModel::class.java)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getDataFromRepo();

        viewModel.getDataFromRepo().observe(this,
            Observer { response -> Toast.makeText(this.context, "data: $response", Toast.LENGTH_SHORT).show() })

    val response = Response();

        response.initNetworkCall();

    }

    private fun initRecyclerView(){

        recycerviewAdapter = RecyclerViewAdapter(viewModel.getDataFromRepo());
    }

}
