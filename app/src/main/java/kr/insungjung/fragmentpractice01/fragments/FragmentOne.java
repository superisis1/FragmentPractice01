package kr.insungjung.fragmentpractice01.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kr.insungjung.fragmentpractice01.R;
import kr.insungjung.fragmentpractice01.databinding.FragmentOneBinding;

public class FragmentOne extends Fragment {

    FragmentOneBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return inflater.inflate(R.layout.fragment_one, container, false); // (어떤 화면 그릴지, 양식에 맞게, 양식에 맞게)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_one, container, false);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

/*        TextView myTextView = getActivity().findViewById(R.id.myTextView);
        myTextView.setText("JAVA");*/


    }
}
