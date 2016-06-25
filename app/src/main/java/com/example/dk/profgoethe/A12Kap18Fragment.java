package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-25.
 */
public class A12Kap18Fragment extends Fragment {


    public A12Kap18Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap18, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView948);
        String first = "<font color='#EE0000'>soll</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView950);
        String first1 = "<font color='#EE0000'>soll</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView960);
        String first2 = "<font color='#EE0000'>Trinken Sie</font> viel!";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView961);
        String first3 = "<font color='#EE0000'>Gehen Sie</font> zum Arzt!";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView965);
        String first4 = "Schwester Angelika: &#34;<font color='#EE0000'>Geben Sie</font> ihm diesen Tee!&#34;";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView966);
        String first5 = "Schwester Angelika sagt, ich <font color='#EE0000'>soll</font> dir diesen Tee <font color='#EE0000'>geben</font>.";
        t5.setText(Html.fromHtml(first5));

        return myInflatedView;
    }


}
