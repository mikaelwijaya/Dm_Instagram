package id.ac.ukdw.dm_ig

import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder

class pictureFromItem: Item<ViewHolder>(){
    override fun bind(viewHolder: ViewHolder, position: Int){

    }
    override fun getLayout(): Int{
        return R.layout.picture_from_row
    }
}