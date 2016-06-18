package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-18.
 */
public class A11Kap10Fragment extends Fragment {


    public A11Kap10Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap10, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView542);
        String first = "Ich <font color='#EE0000'>rufe</font> dich <font color='#EE0000'>an.</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView543);
        String first1 = "Vielleicht<font color='#EE0000'> kaufe</font> ich noch was <font color='#EE0000'>ein.</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView547);
        String first2 = "Wann <font color='#EE0000'>rufst</font> du mich <font color='#EE0000'>an</font>?";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView548);
        String first3 = "<font color='#EE0000'>Rufst</font> du mich heute <font color='#EE0000'>an</font>?";
        t3.setText(Html.fromHtml(first3));

        return myInflatedView;
    }


}
