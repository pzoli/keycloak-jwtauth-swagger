package hu.infokristaly.keycloakauthenticatoin.entity;

// Generated 2012.09.26. 11:18:58 by Hibernate Tools 4.0.0

import jakarta.persistence.*;

/**
 * Usergroup generated by hbm2java
 */
@Entity
@Table(name = "usergroup", schema = "public")
public class Usergroup implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1631677817438656535L;
    private Long id;
    private String usergroup;

    private String rolegroup;
	@Version
	private Long version;

    public Usergroup() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "usergroupid", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "usergroup", length = 50)
    public String getUsergroup() {
        return this.usergroup;
    }

    public void setUsergroup(String usergroup) {
        this.usergroup = usergroup;
    }

    @Column(name = "rolegroup", length = 50)
	public String getRolegroup() {
		return rolegroup;
	}

	public void setRolegroup(String rolegroup) {
		this.rolegroup = rolegroup;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((rolegroup == null) ? 0 : rolegroup.hashCode());
		result = prime * result + ((usergroup == null) ? 0 : usergroup.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usergroup other = (Usergroup) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (rolegroup == null) {
			if (other.rolegroup != null)
				return false;
		} else if (!rolegroup.equals(other.rolegroup))
			return false;
		if (usergroup == null) {
			if (other.usergroup != null)
				return false;
		} else if (!usergroup.equals(other.usergroup))
			return false;
		return true;
	}
    
}
