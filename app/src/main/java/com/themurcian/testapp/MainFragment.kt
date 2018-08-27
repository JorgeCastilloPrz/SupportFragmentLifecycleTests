package com.themurcian.testapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_main, container, false)
  }

  override fun onPause() {
    super.onPause()
  }

  override fun onStop() {
    super.onStop()
  }

  override fun onDestroyView() {
    super.onDestroyView()
  }

  override fun onDestroy() {
    super.onDestroy()
  }

  override fun onDetach() {
    super.onDetach()
  }
}
