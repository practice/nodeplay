package org.nodeplay.node.model;

import javax.persistence.Column;
import javax.persistence.OneToOne;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class UserAuth {
	@OneToOne(optional=false)
	private AppUser user;
	
    @Column(length = 32)
    private String name;
	
    @Column(length = 32)
	private String pass;
}
