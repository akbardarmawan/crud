package com.example.crud
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

import java.util.HashMap
import java.util.Map



class NewsAdd {
    private lateinit var title: EditText
    private lateinit var desc: EditText
    private lateinit var imageView: ImageView
    private lateinit var saveNews: Button
    private lateinit var chooseImage: Button
    private var imageUri: Uri? = null
    private lateinit var dbNews: FirebaseFirestore
    private lateinit var storage: FirebaseStorage
    private lateinit var progressDialog: ProgressDialog


}