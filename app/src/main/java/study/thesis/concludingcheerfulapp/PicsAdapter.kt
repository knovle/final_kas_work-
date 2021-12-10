package study.thesis.concludingcheerfulapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PicsAdapter(private val picsList: List<String>) : RecyclerView.Adapter<PicsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PicsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.pics_list_item, parent, false)
        return PicsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PicsViewHolder, position: Int) {
        val pic = picsList[position]
        holder.bind(pic)
    }

    override fun getItemCount(): Int {
        return picsList.size
    }
}