package org.test;

import java.util.ArrayList;
import java.util.List;

public class PojoTask3 {

	public int page;

    public int per_page;

    public  int total;

    public  int total_pages;

    public  List<Data> data;
    
    public Support support;


    public Support getSupport() {
		return support;
	}
	public void setSupport(Support support) {
		this.support = support;
	}
	public void setPage(int page){
        this.page = page;
    }
    public int getPage(){
        return this.page;
    }
    public void setPer_page(int per_page){
        this.per_page = per_page;
    }
    public int getPer_page(){
        return this.per_page;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return this.total;
    }
    public void setTotal_pages(int total_pages){
        this.total_pages = total_pages;
    }
    public int getTotal_pages(){
        return this.total_pages;
    }
    public void setData(List<Data> data){
        this.data = data;
    }
    public List<Data> getData(){
        return this.data;
    
	}
	
	
	}
    

