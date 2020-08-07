package com.zain.mylistfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.zain.mylistfragment.data.Course;
import com.zain.mylistfragment.data.CourseArrayAdapter;
import com.zain.mylistfragment.data.CourseData;

import java.util.List;

public class MyFragment extends ListFragment {
    List<Course> courses = new CourseData().courseList();
    public MyFragment(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CourseArrayAdapter adapter = new CourseArrayAdapter(getActivity(),
                R.layout.my_listitem,courses);
        setListAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment,container,false);
    }
}
