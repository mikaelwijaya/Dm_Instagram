package id.ac.ukdw.dm_ig

import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import com.google.firebase.storage.FirebaseStorage
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import java.io.File
import java.lang.StringBuilder


class MainActivity : AppCompatActivity() {

    companion object{
        val TAG = "ChatLog"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupDummyData()

        findViewById<ImageButton>(R.id.button_send).setOnClickListener{
            Log.d(TAG, "Attemp to send")
//            performSendMessage()
        }
    }

//    method kirim pesan
//    class ChatMessage(val text: String)
//    private fun performSendMessage(){
//        val text = edittext_chatlog.text.toString()
//
//        val reference = FirebaseDatabase.getInstance().getReference("/messages").push()
//
//        val chatMessage = ChatMessage(text)
//        reference.setValue(chatMessage)
//            .addOnSuccessListener {
//
//            }
//    }

    private fun setupDummyData() {

        getName("Richard james")
        getStatus("online")
        val adapter = GroupAdapter<ViewHolder>()

        adapter.add(chatFromItem(text = "hi"))
        adapter.add(chatToItem(text = "hi"))
        adapter.add(chatFromItem(text = "ini pesan masuk"))
        adapter.add(chatToItem(text = "ini kirim pesan"))
        adapter.add(stikerFromItem())
        adapter.add(stikerToItem())
        adapter.add(pictureToItem())
        adapter.add(pictureFromItem())
        adapter.add(chatToItem(text = "bye"))
        adapter.add(chatFromItem(text = "bye"))

        findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerview).adapter = adapter
    }

//    ambil gambar profile dari FireBase
//    private fun getImg(){
//        val nameImgFrom = "df96ce44cc3a3587fbc5021613dafe86.jpg"
//        val storageRef = FirebaseStorage.getInstance().reference.child("images/$nameImgFrom.jpg")
//        val localFile = File.createTempFile("temp Image", "jpg")
//
//        storageRef.getFile(localFile).addOnSuccessListener {
//            val bitmap = BitmapFactory.decodeFile(localFile.absolutePath)
//            findViewById<ImageView>(R.id.img_from).setImageBitmap(bitmap)
//        }.addOnFailureListener {
//            Toast.makeText(this, "Gagal memuat profil image", Toast.LENGTH_SHORT).show()
//        }
//
//    }

//    ambil nama dari FireBase
    private fun getName(name: String){

//        val ref = FirebaseDatabase.getInstance().getReference("/contact/name").get()
//        findViewById<TextView>(R.id.name_from).setText(ref)

        findViewById<TextView>(R.id.name_from).setText(name)
    }

//    ambil status dari FireBase
    private fun getStatus(status: String){

//        val ref = FirebaseDatabase.getInstance().getReference("/contact/status").get()
//        findViewById<TextView>(R.id.status).setText(ref)

        findViewById<TextView>(R.id.status).setText(status)
    }
}



