package com.sylvanas.websocket.pojo;

public class Role {
    private Integer rId;

    private String rolename;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role that = (Role) o;

        if (rId != null ? !rId.equals(that.rId) : that.rId != null) return false;
        return rolename != null ? rolename.equals(that.rolename) : that.rolename == null;
    }

    @Override
    public int hashCode() {
        int result = rId != null ? rId.hashCode() : 0;
        result = 31 * result + (rolename != null ? rolename.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rId=" + rId +
                ", rolename='" + rolename + '\'' +
                '}';
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}