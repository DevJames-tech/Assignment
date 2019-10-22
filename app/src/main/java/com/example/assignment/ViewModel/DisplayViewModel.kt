package com.example.assignment.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import com.example.assignment.Model.Repository.DataRepository

class DisplayViewModel : ViewModel() {

    //live data is not nullable
    private  var viewModelLiveData = MutableLiveData<String>()

    private fun setDataFromRepo(): MutableLiveData<String>{

        var repoInstance = DataRepository();

        repoInstance = DataRepository().getRepositoryInstance();
        viewModelLiveData = repoInstance.getLiveData() as MutableLiveData<String>;

       return viewModelLiveData;

    }
    fun getDataFromRepo(): MutableLiveData<String>{

        return setDataFromRepo();
    }
}
