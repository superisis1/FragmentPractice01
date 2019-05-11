package kr.insungjung.fragmentpractice01.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.insungjung.fragmentpractice01.R;
import kr.insungjung.fragmentpractice01.databinding.FragmentThreeBinding;
import kr.insungjung.fragmentpractice01.databinding.FragmentTwoBinding;

public class FragmentTwo extends Fragment {

    private FragmentTwoBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_two, container, false);

        return  binding.getRoot();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.descTxt.setText("두번째 프래그먼트");
    }

    public void changeTextMsg(String inputMessage) {
        binding.descTxt.setText(inputMessage);
    }
}
