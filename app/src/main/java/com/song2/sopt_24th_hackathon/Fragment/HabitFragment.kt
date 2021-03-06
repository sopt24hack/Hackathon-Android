package com.song2.sopt_24th_hackathon.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.song2.sopt_24th_hackathon.Adapter.PhotoRecyclerViewAdapter
import com.song2.sopt_24th_hackathon.Data.DateListData

import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.fragment_habit.*

class HabitFragment : Fragment() {
    lateinit var photoRecyclerViewAdapter : PhotoRecyclerViewAdapter
    var imageUrlArray = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_habit, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var dataList : ArrayList<DateListData> = ArrayList()
        imageUrlArray.add("https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/57336208_1714122562067955_3478487248456908800_o.jpg?_nc_cat=110&_nc_ht=scontent-icn1-1.xx&oh=37e2d4b1ab1e6797ae00db0b61ba8c1c&oe=5D2A80BE")
        imageUrlArray.add("https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/57336208_1714122562067955_3478487248456908800_o.jpg?_nc_cat=110&_nc_ht=scontent-icn1-1.xx&oh=37e2d4b1ab1e6797ae00db0b61ba8c1c&oe=5D2A80BE")
        imageUrlArray.add("https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/57336208_1714122562067955_3478487248456908800_o.jpg?_nc_cat=110&_nc_ht=scontent-icn1-1.xx&oh=37e2d4b1ab1e6797ae00db0b61ba8c1c&oe=5D2A80BE")
        imageUrlArray.add("https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/57336208_1714122562067955_3478487248456908800_o.jpg?_nc_cat=110&_nc_ht=scontent-icn1-1.xx&oh=37e2d4b1ab1e6797ae00db0b61ba8c1c&oe=5D2A80BE")
        dataList.add(DateListData("#김치 먹기", imageUrlArray) )
        dataList.add(DateListData("#일찍 자기", imageUrlArray))
        dataList.add(DateListData("#인사 하기", imageUrlArray))

        photoRecyclerViewAdapter = PhotoRecyclerViewAdapter(context!!,dataList)
        rv_habit_list.adapter = photoRecyclerViewAdapter
        rv_habit_list.layoutManager = LinearLayoutManager(context!!)
    }

}
