package com.example.assignment.View.Fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment.Model.Adapters.RecyclerViewAdapter
import com.example.assignment.Model.DataClasses.Post
import com.example.assignment.Model.Network.Response

import com.example.assignment.R
import com.example.assignment.ViewModel.DisplayViewModel
import kotlinx.android.synthetic.main.display_fragment.*

class DisplayFragment : Fragment() {


    private lateinit var viewModel: DisplayViewModel
    private lateinit var recycerviewAdapter: RecyclerViewAdapter;

    private val posts = arrayListOf<Post>(Post(2,2,"dasf", "oueyw")
        ,Post(1,1,"safd", "sadfdas"),
        Post(10,10,"qqqqq", "ggggggg"))




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

        //Log.d("My posts", posts.get(0).title)
        initRecyclerView()
       // Log.d("Myposts", posts.get(1).title)

    }


    private fun initRecyclerView(){

        recycerviewAdapter = RecyclerViewAdapter(posts);
        Log.d("Myposts", posts.forEach { posts.get(2)})

        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = recycerviewAdapter
    }

}
