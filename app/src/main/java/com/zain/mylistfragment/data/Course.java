package com.zain.mylistfragment.data;

import android.content.Context;

public class Course {
    private String name;
    private String image;

    public int getResourseId(Context context){
        return context.getResources().getIdentifier(this.image,"drawable",context.getPackageName());
    }
    public Course(String name, String image) {
        this.name = name;
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
