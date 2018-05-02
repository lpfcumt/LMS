package edu.cumt.lpf.user.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 权限实体类
 * @time 2018年4月27日下午3:59:27
 */
public class Permission implements Serializable {
    private Integer rowid;

    private String permissionId;

    private String permissionCode;

    private String resourceType;

    private String resourceUrl;

    private String permissionPermission;

    private String pearentCode;

    private Integer permissionStatus;

    private Date createdTime;

    private Date lastUpdateTime;

    private String mark;
    
    private List<Role> roleList;

    private static final long serialVersionUID = 1L;

    public Permission(Integer rowid, String permissionId, String permissionCode, String resourceType, String resourceUrl, String permissionPermission, String pearentCode, Integer permissionStatus, Date createdTime, Date lastUpdateTime, String mark) {
        this.rowid = rowid;
        this.permissionId = permissionId;
        this.permissionCode = permissionCode;
        this.resourceType = resourceType;
        this.resourceUrl = resourceUrl;
        this.permissionPermission = permissionPermission;
        this.pearentCode = pearentCode;
        this.permissionStatus = permissionStatus;
        this.createdTime = createdTime;
        this.lastUpdateTime = lastUpdateTime;
        this.mark = mark;
    }

    public Permission() {
        super();
    }

    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public String getPermissionPermission() {
        return permissionPermission;
    }

    public void setPermissionPermission(String permissionPermission) {
        this.permissionPermission = permissionPermission == null ? null : permissionPermission.trim();
    }

    public String getPearentCode() {
        return pearentCode;
    }

    public void setPearentCode(String pearentCode) {
        this.pearentCode = pearentCode == null ? null : pearentCode.trim();
    }

    public Integer getPermissionStatus() {
        return permissionStatus;
    }

    public void setPermissionStatus(Integer permissionStatus) {
        this.permissionStatus = permissionStatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Permission other = (Permission) that;
        return (this.getRowid() == null ? other.getRowid() == null : this.getRowid().equals(other.getRowid()))
            && (this.getPermissionId() == null ? other.getPermissionId() == null : this.getPermissionId().equals(other.getPermissionId()))
            && (this.getPermissionCode() == null ? other.getPermissionCode() == null : this.getPermissionCode().equals(other.getPermissionCode()))
            && (this.getResourceType() == null ? other.getResourceType() == null : this.getResourceType().equals(other.getResourceType()))
            && (this.getResourceUrl() == null ? other.getResourceUrl() == null : this.getResourceUrl().equals(other.getResourceUrl()))
            && (this.getPermissionPermission() == null ? other.getPermissionPermission() == null : this.getPermissionPermission().equals(other.getPermissionPermission()))
            && (this.getPearentCode() == null ? other.getPearentCode() == null : this.getPearentCode().equals(other.getPearentCode()))
            && (this.getPermissionStatus() == null ? other.getPermissionStatus() == null : this.getPermissionStatus().equals(other.getPermissionStatus()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRowid() == null) ? 0 : getRowid().hashCode());
        result = prime * result + ((getPermissionId() == null) ? 0 : getPermissionId().hashCode());
        result = prime * result + ((getPermissionCode() == null) ? 0 : getPermissionCode().hashCode());
        result = prime * result + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        result = prime * result + ((getResourceUrl() == null) ? 0 : getResourceUrl().hashCode());
        result = prime * result + ((getPermissionPermission() == null) ? 0 : getPermissionPermission().hashCode());
        result = prime * result + ((getPearentCode() == null) ? 0 : getPearentCode().hashCode());
        result = prime * result + ((getPermissionStatus() == null) ? 0 : getPermissionStatus().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        return result;
    }

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
}