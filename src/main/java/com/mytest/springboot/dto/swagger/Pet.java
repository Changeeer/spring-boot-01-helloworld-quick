package com.mytest.springboot.dto.swagger;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    @Schema(name = "宠物id", required = true)
    private long id;
    /**
     * 类型
     * @required
     */
    private Category category;
    private String name;
    /**
     * @hidden
     */
    private List<String> photoUrls = new ArrayList<String>();
    @ApiModelProperty(hidden = true)
    private List<Tag> tags = new ArrayList<Tag>();
    @ApiModelProperty(value = "状态", required = true)
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Schema(description = "pet status in the store", allowableValues = "available,pending,sold")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
