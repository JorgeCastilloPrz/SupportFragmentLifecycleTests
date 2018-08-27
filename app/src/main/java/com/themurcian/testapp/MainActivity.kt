package com.themurcian.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.fragmentContainer

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    setupFragment()
  }

  private fun setupFragment() {
    supportFragmentManager.beginTransaction()
      .apply {
        add(R.id.fragmentContainer, MainFragment(), MainFragment::class.java.simpleName)
        commit()
      }
  }

  override fun onResume() {
    super.onResume()
    fragmentContainer.postDelayed({ replaceFragmentAddingToBackStack() }, 3000)
  }

  private fun replaceFragmentAddingToBackStack() {
    supportFragmentManager.beginTransaction()
      .apply {
        addToBackStack(null)
        replace(R.id.fragmentContainer, SecondaryFragment(), SecondaryFragment::class.java.simpleName)
        commit()
      }
  }
}
