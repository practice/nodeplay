// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.nodeplay.node.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import org.nodeplay.node.model.UserAuth;

privileged aspect UserAuth_Roo_Jpa_Entity {
    
    declare @type: UserAuth: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long UserAuth.id;
    
    @Version
    @Column(name = "version")
    private Integer UserAuth.version;
    
    public Long UserAuth.getId() {
        return this.id;
    }
    
    public void UserAuth.setId(Long id) {
        this.id = id;
    }
    
    public Integer UserAuth.getVersion() {
        return this.version;
    }
    
    public void UserAuth.setVersion(Integer version) {
        this.version = version;
    }
    
}