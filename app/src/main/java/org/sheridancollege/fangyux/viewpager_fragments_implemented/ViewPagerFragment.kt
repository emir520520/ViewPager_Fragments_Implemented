package org.sheridancollege.fangyux.viewpager_fragments_implemented

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ViewPagerFragment : Fragment() {

    private var param1: String?=null

    companion object{
        var messageID="messageID"

        @JvmStatic
        fun newInstance(param1: String)=
            ViewPagerFragment().apply {
            arguments=Bundle().apply {
                putString(messageID, param1)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //Get the id from the bundle
        val message=arguments?.getString(messageID)

        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_view_pager, container, false)

        val messageTextView= view?.findViewById<View>(R.id.textView) as TextView
        val imageView=view?.findViewById<View>(R.id.imageView) as ImageView

        messageTextView.text=message

        if(message=="Janeway"){
            imageView.setImageResource(R.drawable.janeway)
        }else if(message=="Kirk"){
            imageView.setImageResource(R.drawable.kirk)
        }else if(message=="McCoy"){
            imageView.setImageResource(R.drawable.mccoy)
        }else if(message=="Sisko"){
            imageView.setImageResource(R.drawable.sisko)
        }

        return view
    }
}