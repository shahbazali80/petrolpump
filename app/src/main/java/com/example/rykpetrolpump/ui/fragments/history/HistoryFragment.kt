package com.example.rykpetrolpump.ui.fragments.history

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rykpetrolpump.R
import kotlinx.android.synthetic.main.fragment_history.*

class HistoryFragment : Fragment() {

    private var progr = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        circularOff.progress = 25
        circularService.progress = 55
        circular_cashBack.progress = 90
    }
}