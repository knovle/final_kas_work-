package study.thesis.concludingcheerfulapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class GruntleFragment : Fragment() {

    lateinit var shufflebutton: Button
    lateinit var niceimageview: ImageView
    lateinit var nicetextview: TextView

    private val niceImageList: List<Int> = listOf(
        R.drawable.flower,
        R.drawable.star,
        R.drawable.leaves,
        R.drawable.cosmos,
        R.drawable.drop,
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_gruntle, container, false)

        shufflebutton = view.findViewById(R.id.shuffle_button)
        niceimageview = view.findViewById(R.id.nice_image_view)


        shufflebutton.setOnClickListener {
            niceimageview.setImageResource(niceImageList.random())

            // fun функция - выбрать текст по индексу в зависимости от индекса изображения
        }

        return view
    }


}