package de.vtm_fair.app.ui.second

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import de.vtm_fair.app.R
import de.vtm_fair.app.databinding.ASecondBinding
import de.vtm_fair.app.ui.BaseActivity
import javax.inject.Inject

class SecondActivity : BaseActivity(), SecondContract.View {

    @Inject
    lateinit var presenter: SecondContract.Presenter

    private lateinit var binding: ASecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.a_second)
        setupUI()
    }

    private fun setupUI() {
        binding.button3.setOnClickListener { finish() }
    }
}