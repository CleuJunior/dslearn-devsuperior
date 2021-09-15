package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "tb_role")
public class Role implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;

    public Role() { }

    public Role(Long id, String authority){
        this.id = id;
        this.authority = authority;
    }

    public Long getId() {  return id; }

    public void setId(Long id) { this.id = id; }

    public String getAuthority() { return authority; }

    public void setAuthority(String authority) { this.authority = authority; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;

        Role role = (Role) o;

        if (!id.equals(role.id)) return false;
        return authority != null ? authority.equals(role.authority) : role.authority == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (authority != null ? authority.hashCode() : 0);
        return result;
    }
}
