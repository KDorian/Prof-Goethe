package com.example.dk.profgoethe;

/**
 * Created by DK on 2016-06-04.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return inflater.inflate(R.layout.fragment_a11_kap01, container, false);
    }


}