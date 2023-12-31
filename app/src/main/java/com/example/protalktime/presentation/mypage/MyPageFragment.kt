package com.example.protalktime.presentation.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.protalktime.R
import com.example.protalktime.databinding.FragmentMyPageBinding
import com.example.protalktime.presentation.common.BaseFragment
import com.example.protalktime.presentation.mypage.viewmodel.MyPageViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class MyPageFragment : BaseFragment<FragmentMyPageBinding>(R.layout.fragment_my_page) {
    private val myPageViewModel: MyPageViewModel by sharedViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myPageViewModel.getProfile()
//        binding.btnServerTest.setOnClickListener {
//            communityViewModel.getServerTestResult(1)
//        }

        myPageViewModel.profile.observe(viewLifecycleOwner) { profile ->
            binding.viewModel = profile
        }
    }

}