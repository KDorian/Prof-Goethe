package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 20.08.2016.
 */
public class B11Kap07Fragment extends Fragment {


    public B11Kap07Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap07, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3520);
        String first = "Habt ihr Lust, jeden Tag die Kaninchen <font color='#EE0000'>zu</font> f&#252;ttern?";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3521);
        String first1 = "nachdenken -> Ich rate Ihnen, noch einmal nach<font color='#EE0000'>zu</font>denken.";
        t1.setText(Html.fromHtml(first1));

        return myInflatedView;
    }


}
