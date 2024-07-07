package com.example.crud

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var binding: AdapterList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rcvNews)
        //recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.setHasFixedSize(true)
        val itemList = listOf(
            ItemList("Judul 1", "Backflip 21",
                "https://static.wikia.nocookie.net/parkour/images/9/94/882871_365983896844387_554345111_o.jpg/revision/latest/scale-to-width-down/1000?cb=20130514033206"),
            ItemList("Judul 2", "How to",
                "https://media.istockphoto.com/id/518801978/photo/tater-tots.jpg?s=612x612&w=0&k=20&c=cbxMvi8OErdb9jCvLxJsAVUpcbVm7-iEqHNtFtmPssk="),
            ItemList("Judul 3", "Enkripsi",
                "https://upload.wikimedia.org/wikipedia/commons/3/3c/Four-rotor-enigma.jpg")
        )
        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter
        }
    }
