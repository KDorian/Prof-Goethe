package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 01.08.2016.
 */
public class A22Kap14Fragment extends Fragment {


    public A22Kap14Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap14, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2495);
        String first = "Die P&#228;ckchen <font color='#EE0000'>wird gepackt</font>.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2496);
        String first1 = "Die Geschenke <font color='#EE0000'>werden</font> in den Karton <font color='#EE0000'>gelegt</font>.";
        t1.setText(Html.fromHtml(first1));

        return myInflatedView;
    }


}
