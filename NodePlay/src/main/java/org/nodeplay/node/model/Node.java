package org.nodeplay.node.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(table="Node")
public class Node {

	@Column(length=128)
    private String title;

	@ManyToOne
    private AppUser user;
	
	@OneToOne
	private NodeRevision currentRev;

    @Column(updatable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "S-")
    private java.util.Date created = new Date();
    
    @Column(updatable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "S-")
    private java.util.Date changed = new Date();
    
}
