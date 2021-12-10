package study.thesis.concludingcheerfulapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PicsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)  {

    private val nameTextView:TextView = itemView.findViewById(R.id.pic_name_text_view)
    private val linkTextView:TextView = itemView.findViewById(R.id.pic_link_text_view)

    fun bind(pic:Pics){

        nameTextView.text= "Название - ${pic.name}
        linkTextView.text= "Ссылка - ${pic.link}
    }

}