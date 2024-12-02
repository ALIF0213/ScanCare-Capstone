package com.tariapp.scancare.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.tariapp.scancare.databinding.FragmentProfileBinding
import com.tariapp.scancare.ui.history.HistoryViewModel

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            btnEditProfile.setOnClickListener {
                val intent = Intent(activity, EditProfileActivity::class.java)
                startActivity(intent)
            }
            tvEditProfile.setOnClickListener {
                val intent = Intent(activity, EditProfileActivity::class.java)
                startActivity(intent)
            }
            arrowEditProfile.setOnClickListener {
                val intent = Intent(activity, EditProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}