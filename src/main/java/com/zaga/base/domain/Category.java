package com.zaga.base.domain;

import lombok.Getter;
import lombok.Setter;

// Se comentan anotaciones de lombok por error en tiempo de compilacion con mapStruct
//@Getter
//@Setter
public class Category {

    private int categoryId;
    private String category;
    private boolean active;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
