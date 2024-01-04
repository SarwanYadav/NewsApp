package com.example.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var HorizontalLayout:HorizontalScrollView
    var List = arrayListOf<User>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerView)


        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))
        List.add(User("Sarwan Yadav", image = R.drawable.appicon))


        val layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = layoutManager



        recyclerView.adapter=ServiceAdapter(List, this@MainActivity)


    }
}