package com.company;

/**
 * Created by steven on 7/13/16.
 */
public class Button {

    private String title;
    private OnClickListener onClickLister;

    public Button(String tittle){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickLister = onClickListener;
    }

    public void onClick(){
        this.onClickLister.onClick(this.title);
    }

    public interface OnClickListener{
        public void onClick(String title);
    }
}
