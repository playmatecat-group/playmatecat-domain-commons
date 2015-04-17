package com.playmatecat.database.commons;

public class Role {
    private Long id;

    private String roleName;

    private Long idChildSys;

    private Integer isEffect;

    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Long getIdChildSys() {
        return idChildSys;
    }

    public void setIdChildSys(Long idChildSys) {
        this.idChildSys = idChildSys;
    }

    public Integer getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(Integer isEffect) {
        this.isEffect = isEffect;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}