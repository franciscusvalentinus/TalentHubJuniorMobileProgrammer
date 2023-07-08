package com.mrx.gamestoday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mrx.gamestoday.adapter.ListCharAdapter
import com.mrx.gamestoday.db.CharData2
import com.mrx.gamestoday.model.GenshinChar

class ProfileFragment : Fragment() {
    private lateinit var rvChar: RecyclerView
    private var list: ArrayList<GenshinChar> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvChar = view.findViewById(R.id.rv_char)
        rvChar.setHasFixedSize(true)

        list.addAll(CharData2.listData)
        rvChar.layoutManager = LinearLayoutManager(context)
        val listCharAdapter = ListCharAdapter(list)
        rvChar.adapter = listCharAdapter
    }
}