package com.example.Equilibro.Controller.GoogleBookApi;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiModelClass{
    ArrayList<Object> items = new ArrayList<>() ;
    Object VolumeInfo  ;
    String publisher ;
    String publishedDate ;
    Object listPrice ;

    public ArrayList<Object> getItems() {
        return items;
    }

    public void setItems(ArrayList<Object> items) {
        this.items = items;
    }

    public Object getVolumeInfo() {
        return VolumeInfo;
    }

    public void setVolumeInfo(Object volumeInfo) {
        VolumeInfo = volumeInfo;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Object getListPrice() {
        return listPrice;
    }

    public void setListPrice(Object listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return "modelJson{" +
                "items=" + items +
                ", VolumeInfo=" + VolumeInfo +
                ", publisher='" + publisher + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", listPrice=" + listPrice +
                '}';
    }
}
