// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.nodeplay.node.model;

import java.util.Date;
import org.nodeplay.node.model.AppUser;
import org.nodeplay.node.model.Node;

privileged aspect Node_Roo_JavaBean {
    
    public String Node.getTitle() {
        return this.title;
    }
    
    public void Node.setTitle(String title) {
        this.title = title;
    }
    
    public AppUser Node.getUser() {
        return this.user;
    }
    
    public void Node.setUser(AppUser user) {
        this.user = user;
    }
    
    public Date Node.getCreated() {
        return this.created;
    }
    
    public void Node.setCreated(Date created) {
        this.created = created;
    }
    
    public Date Node.getChanged() {
        return this.changed;
    }
    
    public void Node.setChanged(Date changed) {
        this.changed = changed;
    }
    
}