package de.vtm_fair.app.ui.authentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import de.vtm_fair.app.R
import de.vtm_fair.app.databinding.FAuthenticationBinding
import de.vtm_fair.app.ui.BaseFragment
import timber.log.Timber
import viewLifecycle
import java.util.concurrent.Executor
import javax.inject.Inject

class AuthenticationFragment : BaseFragment(), AuthenticationContract.View {
    private var binding: FAuthenticationBinding by viewLifecycle()

    @Inject
    lateinit var presenter: AuthenticationContract.Presenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        presenter.takeView(this)
        binding = FAuthenticationBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            findNavController().navigateUp()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.dropView()
    }

    override fun showError(error: Throwable, onClick: () -> Unit) {
        Timber.e(error)
    }

    override fun showError(messageResId: Int, onClick: () -> Unit) {

    }

    override fun showUserLoggdInDialog() {

    }
}