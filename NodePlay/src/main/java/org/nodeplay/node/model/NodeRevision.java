package org.nodeplay.node.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class NodeRevision {
	
	@ManyToOne
	private Node node;

	@Column(length=128)
	private String title;

	private String body;
	
	@ManyToOne
    private AppUser user;

    @Column(updatable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "S-")
    private java.util.Date created = new Date();
    
    // TODO remove version column. id is version.
    
}
