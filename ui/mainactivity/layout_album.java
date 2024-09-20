package com.northcoders.record_shop_application.ui.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.northcoders.record_shop_application.model.AlbumRepository;

public class layout_album extends AndroidViewModel {
    public layout_album(@NonNull Application application) {
        super(application);
    }


    MutableLiveData mutableLiveAlbumRepository = AlbumRepository.getMutableLiveData();

}
