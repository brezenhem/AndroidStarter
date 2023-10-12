package de.vtm_fair.app.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import de.vtm_fair.app.R
import de.vtm_fair.app.databinding.FDashboardBinding
import de.vtm_fair.app.ui.BaseFragment
import viewLifecycle
import javax.inject.Inject

class DashboardFragment : BaseFragment(), DashboardContract.View {
    private var binding: FDashboardBinding by viewLifecycle()

    @Inject
    lateinit var presenter: DashboardContract.Presenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        presenter.takeView(this)
        binding = FDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.requestVehicleData.setOnClickListener { presenter.requestData() }
        binding.logout.setOnClickListener {
            findNavController().navigate(DashboardFragmentDirections.actionDashboardFragmentToAuthenticationFragment())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.dropView()
    }

    override fun showReceivedData(data: Any) {
        binding.vehicleData.text = "Data received!"
    }

    override fun showAuthenticationScreen() {
        findNavController().navigate(R.id.action_dashboardFragment_to_authenticationFragment)
    }

    override fun showError(error: Throwable, onClick: () -> Unit) {
    }

    override fun showError(messageResId: Int, onClick: () -> Unit) {
    }
}