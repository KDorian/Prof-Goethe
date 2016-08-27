package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 27.08.2016.
 */
public class B12Kap14Fragment extends Fragment {


    public B12Kap14Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b12_kap14, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3964);
        String first = "<font color='#EE0000'>faszinierende</font> Einblicke = Einblicke, die faszinieren";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3978);
        String first1 = "<font color='#EE0000'>versteckte</font> Talente = Talente, die versteckt sind";
        t1.setText(Html.fromHtml(first1));

        return myInflatedView;
    }


}
