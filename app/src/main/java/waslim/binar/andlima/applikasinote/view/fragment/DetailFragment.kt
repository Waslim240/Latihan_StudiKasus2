package waslim.binar.andlima.applikasinote.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail.*
import waslim.binar.andlima.applikasinote.R
import waslim.binar.andlima.applikasinote.local.Note

class DetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getDetail()
    }

    private fun getDetail() {
        val detail = arguments?.getParcelable<Note>("datadetail")
        judul_detail.text = detail?.judul
        catatan_detail.text = detail?.catatan
        waktu_detail.text = detail?.waktu
    }

}