package com.example.dk.profgoethe;

/**
 * Created by DK on 2016-06-04.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by DK on 2016-06-02.
 */
public class A11Kap01Fragment extends Fragment {


    public A11Kap01Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap01, container,false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView89);
        String first = "komm<font color='#EE0000'>e</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView75);
        String first1 = "komm<font color='#EE0000'>st</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView79);
        String first2 = "komm<font color='#EE0000'>en</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView83);
        String first3 = "komm<font color='#EE0000'>t</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView71);
        String first4 = "hei&#223;<font color='#EE0000'>e</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView76);
        String first5 = "hei&#223;<font color='#EE0000'>t</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView80);
        String first6 = "hei&#223;<font color='#EE0000'>en</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView84);
        String first7 = "hei&#223;<font color='#EE0000'>t</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView101);
        String first8 = "Ich <font color='#EE0000'>hei&#223;e</font> Paco.";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView103);
        String first9 = "Ich <font color='#EE0000'>komme</font> aus &#214;sterreich.";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView105);
        String first10 = "Mein Name <font color='#EE0000'>ist</font> Valerie.";
        t10.setText(Html.fromHtml(first10));

        return myInflatedView;
    }


}