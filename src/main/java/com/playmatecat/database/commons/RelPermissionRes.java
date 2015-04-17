package com.playmatecat.database.commons;

public class RelPermissionRes {
    private Long id;

    private Long idPermission;

    private Long isResource;

    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(Long idPermission) {
        this.idPermission = idPermission;
    }

    public Long getIsResource() {
        return isResource;
    }

    public void setIsResource(Long isResource) {
        this.isResource = isResource;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}