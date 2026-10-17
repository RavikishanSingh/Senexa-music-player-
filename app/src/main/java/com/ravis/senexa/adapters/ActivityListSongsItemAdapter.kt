package com.ravis.senexa.adapters

import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.ravis.senexa.R
import com.ravis.senexa.activities.MusicOverviewActivity
import com.ravis.senexa.model.AlbumItem
import com.squareup.picasso.Picasso

class ActivityListSongsItemAdapter(private val data: MutableList<AlbumItem?>) :
    RecyclerView.Adapter<ActivityListSongsItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = View.inflate(parent.context, R.layout.activity_list_song_item, null)
        view.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val song = data[position] ?: return
        holder.titleText.isSelected = true
        holder.artistText.isSelected = true

        holder.titleText.text = song.albumTitle()
        holder.artistText.text = song.albumSubTitle()

        val imgUrl = song.albumCover ?: ""
        if (imgUrl.isNotEmpty()) {
            Picasso.get().load(imgUrl.toUri()).into(holder.coverImage)
        }

        holder.itemView.setOnClickListener { v ->
            v.context.startActivity(
                Intent(v.context, MusicOverviewActivity::class.java)
                    .putExtra("id", song.id)
            )
        }
    }

    override fun getItemCount(): Int = data.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleText: TextView = itemView.findViewById(R.id.title)
        val artistText: TextView = itemView.findViewById(R.id.artist)
        val coverImage: ImageView = itemView.findViewById(R.id.coverImage)
    }
}
