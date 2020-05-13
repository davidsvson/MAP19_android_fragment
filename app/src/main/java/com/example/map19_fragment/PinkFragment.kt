package com.example.map19_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class PinkFragment : Fragment() {

    private lateinit var nameText : TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.pink_fragment,container, false)
        nameText = view.findViewById(R.id.nameText)

        return view
    }

    fun setText(text : String) {
        nameText.text = text
        Toast.makeText(requireContext(), "Text changed", Toast.LENGTH_SHORT).show()
    }

}