package study.thesis.concludingcheerfulapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AboutFragment : Fragment() {

lateinit var  picsRecyclerView: RecyclerView

override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_about, container, false)

    val picsNames: List<String> = listOf("Star", "Leaves", "Cosmos", "Flower", "Drop", "Picture", "Info", "Happiness")

    val picsLinks: List<String?> = listOf("https://www.flaticon.com/premium-icon/star_477406", "https://www.flaticon.com/free-icon/leaves_1147560", "https://www.flaticon.com/free-icon/solar-system_3049498", "https://www.flaticon.com/free-icon/macro_3601691", "https://www.flaticon.com/free-icon/drop_616546", "https://www.flaticon.com/free-icon/picture_2659360", "https://www.flaticon.com/free-icon/leaves_1147560", "https://www.flaticon.com/premium-icon/happiness_4828334" )

    picsRecyclerView = view.findViewById(R.id.pics_recycler_view)
    picsRecyclerView.layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)

    picsRecyclerView.adapter = PicsAdapter (picsNames)
    return view
    }

}