package com.example.pertemuan8.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.model.siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(siswa())
    val statusUI: StateFlow<siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls:MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(nama=ls[0], gender=ls[1], alamat=ls[2])
        }
    }
}