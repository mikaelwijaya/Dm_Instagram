package id.ac.ukdw.dm_ig

import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.chat_from_row.view.*

class chatFromItem(val text: String): Item<ViewHolder>(){
    override fun bind(viewHolder: ViewHolder, position: Int){
        viewHolder.itemView.textView.text = text
    }
    override fun getLayout(): Int{
        return R.layout.chat_from_row
    }
}