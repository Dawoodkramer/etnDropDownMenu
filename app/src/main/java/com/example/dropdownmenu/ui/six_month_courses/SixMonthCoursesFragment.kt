package com.example.dropdownmenu.ui.six_month_courses
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dropdownmenu.databinding.FragmentSixMonthCoursesBinding
import com.example.dropdownmenu.ui.six_week_courses.SixMonthCoursesViewModel


class SixMonthCoursesFragment : Fragment() {

    private var _binding: FragmentSixMonthCoursesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val sixMonthCoursesViewModel =
            ViewModelProvider(this).get(SixMonthCoursesViewModel::class.java)

        _binding = FragmentSixMonthCoursesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSixMonthCourses
        sixMonthCoursesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}