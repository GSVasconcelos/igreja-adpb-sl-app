package com.example.assembleiadedeus.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    // LiveData: Um tipo de dado "observável" que notifica a tela quando muda
    private final MutableLiveData<String> textoSaudacao;

    public HomeViewModel() {
        textoSaudacao = new MutableLiveData<>();
        textoSaudacao.setValue("Paz do Senhor!");
    }

    public LiveData<String> getTextoSaudacao() {
        return textoSaudacao;
    }
}